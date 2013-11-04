package com.test.kubitycrud;

import java.util.ArrayList;
import java.util.List;

import com.test.kubitycrud.model.LoginController;
import com.test.kubitycrud.model.LoginData;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GetUsersActivity extends Activity {
	private List<LoginData> lists = null;
	private List<String> listsName = null;
	private ListView listLists;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get);

		listLists = (ListView) findViewById(R.id.listView1);

		getUsers();

	}

	final void getUsers() {

		LoginController list = new LoginController();
		listsName = new ArrayList<String>();
		try {
			lists = list.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (lists != null) {
			for (LoginData login : lists) {
				if (login != null)
					listsName.add(login.getAppName() + " " + login.getLogin());
			}

			listLists.setAdapter(new ArrayAdapter<String>(getBaseContext(),
					android.R.layout.simple_list_item_1, listsName));

			listLists.setTextFilterEnabled(true);

		}
	}
}
