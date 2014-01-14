package com.usando.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MinhaQuartaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Button botao = new Button(getApplicationContext());
		botao.setText("Retornar informações");
		
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = getIntent();
				i.putExtra("ParametroRetorno", "Conteúdo do parametro de retorno.");
				
				setResult(1, i);
				
				finish();
			}
		});
		
		setContentView(botao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.minha_quarta, menu);
		return true;
	}

}
