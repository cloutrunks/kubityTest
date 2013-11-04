package com.test.kubitycrud;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KubityCrudHome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button nextButton= (Button) findViewById(R.id.add_login);
		nextButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final Intent intent = new Intent(KubityCrudHome.this,
			            AddUserActivity.class);
			        startActivity(intent);
			}
		});
		
		Button searchButton= (Button) findViewById(R.id.get_logins);
		searchButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final Intent intent = new Intent(KubityCrudHome.this,
			            GetUsersActivity.class);
			        startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
