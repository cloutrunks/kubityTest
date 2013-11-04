package com.test.kubitycrud;

import com.test.kubitycrud.model.LoginController;
import com.test.kubitycrud.model.LoginData;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddUserActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create);
		System.out.println("on addUserActivity");
		Button btn = (Button) findViewById(R.id.addUser);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				addUser();
			}
		});
	}

	final void addUser() {
		final Thread checkUpdate = new Thread() {
			public void run() {
				EditText applicationName = (EditText) findViewById(R.id.app_name_inuput);
				EditText login = (EditText) findViewById(R.id.login_input);
				EditText pass = (EditText) findViewById(R.id.password_input);
				
				LoginData loginToSave = new LoginData();
				loginToSave.setAppName(applicationName.getText().toString());
				loginToSave.setLogin(login.getText().toString());
				loginToSave.setPassword(pass.getText().toString());
				final LoginController controler = new LoginController();
				try {
					controler.create(loginToSave);
				} catch (Exception e) {
					return;
				}
				final Intent intent = new Intent(AddUserActivity.this,KubityCrudHome.class);
				startActivity(intent);
			}
		};
		checkUpdate.start();
	}
}
