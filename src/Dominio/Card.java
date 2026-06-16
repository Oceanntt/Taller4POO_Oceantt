package Dominio;

import Logica.VisitorCard;

public abstract class Card {
private String nombre;
private int rareza;

	public Card(String nombre, int rareza) {
		this.nombre = nombre;
		this.rareza = rareza;
	}
	
	public abstract int calcular(VisitorCard visitor);
public String getNombre() {
	return nombre;
}
public int getRareza() {
	return rareza;
}
}
