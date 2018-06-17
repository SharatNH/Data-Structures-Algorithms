package com.sharat.integer;

/*
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */

/*
 * 
 * Given an array of n integers where n > 1, nums, 
 * return an array output such that output[i] is equal to the product 
 * of all the elements of nums except nums[i].
 * 
 * space complexity: constant space complexity
 * time complexity: O(n)
 */
public class ProductOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int[] result=new int[nums.length];

		//left side 
		int left=1;
		result[0]=left;

		for(int i=1;i<nums.length;i++){
			result[i]=result[i-1]*nums[i-1];
		}

		//right side
		int right=1;

		for(int i=nums.length-1;i>=0;i--){
			result[i]=result[i]*right;
			right=right*nums[i];
		}

		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4};
		int[] result=productExceptSelf(nums);
		for(int item:result)
			System.out.print(item+" ");
	}

}
