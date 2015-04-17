/**
 * 
 */
package codigofacilitojava;

import codigofacilitojava.Archivos;
/**
 * @author flipas
 *
 */
class lecturaArchivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Archivos t = new Archivos();
		
		t.escribir("hola.txt");
		t.leer("hola.txt");
		
	}

}
