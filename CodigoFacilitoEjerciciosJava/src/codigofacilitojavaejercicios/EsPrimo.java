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
class EsPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		int entrada,cont,num,linea;
		
		try{
			cont = 0;
			num = 2;
			linea = 0;
			
			System.out.println("Dime el número de primos que deseas ver: ");
			entrada = Integer.parseInt(b.readLine());
			
			while(linea<entrada){
				
				for(int i = 1;i<=num;i++){
					
					if(num%i==0){
						
						cont++;
						
					}
					
				}
				if(cont==2){
					
					System.out.print(num+" ");
					cont = 0;
					num++;
					linea++;
					
				}
				else{
					
					cont = 0;
					num++;
					
				}
			
			}
		
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}

	}

}
