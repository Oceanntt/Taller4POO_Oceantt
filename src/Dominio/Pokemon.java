package Dominio;

public class Pokemon extends Card{
private int daño;
private int cantenergia;
	public Pokemon(String nombre, int rareza,int daño,int cantenergia) {
		super(nombre,rareza);
		this.daño = daño;
		this.cantenergia = cantenergia;
			
		
		
	}

}
