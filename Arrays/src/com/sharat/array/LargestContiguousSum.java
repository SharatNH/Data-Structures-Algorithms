package com.sharat.array;

/* 
 * http://www.geeksforgeeks.org/?p=576
 */
class result{

	int max;
	int start;
	int end;
}
public class LargestContiguousSum {



	static result maxSubArraySum(int a[])
	{
		int size = a.length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start=0, end=0, s=0;
		for (int i = 0; i < size; i++)
		{
			sum = sum + a[i];

			if (max < sum){
				max = sum;
				start=s;
				end=i;
			}

			if (sum < 0){
				sum = 0;
				s=i+1;
			}

		}

		result r=new result();
		r.max=max;
		r.start=start;
		r.end=end;
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		result r=maxSubArraySum(a);
		System.out.println("Maximum contiguous sum is " +r.max+ " start: "+r.start+" end: "+r.end);

	}

}
