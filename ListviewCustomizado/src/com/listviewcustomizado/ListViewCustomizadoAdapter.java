package com.listviewcustomizado;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewCustomizadoAdapter extends BaseAdapter {
	
	private Context contexto;
	
	private List<ListViewCustomizadoItem> itens;
	
	

	public ListViewCustomizadoAdapter(Context contexto, List<ListViewCustomizadoItem> itens) {
		this.contexto = contexto;
		this.itens = itens;
	}

	@Override
	public int getCount() {
		return itens.size();
	}

	@Override
	public Object getItem(int position) {
		return itens.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ListViewCustomizadoItem item = itens.get(position);
		
		LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.activity_listview_customizado, null);
		
		ImageView imagem = (ImageView) view.findViewById(R.id.imagem_activity);
		imagem.setImageResource(item.getImagemActivity());
		
		TextView texto = (TextView) view.findViewById(R.id.nome_activity);
		texto.setText(item.getNomeActivity());
		
		return view;
	}

}
