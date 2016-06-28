package jp.sample.springmvc.model;

import java.util.Date;

public class User {

	private String name;
	
	private Date date = new Date();
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	@Override
	public String toString() {
		return "User [name=" + name + ", date=" + date + ", age=" + age + "]";
	}

	
	
}
