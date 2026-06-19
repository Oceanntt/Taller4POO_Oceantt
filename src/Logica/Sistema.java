package Logica;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import Dominio.Card;
import Factory.CardFactory;
import Singleton.ColeccionCartas;


public class Sistema {

	public void cargarCartas(File arch) throws FileNotFoundException {
		Scanner lector = new Scanner(arch);
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(";");
			Card carta = CardFactory.CreateCard(partes);
			ColeccionCartas.getColeccion().agregarCarta(carta);
		}
		lector.close();
	}
	

}
