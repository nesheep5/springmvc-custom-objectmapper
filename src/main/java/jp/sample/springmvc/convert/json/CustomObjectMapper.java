package jp.sample.springmvc.convert.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jp.sample.springmvc.Loggable;

public class CustomObjectMapper  extends ObjectMapper implements Loggable{

	private static final long serialVersionUID = 1L;
	
	public CustomObjectMapper() {
		getLogger().info("CustomObjectMapper");
		this.enable(SerializationFeature.INDENT_OUTPUT);
	}

	
}
