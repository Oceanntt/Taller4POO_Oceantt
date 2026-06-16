package Logica;

import Dominio.Card;
import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class CardFactory {

	public static Card CreateCard(String[] datos) {
		int rareza = Integer.parseInt(datos[1]);
		switch (datos[2]) {
		case "Pokemon":
			
		int daño = Integer.parseInt(datos[3]);
		int cantenergia = Integer.parseInt(datos[4]);
		Pokemon pokemon = new Pokemon(datos[0],rareza,daño,cantenergia);
		return pokemon;
			
		case "Item":
			int bon = Integer.parseInt(datos[3]);
			Item item = new Item(datos[0],rareza,bon);
			
		case "Supporter":
			int efectos = Integer.parseInt(datos[3]);
			Supporter supporter = new Supporter(datos[0],rareza,efectos);
			
		case "Energy":
			Energy energy = new Energy(datos[0],rareza,datos[3]);
			
			

		default:
			break;
		}
		return null;
	}

}
