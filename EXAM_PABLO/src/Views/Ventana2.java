package Views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Ventana2 extends JPanel {
	private JTextField enombre;
	private JTextField e1apellido;
	private JTextField e2apellido;
	private JTextField enacionalidad;
	private JTextField eid;

	/**
	 * Create the panel.
	 */
	public Ventana2(JPanel card) {
		setLayout(null);
		
		JLabel tequipo = new JLabel("Equipo");
		tequipo.setBounds(35, 32, 89, 14);
		add(tequipo);
		
		JLabel tnombre = new JLabel("Nombre");
		tnombre.setBounds(173, 32, 89, 14);
		add(tnombre);
		
		JLabel t1apellido = new JLabel("1er Apellido");
		t1apellido.setBounds(173, 82, 89, 14);
		add(t1apellido);
		
		JLabel t2apellido = new JLabel("2\u00BA Apellido");
		t2apellido.setBounds(173, 138, 89, 14);
		add(t2apellido);
		
		JLabel tnacionalidad = new JLabel("Nacionalidad");
		tnacionalidad.setBounds(173, 206, 89, 14);
		add(tnacionalidad);
		
		JLabel tid = new JLabel("ID");
		tid.setBounds(320, 32, 78, 14);
		add(tid);
		
		JButton batras = new JButton("Atras");
		batras.setBounds(35, 242, 89, 23);
		add(batras);
		
		JButton bsiguiente = new JButton("Siguiente");
		bsiguiente.setBounds(320, 242, 89, 23);
		add(bsiguiente);
		
		JComboBox eequipo = new JComboBox();
		eequipo.setBounds(35, 57, 89, 20);
		add(eequipo);
		
		enombre = new JTextField();
		enombre.setEditable(false);
		enombre.setBounds(173, 50, 89, 20);
		add(enombre);
		enombre.setColumns(10);
		
		e1apellido = new JTextField();
		e1apellido.setEditable(false);
		e1apellido.setBounds(173, 107, 89, 20);
		add(e1apellido);
		e1apellido.setColumns(10);
		
		e2apellido = new JTextField();
		e2apellido.setEditable(false);
		e2apellido.setBounds(173, 163, 89, 20);
		add(e2apellido);
		e2apellido.setColumns(10);
		
		enacionalidad = new JTextField();
		enacionalidad.setEditable(false);
		enacionalidad.setBounds(176, 225, 86, 20);
		add(enacionalidad);
		enacionalidad.setColumns(10);
		
		eid = new JTextField();
		eid.setEditable(false);
		eid.setBounds(320, 50, 86, 20);
		add(eid);
		eid.setColumns(10);

	}
}
