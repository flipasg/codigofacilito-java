/**
 * 
 */
package codigofacilitojavaejercicios;

import java.util.Scanner;

/**
 * @author flipas
 *
 */
class AlgoPotMultDiv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada1;
		int entrada2;
		
		try{
			
			System.out.println("Dime un numero: ");
			entrada1 = sc.nextInt();
			System.out.println("Dime otro numero: ");
			entrada2 = sc.nextInt();
			
			int res,cont;
			res = 0;
			cont = 0;
			
			for(int aux = entrada2;aux>0;aux--){
				
				res = res+entrada1;
				
			}
			
			System.out.println("MULTIPLICACION: "+res);
			
			res = 1;
			for(int aux = entrada2;aux>0;aux--){
				
				res = res*entrada1;
				
			}
			
			System.out.println("POTENCIA: "+res);
			
			res = entrada1;
			cont = 1;
			
			for(int aux = entrada2;aux>0 && res>=entrada2;aux--){
				
				res = res-entrada2;
				cont++;
			}
			
			System.out.println("DIVISION: "+cont+", RESTO: "+res);
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}

	}

}
