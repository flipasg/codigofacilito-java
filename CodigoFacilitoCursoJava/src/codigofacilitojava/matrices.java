/**
 * 
 */
package codigofacilitojava;

/**
 * @author flipas
 *
 */
class matrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x[][] = new int[3][3];
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 1;
		x[1][1] = 2;
		x[1][2] = 3;
		for(int i = 0;i<=2;i++)
		{
			for(int j = 0;j<=2;j++)
			{
				System.out.print(x[i][j]+" ");
			}
		}
	}

}
