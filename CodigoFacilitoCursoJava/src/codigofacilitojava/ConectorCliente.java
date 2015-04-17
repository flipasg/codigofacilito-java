package codigofacilitojava;

import java.net.*;
import java.io.*;

public class ConectorCliente {
	
	Socket cliente;
	int puerto = 9000;
	String ip = "127.0.0.1";
	DataOutputStream salida;
	BufferedReader entrada;
	
	public void inico(){
		
		try{
			
			cliente = new Socket(ip, puerto);
			
			//creamos el flujo de datos por el que se enviara un mensaje

			salida = new DataOutputStream(cliente.getOutputStream());

			//enviamos el mensaje

			salida.writeUTF("hola que tal!!");

			//cerramos la conexión

			cliente.close();
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
	}
}
