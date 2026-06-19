package Dominio;

import Visitor.VisitorCard;

public class Pokemon extends Card{
private int daño;
private int cantenergia;
	public Pokemon(String nombre, int rareza,int daño,int cantenergia) {
		super(nombre,rareza);
		this.daño = daño;
		this.cantenergia = cantenergia;
			
		
		
	}
	@Override
	public int calcular(VisitorCard visitor) {
		return visitor.visitar(this);
		
	}
public int getCantenergia() {
	return cantenergia;
}
public int getDaño() {
	return daño;
}
}
