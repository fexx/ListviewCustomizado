package com.listviewcustomizado;

public class ListViewCustomizadoItem {

	private String nomeActivity;
	
	private int imagemActivity;

	public ListViewCustomizadoItem(String nomeActivity, int imagemActivity) {
		this.nomeActivity = nomeActivity;
		this.imagemActivity = imagemActivity;
	}

	public String getNomeActivity() {
		return nomeActivity;
	}

	public void setNomeActivity(String nomeActivity) {
		this.nomeActivity = nomeActivity;
	}

	public int getImagemActivity() {
		return imagemActivity;
	}

	public void setImagemActivity(int imagemActivity) {
		this.imagemActivity = imagemActivity;
	}
	
}
