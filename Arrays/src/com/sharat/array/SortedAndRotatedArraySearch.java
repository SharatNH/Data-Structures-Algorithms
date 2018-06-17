package com.sharat.array;

/*
 * https://leetcode.com/problems/target-in-rotated-sorted-numsay/description/
 */

public class SortedAndRotatedArraySearch {

	/** 
	 * @desc takes input rotated sorted numsay
	 * @param nums
	 * @param target
	 * @return index
	 */
	public int search_target(int[] nums,int target){
		int low=0;
		int high=nums.length-1;

		while(low<=high){

			int mid=(low+high)/2;
			
			if(nums[mid]==target)
				return mid;
			
			 if(nums[mid] < nums[high]){
	                if(nums[mid] < target && target <= nums[high]){
	                    low = mid+1;
	                }else{
	                    high = mid-1;
	                }
	            }else{
	                if(target >= nums[low] && target < nums[mid]){
	                    high = mid-1;
	                }else{
	                    low = mid+1;
	                }
	            }
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedAndRotatedArraySearch sr=new SortedAndRotatedArraySearch();
		int nums1[]={4,5,6,7,8,1,2,3};
		int nums2[] = {1,2,5,6,7,8,11,21};
		int nums3[] = {18,21,1,2,5,6,7,8,10,15};
		int target=8;
		int target_index=sr.search_target(nums1, target);
		System.out.println("target "+target+" index: "+target_index);
	}

}
