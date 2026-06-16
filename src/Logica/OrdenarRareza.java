package Logica;

import java.util.ArrayList;

import Dominio.Card;

public class OrdenarRareza implements StrategyOrder {

	public OrdenarRareza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ordenar(ArrayList<Card> cartas) {
		cartas.sort((c1,c2)->Integer.compare(c1.getRareza(), c2.getRareza()));
		
	}

}
