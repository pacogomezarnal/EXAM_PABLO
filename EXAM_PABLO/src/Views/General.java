package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Window.Type;

public class General extends JFrame {

	private JPanel card;


	public General() {
		setTitle("THE LABY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(NORMAL, NORMAL, 460, 360);
		card = new JPanel();
		card.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(card);
		card.setLayout(new CardLayout(0, 0));
		JPanel ventana1=new Ventana1(card);
		//JPanel ventana2=new Ventana2(card);
		//JPanel ventana3=new Ventana3(card);
		card.add(ventana1,"v1");
		//card.add(ventana2,"v2");
		//card.add(ventana3,"v3");
	}

}
