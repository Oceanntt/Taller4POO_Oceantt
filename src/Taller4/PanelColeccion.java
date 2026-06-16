package Taller4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelColeccion extends JPanel{
	private JLabel titulo;
	  private JButton OrdenarRareza;
	    private JButton OrdenarNombre;
	    private JButton OrdenarPoder;
	public PanelColeccion() {
		titulo = new JLabel("Ordenar Cartas Por: ");
		add(titulo);

		OrdenarRareza = new JButton("Rareza");
		OrdenarNombre = new JButton("Nombre");
		OrdenarPoder = new JButton("Poder");
		add(OrdenarNombre);
		add(OrdenarPoder);
		add(OrdenarRareza);
	}

}
