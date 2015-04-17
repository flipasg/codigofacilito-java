/**
 * 
 */
package codigofacilitojavaejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author flipas
 *
 */
class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		int entrada;
		
		try{
			do{
				
				System.out.println("Dime el número: ");
				entrada = Integer.parseInt(b.readLine());
				
			}while(entrada<1);
				
			int fact;
			
			
			fact = entrada;
			System.out.println("El factorial de "+entrada+" es:");
			
			for(int i = 2;i<entrada;i++){
				
				fact = fact*i;
				
			}
			
			System.out.println(fact);
			
		}
		catch(NumberFormatException | IOException e){
			
			e.printStackTrace();
			
		}

	}

}
