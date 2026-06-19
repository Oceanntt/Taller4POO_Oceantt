package Strategy;

import java.util.ArrayList;

import Dominio.Card;

public class OrdenarNombre implements StrategyOrder {

	

	@Override
	public void ordenar(ArrayList<Card> cartas) {
		cartas.sort((c1,c2)-> c1.getNombre().compareTo(c2.getNombre()));
		
	}

}
