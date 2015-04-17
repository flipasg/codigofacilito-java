/**
 * 
 * offer
 * poll
 * peek
 * 
 * FIFO, First In First Out
 * 
 */
package codigofacilitojava;

import java.util.*; //linkedList
/**
 * @author flipas
 *
 */
class Colas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList cola = new LinkedList();
		
		for(int i = 1;i<11;i++){
			
			cola.offer(i);
			
		}
		while(cola.peek()!=null){
			
			System.out.println(cola.poll());
			
		}

	}

}
