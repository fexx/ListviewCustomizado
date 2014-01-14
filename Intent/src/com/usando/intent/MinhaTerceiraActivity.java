package com.usando.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MinhaTerceiraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Button botao = new Button(getApplicationContext());
		botao.setText("Abrir outra activity");
		
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent i = new Intent(getApplicationContext(), MinhaQuartaActivity.class);
				startActivityForResult(i, 1);
				
			}
		});
		
		setContentView(botao);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.minha_terceira, menu);
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		String parametroRecebido = data.getExtras().getString("ParametroRetorno");
		Log.i("ParametroRetorno", parametroRecebido);
	}

}
