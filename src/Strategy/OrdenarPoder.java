package Strategy;

import java.util.ArrayList;

import Dominio.Card;
import Visitor.VisitorPower;

public class OrdenarPoder implements StrategyOrder {

	@Override
	public void ordenar(ArrayList<Card> cartas) {
		cartas.sort((c1,c2)->Integer.compare(c1.calcular(new VisitorPower()),c2.calcular(new VisitorPower())));
		
	}


}
