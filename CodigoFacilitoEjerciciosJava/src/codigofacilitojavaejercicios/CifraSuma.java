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
class CifraSuma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		String entrada;
		int dig,ayuda;
		
		try{
			
			entrada = b.readLine();
			System.out.println("Tiene "+entrada.length()+" digitos");
			ayuda=0;
			
			for(int i = 0;i<entrada.length();i++){
				
				dig = Integer.parseInt(entrada.substring(i,i+1));
				ayuda = ayuda+dig;
			}
			
			System.out.println("Sus digitos suman "+ayuda);
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}

}
