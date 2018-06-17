package com.sharat.array;

/*
 * https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
 */
public class MaximumOfSubarrayOfSizeK {

	/* brute force will be O(n^2)
	 * 
	 * in this sliding window method, O(n)
	 */
	public void maxsubarray(int[] arr,int k){

		int max=Integer.MIN_VALUE;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumOfSubarrayOfSizeK max_sub=new MaximumOfSubarrayOfSizeK();
		int[] arr={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int k=3;
		
		
		//int[] max_sub_array=max_sub.maxsubarray(arr, k);

		System.out.println("max sub array: ");
//		for(int i=0;i<max_sub_array.length;i++)
//			System.out.print(max_sub_array[i]+" ");
	}

}
