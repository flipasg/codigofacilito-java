/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []arreglo = {5,3,7,2};
		
		/*
		 * 5,3,7,2
		 * elimina el 3 y lo mueve al inicio
		 * 3,5
		 * 3,5,7
		 * elimina el 2 y lo mueve a la posicion anterior, asi sucesivamente
		 * 3,5,2,7
		 * 3,2,5,7
		 * 2,3,5,7
		 * 
		 */
		
		//codigo
		//Mas eficiente que el array burbuja

		int aux;
		
		for(int j = 1;j<arreglo.length;j++){
			
			aux = arreglo[j];
			
			for(int i = j-1;i>=0 && arreglo[i]>aux;i--){
					
					arreglo[i+1] = arreglo[i];
					arreglo[i] = aux;
				
			}
			
		}
		for(int j = 1;j<=arreglo.length;j++){
			
			System.out.print(arreglo[j-1]+" ");
		}

	}

}
