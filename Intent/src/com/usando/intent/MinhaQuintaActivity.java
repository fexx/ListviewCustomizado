package com.usando.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MinhaQuintaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Button botao = new Button(getApplicationContext());
		botao.setText("Abrir outra activity");
		
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), MinhaSetimaActivity.class);
				Bundle bundle = new Bundle();
				bundle.putString("MeuParametro", "Conteúdo do meu parametro!");
				
				i.putExtras(bundle);
				
				startActivity(i);
			}
		});
		
		setContentView(botao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.minha_quinta, menu);
		return true;
	}

}
