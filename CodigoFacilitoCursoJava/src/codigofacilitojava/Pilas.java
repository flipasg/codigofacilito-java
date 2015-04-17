/**
 * 
 * push
 * pop
 * peek
 * empty
 * 
 */
package codigofacilitojava;

import java.util.*; //Stacks, FILO(First In Last Out)
/**
 * @author flipas
 *
 */
class Pilas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack pila = new Stack();
		
		pila.push(50);
		pila.push("Hola soy el 1");
		
		//solo se ùede obtener el ULTIMO VALOR
		
		//ver
		
		System.out.println(pila.peek());
		
		//obtener y borrar
		
		while(!pila.empty()){
			System.out.println(pila.pop());
		}
	}

}
