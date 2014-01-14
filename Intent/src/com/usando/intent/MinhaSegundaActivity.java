package com.usando.intent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MinhaSegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_minha_segunda);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.minha_segunda, menu);
		return true;
	}

}
