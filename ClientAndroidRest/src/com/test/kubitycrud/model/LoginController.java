package com.test.kubitycrud.model;

import java.util.List;

import org.restlet.resource.ClientResource;

import android.util.Log;

import com.test.kubitycrud.service.Container;

public class LoginController {
	public final ClientResource cr = new ClientResource(
			EngineConfiguration.gae_path + "/rest/user");

	public LoginController() {
		EngineConfiguration.getInstance();
	}

	public void create(LoginData loginData) throws Exception {
		final LoginControllerInterface uci = cr
				.wrap(LoginControllerInterface.class);

		try {
			uci.create(loginData);
			Log.i("LoginController", "Creation success !");
		} catch (Exception e) {
			Log.i("LoginController", "Creation failed !");
			throw e;
		}
	}

	public List<LoginData> getAllUsers() {
		final LoginControllerInterface uci = cr
				.wrap(LoginControllerInterface.class);
		Container content = uci.getAllLogins();
		return content.getUser_list();
	}

}
