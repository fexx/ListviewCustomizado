package com.usando.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MinhaSetimaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent i = getIntent();
		
		String parametroRecebido = i.getExtras().getString("MeuParametro");
		
		TextView texto = new TextView(getApplicationContext());
		texto.setText(parametroRecebido);
		
		setContentView(texto);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.minha_setima, menu);
		return true;
	}

}
