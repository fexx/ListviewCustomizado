package com.interface_grafica;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends ListActivity{
	
	private static final String[] OPCOES_DO_MENU = new String[]{"Trabalhando com interfaces gráficas","Sair"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OPCOES_DO_MENU));
	}

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		switch (position) {
		case 0:
				startActivity(new Intent(this, InterfaceGraficaActivity.class));
			break;

		default:
			finish();;
		}
	}	
}
