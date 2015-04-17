package codigofacilitojava;

public class Proceso extends Thread{
	
	public Proceso(String msg){
		
		super(msg);
		
	}
	
	public void run(){
		
		for(int i = 1;i<=20;i++){
			
			System.out.println(this.getName());
			
		}
		
	}
}
