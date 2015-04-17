/**
 * 
 * leer datos del teclado
 * concat()
 * toUpperCase()
 * toLowerCase()
 * lenght()
 * casting
 * 
 */
package codigofacilitojava;

import java.io.*; //entrada y salida de flujos de informacion


/**
 * @author flipas
 *
 */
public class ManipulacionTexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String texto = "";
		int num = 0;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		
		try{
			
			texto = buffer.readLine();
			num = Integer.parseInt(texto); //para hacerlo al contrario usar String.valueOf(variable)
			
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}
		
		//texto = texto.concat("- ESTO ES UNA CONCATENACION");
		//System.out.println(texto.toLowerCase());
		//System.out.println(texto.toUpperCase());
		
		
		
	}

}
