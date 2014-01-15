package com.interface_grafica;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class InterfaceGraficaResultadoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interface_grafica_resultado);
		
		String valorNome = getIntent().getExtras().getString("nome");
		String valorMaiorIdade = getIntent().getExtras().getString("maiorIdade");
		String valorSexo = getIntent().getExtras().getString("sexo");
		String valorDataNascimento = getIntent().getExtras().getString("dataNascimento");
		
		TextView nome = (TextView) findViewById(R.id.nome_informado);
		nome.setText(valorNome);
		
		TextView sexo = (TextView) findViewById(R.id.sexo_informado);
		sexo.setText(valorSexo);
		
		TextView dataNascimento = (TextView) findViewById(R.id.data_nascimento_informada);
		dataNascimento.setText(valorDataNascimento);
		
		TextView maiorIdade = (TextView) findViewById(R.id.maior_idade_informado);
		maiorIdade.setText(valorMaiorIdade);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.interface_grafica_resultado, menu);
		return true;
	}

}
