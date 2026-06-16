package Dominio;

import Logica.VisitorCard;

public class Supporter extends Card{
private int efectos;
	public Supporter(String nombre, int rareza,int efectos) {
		super(nombre,rareza);
		this.efectos = efectos;
	}
	@Override
	public int calcular(VisitorCard visitor) {
		return visitor.visitar(this);
		
	}
public int getEfectos() {
	return efectos;
}
}
