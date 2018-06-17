package com.sharat.integer;

import java.util.HashMap;

public class MaximumSizeSubArrayWithSumK {

	public int maxSubArrayLen(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
	    int max = 0;
	 
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum += nums[i];
	 
	        if(sum==k){
	            max = Math.max(max, i+1);
	        }  
	 
	        int diff = sum-k;
	 
	        if(map.containsKey(diff)){
	            max = Math.max(max, i-map.get(diff));
	        }
	 
	        if(!map.containsKey(sum)){
	            map.put(sum, i);
	        }
	    }
	 
	 
	    return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSizeSubArrayWithSumK sum=new MaximumSizeSubArrayWithSumK();
		int[] nums1={1, -1, 5, -2, 3};
		int k1=3;  //4
		
		int[] nums2={-2, -1, 2, 1};
		int k2=1;  //2
		
		int length=sum.maxSubArrayLen(nums1, k1);
		System.out.println("length: "+length);

	}

}
