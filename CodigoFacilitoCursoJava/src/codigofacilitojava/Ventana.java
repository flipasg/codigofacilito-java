package codigofacilitojava;

import javax.swing.*;

public class Ventana extends JFrame{
	
	JPanel panel;
	JLabel texto;
	JButton boton;
	
	public Ventana(){
		
		panel = new JPanel();
		texto = new JLabel();
		boton = new JButton();
		
		this.add(panel);
		panel.add(texto);
		panel.add(boton);
		
		texto.setText("HOLA");
		boton.setText("OPRIME");
		
		
	}
}
