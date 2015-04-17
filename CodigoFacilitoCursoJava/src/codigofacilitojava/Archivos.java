/**
 * 
 */
package codigofacilitojava;

import java.io.*;

/**
 * @author flipas
 *
 */
public class Archivos {

	public void leer(String nombre_archivo){
		//LECTURA DE ARCHIVOS
		try{
			
			FileReader r = new FileReader(nombre_archivo);
			BufferedReader b = new BufferedReader(r);
			String temp = "";
			
			while(temp!=null){
				
				temp = b.readLine();
				if(temp==null){
					break;
				}
				System.out.println(temp);
				
			}
		}
		/*
		try{ 
			FileInputStream fi = new FileInputStream(nombre_archivo);
			DataInputStream dis = new DataInputStream(fi);
			String texto;
			texto=dis.readLine();
			while(texto!=null){
				System.out.println(texto);
				texto=dis.readLine(); 
			}
		}
		*/
		catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public void escribir(String nombre_archivo){
		//ESCRITURA DE ARCHIVOS
		
		File f = new File(nombre_archivo); //crea objeto de tipo file
		
		try{
			
			FileWriter w = new FileWriter(f); //filewriter
			BufferedWriter b = new BufferedWriter(w); //bufferewriter
			PrintWriter pw = new PrintWriter(b); //printwriter

			pw.write("Eso es la linea que escribo soy la leche");
			pw.append(" - esto es una concatenacion de texto");
			pw.close();
			b.close();
			
			
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
}
