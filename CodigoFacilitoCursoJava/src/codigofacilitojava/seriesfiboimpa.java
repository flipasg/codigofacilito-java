/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
class seriesfiboimpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//serie de numeros impares
		for(int cont = 1;cont<=30;cont+=2)
		{
			System.out.print(cont+" ");
		}
		System.out.println(" ");
		//serie fibonnaci
		int inicio = 0;
		int resultado = 1;
		int aux;
		while(resultado<40)
		{
			System.out.print(resultado+" ");
			aux = resultado;
			resultado = resultado+inicio;
			inicio = aux;
			
		}
	}

}
