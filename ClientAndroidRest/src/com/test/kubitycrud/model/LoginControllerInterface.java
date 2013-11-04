package com.test.kubitycrud.model;


import org.restlet.resource.Get;
import org.restlet.resource.Put;
 
import com.test.kubitycrud.service.Container;
 
public interface LoginControllerInterface {
	 @Put
	 void create(LoginData loginData);
	 
	 @Get
	 Container getAllLogins();
	 
}