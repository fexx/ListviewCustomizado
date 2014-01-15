package com.listviewcustomizado;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

public class InterfaceGraficaActivity extends Activity {
	
	private EditText nome;
	private CheckBox maiorIdade;
	private RadioButton sexoMasculino;
	private DatePicker dataNascimento;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interface_grafica);
		
		nome = (EditText) findViewById(R.id.nome);
		maiorIdade = (CheckBox) findViewById(R.id.maior_idade);
		sexoMasculino = (RadioButton) findViewById(R.id.sexo_masculino);
		dataNascimento = (DatePicker) findViewById(R.id.data_nascimento);
		
		Button salvar = (Button) findViewById(R.id.salvar);
		
		salvar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String valorNome = nome.getText().toString();
				String valorMaiorIdade = maiorIdade.isChecked() ? "Sim" : "Não";
				String valorSexo = sexoMasculino.isChecked() ? "Masculino" : "Feminino";
				String valorDataNascimento = dataNascimento.getDayOfMonth() + "/" + (dataNascimento.getMonth() + 1) + "/" + dataNascimento.getYear();
				
				Intent i = new Intent(getApplicationContext(), InterfaceGraficaResultadoActivity.class);
				i.putExtra("nome", valorNome);
				i.putExtra("maiorIdade", valorMaiorIdade);
				i.putExtra("sexo", valorSexo);
				i.putExtra("dataNascimento", valorDataNascimento);
				
				startActivity(i);
			}
		});
		
		
		Button sair = (Button) findViewById(R.id.sair);
		
		sair.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
