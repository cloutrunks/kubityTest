package com.test.kubitycrud.server;



import java.util.ArrayList;
import java.util.List;

import org.restlet.resource.ServerResource;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.test.kubitycrud.model.LoginData;

 
public class LoginController extends ServerResource implements LoginControllerInterface {
 
	 
	public LoginController() {
		
	}
	
	 @Override
	 public void create(LoginData LoginData) {
		 ObjectifyService.register(LoginData.class);
		 Objectify ofy = ObjectifyService.begin();
		 
		 LoginData tp = new LoginData();

		 ofy.put(tp);
	 }
 
	 @Override
	 public Container getAllLogins() {
		 Container content = null;
		 List<LoginData> LoginDatas = new ArrayList<LoginData>();
		 ObjectifyService.register(LoginData.class);
		 Objectify ofy = ObjectifyService.begin();
		 
		 Query<LoginData> q = ofy.query(LoginData.class);
		 
		 for (LoginData u : q)
		 LoginDatas.add(u);
		 
		 content = new Container();
		 content.setLoginData_list(LoginDatas);
		 
		 return content;
	 }


}

