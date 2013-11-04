package com.test.kubitycrud.model;

import java.io.Serializable;
import javax.persistence.Id;

public class LoginData implements Serializable{

	private static final long serialVersionUID = -6702726266820356779L;
	@Id
	private long id;
	private String appName;
	private String login;
	private String password;
	
	
 
	public LoginData() {

	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getAppName() {
		return appName;
	}



	public void setAppName(String appName) {
		this.appName = appName;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
