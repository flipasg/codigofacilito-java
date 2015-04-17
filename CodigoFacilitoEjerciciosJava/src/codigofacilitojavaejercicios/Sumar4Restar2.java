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
public class Sumar4Restar2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		int entrada;
		
		try{
			
			System.out.println("Dime cuantos numeros de la serie deseas visualizar: ");
			entrada = Integer.parseInt(b.readLine());
			
			int inicio;
			int cont;
			
			inicio = 1;
			cont = 1;
			
			System.out.println("La serie es: ");
			
			while(cont<=entrada){
				
				System.out.print(inicio+" ");
				
				if(cont%2!=0){
					
					inicio = inicio+4;
					cont = cont+1;
					
				}
				
				else{
					
					inicio = inicio-2;
					cont = cont+1;
				}
				
			}
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}

	}

}
