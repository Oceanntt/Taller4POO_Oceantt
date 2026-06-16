package GUI;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class PanelPrincipal extends JFrame {

	public PanelPrincipal() {
		setTitle("Cartas TCG");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTabbedPane pestañas = new JTabbedPane();
		 pestañas.add("Administración", new PanelAdmin());

	     pestañas.add("Colección", new PanelColeccion());

	        add(pestañas);
	}

}
