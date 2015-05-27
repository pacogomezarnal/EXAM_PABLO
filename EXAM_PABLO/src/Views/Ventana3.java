package Views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana3 extends JPanel {
	private JTextField eid;
	private JTextField e1apellido;
	private JTextField tmensaje;

	/**
	 * Create the panel.
	 */
	public Ventana3(JPanel card) {
		setLayout(null);
		
		JLabel tid = new JLabel("ID");
		tid.setBounds(10, 58, 86, 14);
		add(tid);
		
		JLabel t1apellido = new JLabel("1er Apellido");
		t1apellido.setBounds(136, 58, 86, 14);
		add(t1apellido);
		
		eid = new JTextField();
		eid.setBounds(10, 83, 86, 20);
		add(eid);
		eid.setColumns(10);
		
		e1apellido = new JTextField();
		e1apellido.setBounds(136, 83, 86, 20);
		add(e1apellido);
		e1apellido.setColumns(10);
		
		JButton bcomprobar = new JButton("Comprobar");
		bcomprobar.setBounds(10, 154, 430, 23);
		add(bcomprobar);
		
		tmensaje = new JTextField();
		tmensaje.setEditable(false);
		tmensaje.setBounds(10, 205, 430, 20);
		add(tmensaje);
		tmensaje.setColumns(10);

	}

}
