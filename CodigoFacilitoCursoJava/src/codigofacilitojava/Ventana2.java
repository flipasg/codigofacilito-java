/**
 * 
 */
package codigofacilitojava;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * @author flipas
 *
 */
public class Ventana2 extends JFrame{
	
	private JPanel panel1;
	private JPanel panel2;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	public Ventana2(){
		
		BorderLayout borde = new BorderLayout();
		this.setLayout(borde);
		//paneles
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		//filas,columnas,espacio entre filas, espacio entre columnas
		//tabla
		GridLayout grid = new GridLayout(3,3,5,10);
		panel2.setLayout(grid);
		
		//botones
		b1 = new JButton("Prueba 1");
		b2 = new JButton("Prueba 2");
		b3 = new JButton("Prueba 3");
		b4 = new JButton("Prueba 4");
		b5 = new JButton("Prueba 5");
		b6 = new JButton("Prueba 6");
		b7 = new JButton("Prueba 7");
		b8 = new JButton("Prueba 8");
		b9 = new JButton("Prueba 9");
		b10 = new JButton("Prueba 10");
		b11 = new JButton("Prueba 11");
		b12 = new JButton("Prueba 12");
		
		//se añaden paneles a la ventana principal (JFrame)
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.SOUTH);
		
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		panel1.add(b5);
		panel1.add(b6);
		panel2.add(b7);
		panel2.add(b8);
		panel2.add(b9);
		panel2.add(b10);
		panel2.add(b11);
		panel2.add(b12);
	}
}
