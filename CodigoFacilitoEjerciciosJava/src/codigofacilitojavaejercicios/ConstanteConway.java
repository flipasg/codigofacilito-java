/**
 * 
 */
package codigofacilitojavaejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author flipas
 *
 */
class ConstanteConway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		String entrada,cadena,aux;
		int parar,linea,cont;
		char dig;
		
		try{
			
			System.out.println("Dime la cifra inicial: ");
			entrada = b.readLine();
			System.out.println("Dime en que línea parar: ");
			parar = Integer.parseInt(b.readLine());
			
			linea = 0;
			cadena = entrada;
			cont = 0;
			
			System.out.println(cadena);
			
			while(linea<parar){
				//variable auxiliar que nos ayudara para crear la cadena
				aux = "";
				
				//por cada numero en la cadena
				for(int i = 0;i<cadena.length();){
					//asignamos a una variable digito, el caracter de la posicion
					dig = cadena.charAt(i);
					
					//cantidad de caracteres iguales encontrados a 0
					cont=0;
					
					while(dig==cadena.charAt(i)){
						//por cada caracter igual incrementamos cantidad y posicion
						cont++;
						i++;
						
						//si la posicion es mayor a la longitud de la cadena salimos del while
						if(i>=cadena.length()){
						
							break;
						}
					}
					
					//concatenamos en la cadena primero el numero de digitos y luego el digito
					aux = aux.concat(String.valueOf(cont));
					aux = aux.concat(String.valueOf(dig));
					
							
				}
				
				//imprimimos la cadena
				System.out.println(aux);
				
				//asignamos a la cadena la cadena auxiliar, si no hacemos esto el for dara problemas con la longitud
				cadena = aux;
				
				//incrementamos la linea
				linea++;
				
					
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}

	}

}
