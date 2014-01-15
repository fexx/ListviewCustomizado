package com.listviewcustomizado;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ListViewCustomizadoActivity extends ListActivity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		List<ListViewCustomizadoItem> itens = new ArrayList<ListViewCustomizadoItem>();
		
		itens.add(new ListViewCustomizadoItem("Trabalhando com interface gráficas", R.drawable.ic_launcher));
		itens.add(new ListViewCustomizadoItem("Sair", R.drawable.ic_launcher));
		
		setListAdapter(new ListViewCustomizadoAdapter(this, itens));
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		switch (position) {
		case 0:
			startActivity(new Intent(this, InterfaceGraficaActivity.class));
			break;

		default:
			finish();
		}
		
	}
	
}
