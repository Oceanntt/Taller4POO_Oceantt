package GUI;


import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelAdmin extends JPanel {
    private JButton BotonAgregar;
    private JButton BotonEliminar;
    private JButton BotonModificar;


	public PanelAdmin() {
		BotonAgregar  = new JButton("Agregar Carta");
		BotonEliminar = new JButton("Eliminar Carta");
		BotonModificar = new JButton("Modificar Carta");
		add(BotonAgregar);
		add(BotonEliminar);
		add(BotonModificar);
		
	}

}
