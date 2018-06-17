package com.sharat.array;

/* Given a sorted array of integers, find the starting and 
 * ending position of a given target value.
 *
 * Time complexity O(logn)
 * Space complexity O(1)
 * 
 * https://leetcode.com/problems/search-for-a-range/
 */



public class SearchForRange {

	public int[] searchRange(int[] nums, int target){

		int start=search_target_first(nums,target);
		int end;
		if(start>=0)
			 end=search_target_last(nums,target,start+1);
		else
			return new int[]{-1,-1};
		
		if(start>=0 && end>=0)
			return new int[]{start,end};
		else
			return new int[]{start,start};
	}

	public int search_target_first(int[] nums,int target){

		int low=0;
		int high=nums.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(nums[mid]==target && (mid==0 || nums[mid]>nums[mid-1])){
				return mid;
			}
			else if(nums[mid]<target){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		
		return -1;
	}

	public int search_target_last(int[] nums,int target,int low){
		int high=nums.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(nums[mid]==target && (mid==nums.length-1 || nums[mid]<nums[mid+1])){
				return mid;
			}
			else if(nums[mid]<=target){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchForRange searchForRange = new SearchForRange();
		int[] nums1 = {0, 1, 1, 3, 6, 9, 11};
		int[] nums2={5, 7, 7, 8, 8, 10};
		int[] nums3={2,2,2};
		int[] r = searchForRange.searchRange(nums1, 11);
		System.out.println(r[0] + " " + r[1]);
		
		r = searchForRange.searchRange(nums2, 8);
		System.out.println(r[0] + " " + r[1]);
		
		r = searchForRange.searchRange(nums3, 2);
		System.out.println(r[0] + " " + r[1]);
	}

}
