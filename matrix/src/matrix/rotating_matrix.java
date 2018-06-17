package matrix;

import java.util.*;

public class rotating_matrix {
	
	//input and create matrix
	
	public static void main(String[] args)
	{
		
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
		// transpose of the matrix
		for(int i=0;i<n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
				
		
		System.out.println("After Transpose");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//a[i][j]=in.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
			
	
	
	//exchanging 
	int end_point=n;
	int start_point=0;

	
	for(int i=0;i<n/2;i++)
	{
		end_point=end_point-1;
		for(int j=0;j<n;j++)
		{
			temp=a[j][end_point];
			a[j][end_point]=a[j][i];
			a[j][i]=temp;
			
		}
	}
	
	
	System.out.println("After rotation Matrix");
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
