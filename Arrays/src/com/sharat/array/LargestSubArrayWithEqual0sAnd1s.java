package com.sharat.array;

import java.util.HashMap;

public class LargestSubArrayWithEqual0sAnd1s {

	public int[] equalnumber(int[] arr){

		int[] sum=new int[arr.length];
		sum[0]= arr[0] ==0 ? -1 : 1;
		for(int i=1;i<arr.length;i++)
			sum[i]=sum[i-1]+(arr[i]==0?-1:1);

		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int maxLength=0,ending_index=-1;
		//consider 1 1 1 0 0 0
		// sum     1 2 3 2 1 0

		for(int i=0;i<sum.length;i++){

			/* if sum==0 and no futher occurence can be found
			 * ex: 10  or 111000
			 */
			
			if(sum[i]==0){
				maxLength=i+1;
				ending_index=i;
			}


			//if the sum is new, then put it to hashmap 
			if(map.containsKey(sum[i])){

				/** @desc
				 * check with maxlength, distance between previous occurrence
				 * of the sum and current occurence. This means the middle element
				 * balance out. 

				 * If their is any other sequence with larger length, 
				 * dont override it
				 */
				if(maxLength<i-map.get(sum[i])){
					maxLength=i-map.get(sum[i]);
					ending_index=i;
				}
			}
			else{
				//store the sum and its index
				map.put(sum[i],i);
			}
		}
		
		int start=ending_index-maxLength+1;
		int[] result={start,ending_index};
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 0, 1, 1, 1, 0, 0};
		int arr2[] = {0,0,0,1,0,1,0,0,1,0,0,0};
		int arr3[] = {1,1,1,1};
		LargestSubArrayWithEqual0sAnd1s lsa=new LargestSubArrayWithEqual0sAnd1s();
		int[] subarray=lsa.equalnumber(arr3);

		System.out.println("start : "+subarray[0]+" end : "+subarray[1]+ " length: "+(subarray[1]-subarray[0]+1));
	}

}
