/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
class arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x[] = new int[10]; //int x[] = {7,8,9,20,...}
		int valor = 5;
		for(int cont=0;cont<=9;cont++) //si usamos x.lenght saltará una excepcion
		{
			x[cont]=valor;
			System.out.print(x[cont]+" ");
			valor+=2;
		}

	}

}
