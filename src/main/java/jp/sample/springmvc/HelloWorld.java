package jp.sample.springmvc;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import jp.sample.springmvc.model.User;

@RestController
public class HelloWorld {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
	public User test(User user){
		logger.info(user.toString());
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder
        .indentOutput(true)
        .dateFormat(new SimpleDateFormat("yyyy-MM-dd"));

        try {
			logger.info(builder.build().writeValueAsString(user));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
	
	
}
