package Views;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Model.Cadete;
import Model.DatosCadete;
import Model.DatosCadete;

public class Ventana2 extends JPanel {
	private JTextField enombre;
	private JTextField e1apellido;
	private JTextField e2apellido;
	private JTextField enacionalidad;
	private JTextField eid;
	private DatosCadete dcadete=new DatosCadete();
	private Cadete cadete2;
	private CardLayout c;

	/**
	 * Create the panel.
	 */
	public Ventana2(JPanel card,Cadete cadete1) {
		setLayout(null);
		
		c=(CardLayout) card.getLayout();
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
		
		
		
		JComboBox eequipo = new JComboBox();
		eequipo.setBounds(35, 50, 118, 20);
		add(eequipo);
		Iterator<String> equiposde=dcadete.getEquipo("6").iterator();
		while(equiposde.hasNext()){
			//añadimos cada valor del iterator al comboBox
			eequipo.addItem(equiposde.next().toString());
		}
		
		enombre = new JTextField();
		enombre.setEditable(false);
		enombre.setBounds(173, 50, 118, 20);
		add(enombre);
		enombre.setColumns(10);
		
		e1apellido = new JTextField();
		e1apellido.setEditable(false);
		e1apellido.setBounds(173, 107, 118, 20);
		add(e1apellido);
		e1apellido.setColumns(10);
		
		e2apellido = new JTextField();
		e2apellido.setEditable(false);
		e2apellido.setBounds(173, 163, 118, 20);
		add(e2apellido);
		e2apellido.setColumns(10);
		
		enacionalidad = new JTextField();
		enacionalidad.setEditable(false);
		enacionalidad.setBounds(176, 225, 115, 20);
		add(enacionalidad);
		enacionalidad.setColumns(10);
		
		eid = new JTextField();
		eid.setEditable(false);
		eid.setBounds(320, 50, 86, 20);
		add(eid);
		eid.setColumns(10);
		
		ItemListener cambioEquipo = new ItemListener(){
			public void itemStateChanged(ItemEvent eventoCombo){
				if(eventoCombo.getStateChange() == ItemEvent.SELECTED){
					System.out.println(eequipo.getSelectedItem().toString());
					cadete2=dcadete.getOtroCadete(eequipo.getSelectedItem().toString());
					enombre.setText(cadete2.getNombre());
					eid.setText(Integer.toString(cadete2.getId()));
					e1apellido.setText(cadete2.getApellidos().split(" ")[0]);
					e2apellido.setText(cadete2.getApellidos().split(" ")[1]);
					enacionalidad.setText(cadete2.getNacionalidad());
				}
			}
		};
		eequipo.addItemListener(cambioEquipo);
		
		JButton batras = new JButton("Atras");
		batras.setBounds(35, 242, 89, 23);
		add(batras);
		batras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.show(card,"v1");
			}
		});
		
		JButton bsiguiente = new JButton("Siguiente");
		bsiguiente.setBounds(320, 242, 89, 23);
		add(bsiguiente);
		bsiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel ventana3=new Ventana3(card,cadete1,cadete2);
				card.add(ventana3, "v3");
				c.show(card, "v3");
				
			}
		});
	}
}
