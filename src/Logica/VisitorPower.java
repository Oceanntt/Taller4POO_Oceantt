package Logica;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class VisitorPower implements VisitorCard {


	@Override
	public int visitar(Pokemon p) {
		return (p.getDaño()/p.getCantenergia())*100;
		
	}

	@Override
	public int visitar(Item i) {
		return i.getBon()*20;
		
	}

	@Override
	public int visitar(Supporter s) {
		return s.getEfectos()*50;
		
	}

	@Override
	public int visitar(Energy e) {
		return 1;
		
	}

}
