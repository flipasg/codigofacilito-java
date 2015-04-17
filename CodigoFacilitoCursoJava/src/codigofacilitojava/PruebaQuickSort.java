/**
 * 
 */
package codigofacilitojava;

import codigofacilitojava.QuickSort;
/**
 * @author flipas
 *
 */
class PruebaQuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []arreglo = {5,3,7,2};
		
		QuickSort.quicksort1(arreglo, 0, arreglo.length-1);
		
		for(int j = 1;j<=arreglo.length;j++){
			
			System.out.print(arreglo[j-1]+" ");
			
		}
	}

}
