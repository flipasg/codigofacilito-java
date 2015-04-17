/**
 * short - numeros cortos
 * int - numeros enteros
 * long - numeros enteros largos
 * float - numeros flotantes
 * double - numeros dobles
 * byte - maneja bytes
 * char - caracteres
 * boolean - valores booleanos
 * String - cadenas de texto
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
public class varyop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declaracion de las variables
		
		int variable1;
		int resultado1;
		//asignar valor a la variable
		
		variable1 = 10;
		System.out.println(variable1);
		
		//operacion *
		resultado1 = variable1 * 5;
		System.out.println(resultado1);
		
		//operacion /
		resultado1 = variable1 / 3;
		System.out.println(resultado1);
		
		//ojo con el tipo de dato
		float resultado2;
		resultado2 = (float)variable1 / 3;
		System.out.println(resultado2);

	}

}
