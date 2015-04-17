package codigofacilitojava; //servidor

import java.net.*;
import java.io.*;

public class Conector {
	
	ServerSocket server;
	Socket socket;
	int puerto = 9000;
	DataOutputStream salida;
	BufferedReader entrada;
	
	public void iniciar(){
		
		try{
			
			server = new ServerSocket(puerto);
			socket = new Socket();
			socket = server.accept();
			
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			entrada = new BufferedReader(in);
			salida = new DataOutputStream(socket.getOutputStream());
			
			String mensaje = entrada.readLine();
			System.out.println(mensaje);
			
			
			salida.writeUTF("Adios Mundo");
			
			socket.close();
			entrada.close();
			salida.close();
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
	}
}
