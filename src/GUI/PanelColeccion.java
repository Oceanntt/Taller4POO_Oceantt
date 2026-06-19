package GUI;

import java.awt.BorderLayout;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Dominio.Card;
import Singleton.ColeccionCartas;




public class PanelColeccion extends JPanel{
	  private JLabel titulo;
	    private JButton OrdenarRareza;
	    private JButton OrdenarNombre;
	    private JButton OrdenarPoder;

	    public PanelColeccion() {

	        setLayout(new BorderLayout());

	        ArrayList<Card> cartas = ColeccionCartas.getColeccion().getCartas();
	        JPanel panelCartas = new JPanel();
	        panelCartas.setLayout(new GridLayout(0,1));
	        for (int i = 0; i < cartas.size(); i++) {

	            JLabel linea = new JLabel(cartas.get(i).getNombre());
	            
	            linea.setForeground(Color.blue);

	            linea.addMouseListener(new MouseAdapter() {
	                @Override
	                public void mouseClicked(MouseEvent e) {
	                    VentanaSecundaria();
	                }
	            });
	            panelCartas.add(linea);
	        }
	        add(panelCartas, BorderLayout.CENTER);

	        JPanel panelBotones = new JPanel();

	        titulo = new JLabel("Ordenar por:");
	        OrdenarNombre = new JButton("Nombre");
	        OrdenarRareza = new JButton("Rareza");
	        OrdenarPoder = new JButton("Poder");

	        panelBotones.add(titulo);
	        panelBotones.add(OrdenarNombre);
	        panelBotones.add(OrdenarRareza);
	        panelBotones.add(OrdenarPoder);

	        add(panelBotones, BorderLayout.SOUTH);

	    }

	    private void VentanaSecundaria() {

	        JFrame ventana = new JFrame("Ventana secundaria");
	        ventana.setSize(200, 150);

	        JLabel texto = new JLabel("Hola desde la segunda ventana");
	        ventana.add(texto);

	        ventana.setVisible(true);
	    }
	
}




