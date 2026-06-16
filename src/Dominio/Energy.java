package Dominio;

import Logica.VisitorCard;

public class Energy extends Card {
private String elemento;
	public Energy(String nombre, int rareza,String elemento) {
		super(nombre,rareza);
		this.elemento = elemento;
	}
	@Override
	public int calcular(VisitorCard visitor) {
		return visitor.visitar(this);
		
	}
	public String getElemento() {
		return elemento;
	}

}
