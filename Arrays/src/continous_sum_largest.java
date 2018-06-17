import java.util.*;


/*
 * find the largest sum of contiguous subarray
 * 
 * 
 */

public class continous_sum_largest {

	public static void main(String[] args)
	{
		
		int [] a = {-5,-3,2,1,-7};
		
		int sum=0;
		int i=0;
		int j=a.length-1;
		
		//calculating the sum;
		
		for(int k=0;k<a.length;k++)
			sum=sum+a[k];
		
		int temp_sum1=0;
		int temp_sum2=0;
		
		boolean status=false;
		
		while(i<j && (!status))
		{
			
			temp_sum1=sum-a[i];
			temp_sum2=sum-a[j];
			
			if((sum>temp_sum1)&&(sum>temp_sum2))
			{
				status=true;
				
			}
			else
			{
				if(temp_sum1>temp_sum2)
				{
					i++;
					sum=temp_sum1;
				}
				else
				{
					j--;
					sum=temp_sum2;
				}
			}
			
		}
		
		
		//printing the max output range
		System.out.println("Sum:"+sum);
		for(int k=i;k<=j;k++)
		{
			System.out.print(a[k]+" ");
		}
		
	}
	
}
