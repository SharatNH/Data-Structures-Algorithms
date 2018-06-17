package matrix;

import java.util.*;


class spiral_operations
{
	
	public void traverse_top(int j,int i,int a[][])
	{
		
	//	System.out.println("j , i, "+ j + i);
		int k=0;
		while(k<j)
		{
			System.out.print(a[i][k]+" ");
			k++;
		}
		
	}
	
	
	public void traverse_right(int rows,int col_range, int i, int a[][])
	{
	
//		System.out.println("rows, col_range, i "+ rows+ col_range+ i);
		while(i<rows)
		{
			System.out.print(a[i][col_range]+" ");
			i++;
		}
		
	}
	
	public void traverse_bottom(int row,int col_end, int col_start,int a[][])
	{
		
//		System.out.println("rows, col_end, col_start "+ row+ col_end+ col_start);
		
		while(col_end>col_start)
		{
			System.out.print(a[row][col_end]+" ");
			col_end--;
		}
		
	}
	
	public void traverse_left(int row_start,int row_end,int col_start, int a[][])
	{
	//	System.out.println("rows_start, row_end, col_start"+ row_start+ row_end+ col_start);
		while(row_start>row_end+1)
		{
			System.out.print(a[row_start][col_start]+" ");
			row_start--;
		}
	}
	
	
}
public class spiral_display {
	
	
	public static void main(String[] args)
	{
		
		spiral_operations s=new spiral_operations();
		
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
		
		
		int col_range=m-1;
		int col_start=0;
		int rows=n-1; 
		for(int i=0;i<=n/2;i++)
		{
			
			
			s.traverse_top(col_range-i,i,a);
			s.traverse_right(rows-i,col_range-i,i,a);
			
			
			s.traverse_bottom(rows-i,col_range-i,col_start+i,a);
			s.traverse_left(rows-i,i,col_start+i,a);
			
			
			
		}
				
		
		
	}
	
	

}
