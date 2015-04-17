/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int []arreglo = {5,3,7,2};
		
		/*
		 * 5,3,7,2
		 * 
		 * 3,5
		 * 3,5,7
		 * 3,5,2,7
		 * 3,2,5,7
		 * 2,3,5,7
		 * 
		 */
		
		//codigo
		//aconsejable para arrays pequeños, ejecucion lenta. Poco eficiente.
		
		int aux;
		
		for(int j = 1;j<=arreglo.length;j++){
			
			for(int i = 1;i<=arreglo.length-j;i++){
				
				if (arreglo[i]<arreglo[i-1]){
					
					aux = arreglo[i];
					arreglo[i] = arreglo[i-1];
					arreglo[i-1] = aux;
					
				}
				
			}
			
		}
		for(int j = 1;j<=arreglo.length;j++){
			
			System.out.print(arreglo[j-1]+" ");
		}

	}

}
