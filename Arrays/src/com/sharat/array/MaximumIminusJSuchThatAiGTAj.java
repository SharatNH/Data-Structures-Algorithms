package com.sharat.array;

/*
 * https://www.geeksforgeeks.org/given-an-array-arr-find-the-maximum-j-i-such-that-arrj-arri/
 */
public class MaximumIminusJSuchThatAiGTAj {

	//brute force is o(n^2)
	/*
	 * this below one will fail for arr5 input
	 */
	public int findMax(int[] arr){

		int i=0;
		int j=arr.length-1;
		int pi=0,pj=0;
		while(i<=j){
			if(arr[i]>arr[j])
				i++;
			else{
				if(j-i>(pj-pi) && arr[j]>arr[i]){
					pi=i;
					pj=j;
				}
				j--;
			}	
		}

		System.out.println("i: "+pi+" j: "+pj);
		if(pi==pj)
			return -1;

		return (pj-pi);

	}

	int max(int x, int y) 
	{
		return x > y ? x : y;
	}

	int min(int x, int y) 
	{
		return x < y ? x : y;
	}

	int maxIndexDiff(int arr[]) 
	{
		int maxDiff;
		int i, j;
		int n=arr.length;
		int RMax[] = new int[n];
		int LMin[] = new int[n];

		/* Construct LMin[] such that LMin[i] stores the minimum value
	           from (arr[0], arr[1], ... arr[i]) */
		LMin[0] = arr[0];
		for (i = 1; i < n; ++i)
			LMin[i] = min(arr[i], LMin[i - 1]);

		/* Construct RMax[] such that RMax[j] stores the maximum value
	           from (arr[j], arr[j+1], ..arr[n-1]) */
		RMax[n - 1] = arr[n - 1];
		for (j = n - 2; j >= 0; --j)
			RMax[j] = max(arr[j], RMax[j + 1]);

		/* Traverse both arrays from left to right to find optimum j - i
	           This process is similar to merge() of MergeSort */
		i = 0; j = 0; maxDiff = -1;
		while (j < n && i < n) 
		{
			if (LMin[i] < RMax[j]) 
			{
				maxDiff = max(maxDiff, j - i);
				j = j + 1;
			} 
			else
				i = i + 1;
		}

		return maxDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumIminusJSuchThatAiGTAj max=new MaximumIminusJSuchThatAiGTAj();
		int[] arr={1,2,3,4,5,6};
		int[] arr2={6, 5, 4, 3, 2, 1};
		int[] arr3={9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		int[] arr4={34, 8, 10, 3, 2, 80, 30, 33, 1};
		
		//critical test case
		int[] arr5={11,14,13,1,4,13,1,10};
		int diffij=max.findMax(arr5);
		int diffij2=max.maxIndexDiff(arr5);
		System.out.println("difference btw i and j: "+diffij);
		System.out.println("difference btw i and j extra space method: "+diffij2);
	}

}
