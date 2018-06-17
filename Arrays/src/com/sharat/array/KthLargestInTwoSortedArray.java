package com.sharat.array;

public class KthLargestInTwoSortedArray {
	
	/** two pointer approach
	 * @desc log(n)
	 * @param arr1
	 * @param arr2
	 * @param k
	 * @return
	 */
	public int klargest(int arr1[],int arr2[],int k){
		
		//k th largest 
		k=arr1.length+arr2.length-k+1;
		System.out.println("effective k "+k);
		int ptr1=0;
		int ptr2=0;
		int recent=0;
		
		while((ptr1+ptr2)<k){
			if(arr1[ptr1]<arr2[ptr2])
			{
				recent=arr1[ptr1];
				ptr1++;
				
			}
			else
			{
				recent=arr2[ptr2];
				ptr2++;
				
			}
			System.out.println(recent);
		}
		
		return recent;
		
	}
	
	/** binary search approach
	 * 
	 * @param arr1
	 * @param arr2
	 * @param k
	 * @return
	 */
	public void klargest2(int arr1[],int arr2[],int k){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={4,6,9,10};
		int[] arr2={3,5,7,8};
		
		KthLargestInTwoSortedArray kl=new KthLargestInTwoSortedArray();
		int klargest=kl.klargest(arr1, arr2, 4);
		System.out.println("k th largest: "+klargest);
	}

}
