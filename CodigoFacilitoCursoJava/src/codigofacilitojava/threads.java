/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
class threads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread hilo1 = new Proceso("Proceso 1");
		Thread hilo2= new Proceso("Proceso 2");
		
		hilo1.start();
		hilo2.start();
	}

}
