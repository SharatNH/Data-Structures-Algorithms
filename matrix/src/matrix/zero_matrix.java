/* given a matrix mXn, if any element is 0, set
 * the entire row and column as 0
 */

package matrix;

import java.util.Scanner;

public class zero_matrix {
	
	static int[][] a;
	static int m,n;
	
	/* problem here is when run iteratively,
	 * it turns entire array to zero. so only good for one 0 element
	 */
	public void normalMethod(){

		/* finding the element with value zero */
		int target_row=-1;
		int target_column=-1;

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					target_row=i;
					target_column=j;
					break;
				}
			}
		}

		/* replace the values in the target row and column with 0*/
		if(target_row!=-1 && target_column!=-1){
			for(int i=0;i<n;i++)
				a[target_row][i]=0;
			for(int i=0;i<m;i++)
				a[i][target_column]=0;
		}
	}
	
	/* in this method, i have 2 boolean array which maarks
	 * the position of the 0 element.
	 * 
	 * This consumes space of O(n). 
	 */
	public void arrayMethod(){
		boolean[] target_row=new boolean[a.length];
		boolean[] target_column=new boolean[a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0)
				{
					target_row[i]=true;
					target_column[j]=true;
				}
			}
		}
		

			for(int i=0;i<a.length;i++){
				if(target_row[i])
					setRows(i);
			}
			for(int i=0;i<a[0].length;i++){
				if(target_column[i])
					setCol(i);
			}
		

	}
	
	/* here we use two variables to store if the array has any of the
	 * zero in the first row and column. Then we use the same value to update
	 * any zeros in the other column n rows.
	 */
	public void inPlace(){
		boolean rowFlag=false;
		boolean colFlag=false;
		/* first row scan*/
		for(int i=0;i<n;i++)
		{
			if(a[0][i]==0)
				rowFlag=true;
		}
		/* first col scan*/
		for(int i=0;i<m;i++){
			if(a[i][0]==0)
				colFlag=true;
		}
		
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(a[i][j]==0)
				{
					a[i][0]=0;
					a[0][j]=0;
				}
			}
		}
		
		/* set the rows and columns to zero*/
		for(int i=1;i<n;i++){
			if(a[0][i]==0)
				setCol(i);
		}
		
		for(int i=1;i<m;i++){
			if(a[i][0]==0)
				setRows(i);
		}
		
		if(rowFlag)
			setRows(0);
		
		if(colFlag)
			setCol(0);
	}
	
	public void setRows(int row){
		for(int i=0;i<a[0].length;i++)
			a[row][i]=0;
	}
	
	public void setCol(int col){
		for(int i=0;i<a.length;i++)
			a[i][col]=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zero_matrix z=new zero_matrix();
		Scanner in=new Scanner(System.in);

		System.out.println("enter matrix row");
		m=in.nextInt();

		System.out.println("enter matrix column");
		n=in.nextInt();

		a=new int[m][n];

		System.out.println("Enter the matrix ");

		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();


		System.out.println("Entered Matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				//a[i][j]=in.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

		//z.arrayMethod();
		z.inPlace();
		
		System.out.println("Resultant Matrix");
		for(int i=0;i<m;i++)
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
