package matrix;

import java.util.Scanner;

class s_operations {
	
	
	void spiralPrint(int row, int col, int a[][])
	{
		int m=row;
		int n=col;
				
	    int i, k = 0, l = 0;
	 
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	    	//horizontal top row
	    	/* only the column should change and row should be same. 
	    	 * Move till end of the column for that row
	    	 */
	    	
	        for (i = l; i < n; ++i)
	        {
	            System.out.print(a[k][i]+" ");
	        }
	        k++; //move to next row
	        
	 
	        /* Print the last column from the remaining columns */
	        /* move to next column below down in the same row*/
	        //m is the last row index
	        
	        
	        for (i = k; i < m; ++i)
	        {
	           System.out.print(a[i][n-1]+" ");
	        }
	        n--;  //make the max column one less
	 
	        /* Print the last row from the remaining rows */
	        /*make sure that k is less that m, since as m(max rows) decreases
	         * on every last row printed. here only n/2 rows r printed
	         */
	        
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	                System.out.print(a[m-1][i]+" ");
	            }
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        /*here will reach till the next row. since the column will be increamented
	         * next top row will be from next column of the second and hence it will be 
	         * printted only once
	         */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	                System.out.print(a[i][l]+" ");
	            }
	            l++;    
	        }        
	    }
	}
	
}

public class spiral_display_1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s_operations s=new s_operations();
		
		

		Scanner in=new Scanner(System.in);
		System.out.println("enter square matrix row and column");
		
		int n=in.nextInt();
		int m=in.nextInt();
		
		int[][] a=new int[n][m];
		
		System.out.println("Enter the matrix ");
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=in.nextInt();
		
		
		System.out.println("Entered Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				//a[i][j]=in.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		s.spiralPrint(n, m, a);

	}
	
	
}

	


