package Logica;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public interface VisitorCard {
	public int visitar(Pokemon p);
	public int visitar(Item i);
	public int visitar(Supporter s);
	public int visitar(Energy e);


}
