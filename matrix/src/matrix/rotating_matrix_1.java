/* clockwise rotation of the matrix
 * rotating the given matrix in multiples of 90 degrees
 * first transpose the matrix and then swap the columns from the corners
 */

package matrix;

import java.util.Scanner;

public class rotating_matrix_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);

		System.out.println("enter square matrix row or column");
		int n=in.nextInt();

		int[][] a=new int[n][n];

		System.out.println("Enter the matrix ");

		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();
		

		System.out.println("Entered Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//a[i][j]=in.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

		int temp;
		/* transpose of a matrix*/
		/* swap diagonal elements*/
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
			
		}
		
		System.out.println("Transposed Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//a[i][j]=in.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		/* swap corner columns to have it turn by 90 degress*/
		/* start from the last column and first column and 
		 * move inwards.
		 */
		for(int i=0;i<n/2;i++){
			for(int j=0;j<n;j++){
				temp=a[j][i];
				a[j][i]=a[j][n-1-i];
				a[j][n-1-i]=temp;
			}
		}
		
		System.out.println("Final output Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//a[i][j]=in.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
	}

}
