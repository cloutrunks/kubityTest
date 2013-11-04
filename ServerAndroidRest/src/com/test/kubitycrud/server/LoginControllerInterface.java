package com.test.kubitycrud.server;


import org.restlet.resource.Get;
import org.restlet.resource.Put;
 
import com.test.kubitycrud.model.LoginData;
 
public interface LoginControllerInterface {
	 @Put
	 void create(LoginData loginData);
	 
	 @Get
	 Container getAllLogins();
	 
}