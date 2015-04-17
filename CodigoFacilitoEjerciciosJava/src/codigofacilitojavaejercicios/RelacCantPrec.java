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
class RelacCantPrec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		
		float cant1,cant2,prec1,prec2;
		
		try{
			
			System.out.println("Dime la cantidad del primer producto");
			cant1 = Float.parseFloat(b.readLine());
			System.out.println("Dime el precio del primer producto");
			prec1 = Float.parseFloat(b.readLine());
			
			System.out.println("Dime la cantidad del segundo producto");
			cant2 = Float.parseFloat(b.readLine());
			System.out.println("Dime el precio del segundo producto");
			prec2 = Float.parseFloat(b.readLine());
			
			if(cant1==cant2 && prec1==prec2){
				
				System.out.println("Da igual cual te compres");
				
			}
			if (cant1==cant2) {
				if(prec1>prec2){
					
					System.out.println("Comprate el segundo producto");
					
				}
				else{
					
					System.out.println("Comprate el primer producto");
					
				}
				
			}
			else{
				
				if(cant1>cant2){
					if(prec1==prec2){
						
						System.out.println("Comprate el primer producto");
						
					}
					else if(prec2<prec1){
						
						System.out.println("Comprate el primer producto");
						
					}
					else {
						if(((cant2*prec1)/cant1)>prec2){
					
						
						System.out.println("Comprate el segundo producto");
						}
						else{
							
							System.out.println("Comprate el primer producto");
							
						}
					}
				}
				if(cant2>cant1){
					if(prec1==prec2){
						
						System.out.println("Comprate el segundo producto");
						
					}
					else if(prec2<prec1){
						
						System.out.println("Comprate el segundo producto");
						
					}
					else {
						if(((cant1*prec2)/cant2)>prec1){
					
						
						System.out.println("Comprate el primer producto");
						}
						else{
							
							System.out.println("Comprate el segundo producto");
							
						}
					}
				}
				
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
	}

}
