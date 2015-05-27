package Views;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Model.Cadete;
import Model.IngresoLaby;

public class Ventana3 extends JPanel {
	private JTextField eid;
	private JTextField e1apellido;
	private JTextField tmensaje;
	private IngresoLaby comprobar=new IngresoLaby();
	/**
	 * Create the panel.
	 */
	public Ventana3(JPanel card,Cadete cadete1,Cadete cadete2) {
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
		eid.setText(Integer.toString(cadete1.getId()));
		
		e1apellido = new JTextField();
		e1apellido.setBounds(136, 83, 86, 20);
		add(e1apellido);
		e1apellido.setColumns(10);
		e1apellido.setText(cadete2.getApellidos().split(" ")[0]);
		
		tmensaje = new JTextField();
		tmensaje.setEditable(false);
		tmensaje.setBounds(10, 205, 410, 20);
		add(tmensaje);
		tmensaje.setColumns(10);
		
		JButton bcomprobar = new JButton("Comprobar");
		bcomprobar.setBounds(10, 154, 410, 23);
		add(bcomprobar);
		bcomprobar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tmensaje.setText(comprobar.getCod(Integer.parseInt(eid.getText()), e1apellido.getText()));
			}
		});
		
		JButton batras = new JButton("Atras");
		batras.setBounds(35, 242, 89, 23);
		add(batras);
		batras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout) card.getLayout();
				c.show(card,"v2");
			}
		});

	}

}
