package Logica;

import java.util.ArrayList;

import Dominio.Card;

public class ColeccionCartas {
	private static ColeccionCartas coleccion;
	private ArrayList<Card> cartas;
	

	private ColeccionCartas() {
		cartas = new ArrayList<>();
	}

    public static ColeccionCartas getColeccion() {

        if(coleccion == null)
            coleccion = new ColeccionCartas();

        return coleccion;
    }

    public void agregarCarta(Card carta) {

        cartas.add(carta);

    }

    public ArrayList<Card> getCartas() {

        return cartas;

    }
}
