/**
 * 
 */
package codigofacilitojava;

import java.util.*;
/**
 * @author flipas
 *
 */
class linkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList lista = new LinkedList();
		
		lista.add("Palabra");
		lista.add(5);
		lista.add(1,17);
		
		lista.addFirst("hOLA");
		lista.addLast("adios");
		
		lista.removeFirst();
		lista.removeLast();
		lista.remove(1);
		
		System.out.println("El tamaño de la lista es: "+lista.size());
		System.out.println(lista.get(1));
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		
		lista.removeAll(lista);
		
		System.out.println("El tamaño de la lista es: "+lista.size());
	}

}
