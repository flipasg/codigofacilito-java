/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
public class Coche {
	
	//variables nativas de la clase
	double peso;
	double altura;
	double ancho;
	double largo;
	int numero_de_puertas;
	String modelo;
	boolean arrancado = false;
	
	//metodos contructores
	
	public Coche(){
		
		peso = 1000;
		altura = 2.90;
		ancho = 40;
		//si no se declaran seran nulos
	}
	
	//metodos
	public double obtenerPeso(){
		
		return peso;
	}
	
	public void arrancarCoche(){
		
		arrancado = true;
		System.out.println("Has arrancado el coche");
	}
	
	public void pararCoche(){
		
		arrancado = false;
		System.out.println("Has parado el coche");
	}
	
	public boolean estadoCoche(){
		
		return arrancado;
	}
	
	public void informacion(){
		
		System.out.println("Este coche es normal");
	}
}

class CocheFerrari extends Coche{
	
	public CocheFerrari(){
		
		modelo = "Ferrari";
	}
	public void turbo(){
		
		System.out.println("Has activado el turbo");
	}
	
	public void informacion(){
		
		System.out.println("Este coche es un Ferrari");
	}
}
class CocheToyota extends Coche{
	
	public CocheToyota(){
		
		modelo = "Toyota";
		numero_de_puertas = 2;
	}
	
	public void informacion(){
		
		System.out.println("Este coche es un Toyota");
	}
}