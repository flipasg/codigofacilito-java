package codigofacilitojava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana3 extends JFrame implements ActionListener{
	
	JPanel panel;
	JButton boton1;
	JButton boton2;
	JLabel texto;
	JTextField espacioTexto;
	
	public Ventana3(){
		
		panel = new JPanel();
		boton1 = new JButton("Presionar");
		boton2 = new JButton("Presionar");
		texto = new JLabel();
		espacioTexto = new JTextField("Escribe algo aqui...");
		
		this.add(panel);
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(espacioTexto);
		panel.add(texto);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.boton1.addActionListener(this);
		this.boton2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(boton1)){
			this.texto.setText("Has presionado el boton 1");
		}
		if(e.getSource().equals(boton2)){
			this.texto.setText("Has presionado el boton 2");
		}
	}
}
