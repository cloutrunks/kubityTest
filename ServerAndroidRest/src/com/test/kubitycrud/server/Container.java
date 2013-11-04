package com.test.kubitycrud.server;

import java.util.ArrayList;
import java.util.List;
 
import com.test.kubitycrud.model.LoginData;
public class Container
{
	 public List<LoginData> loginList;
	 
	 public List<LoginData> getUser_list() {
	 	return loginList;
	 }
	 
	 public void setUser_list(List<LoginData> loginList) {
	 	this.loginList = loginList;
	 }
	 
	 public Container()
	 {
		 loginList = new ArrayList<LoginData>();
	 }
	 
	 public Container(List<LoginData> loginList)
	 {
	 	this.loginList = loginList;
	 }

	public void setLoginData_list(List<LoginData> loginDatas) {
		
	}
 
}