/**
 * 
 */
package codigofacilitojavaejercicios;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * @author flipas
 *
 */
class AlgSuma {

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
			
			for(;entrada2>0;entrada2--){
				
				entrada1++;
				
			}
			System.out.println(entrada1);
		}
		catch(Exception e){
			
			e.printStackTrace();
		}

	}

}
