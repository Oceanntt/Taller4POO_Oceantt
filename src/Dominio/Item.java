package Dominio;

public class Item extends Card {
private int bon;
	public Item(String nombre, int rareza,int bon) {
		super(nombre,rareza);
		this.bon = bon;
	}

}
