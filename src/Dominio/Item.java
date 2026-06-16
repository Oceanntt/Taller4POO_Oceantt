package Dominio;

import Logica.VisitorCard;

public class Item extends Card {
private int bon;
	public Item(String nombre, int rareza,int bon) {
		super(nombre,rareza);
		this.bon = bon;
	}
	@Override
	public int calcular(VisitorCard visitor) {
		return visitor.visitar(this);
		
	}
public int getBon() {
	return bon;
}
}
