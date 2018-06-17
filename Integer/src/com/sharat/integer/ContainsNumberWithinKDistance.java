package com.sharat.integer;

import java.util.TreeSet;

/*
 * https://leetcode.com/problems/contains-duplicate-iii/description/
 * 
 * Given an array of integers,
 * find out whether there are two distinct indices i and j in the array such that the difference
 * between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
 * 
 *
 * Time complexity O(nlogk)
 */
public class ContainsNumberWithinKDistance {

	/* doing with 2 for loops is not feasibile,
	 * especially at corner cases like 
	 *  [-1,2147483647] 1 2147483647 
	 *  This will lead to overflow
	 *  
	 *  So we need to go for hashmap/treemap
	 *  
	 *  since we need any element within k indexes with difference t,
	 *  we go for tree map where we have ceiling and floor methods
	 */

	public boolean containsNearbyAlmostDuplicate(int[] nums,int k,int t){
		//boolean containsDuplicate=false;
		if (nums == null || nums.length < 1 || k < 0 || t < 0) return false;
		final TreeSet<Long> values = new TreeSet<Long>();
		
		for (int ind = 0; ind < nums.length; ind++) {

			/* it returns greatest element which is less than or equal to
			 * i.e next lesser element
			 * the passed number. if no such element, then null
			 * 12,11,16,15 and if 13 is passed then it returns 12
			 */
			
			final Long floor = values.floor((long)nums[ind] + t);
			
			/*
			 * it returns element which is least greater than or equal to
			 * passed number. 
			 * i.e next greater element
			 * if no such element, then null
			 * ex: 12,11,16,15 and if 13 is passed then, it returns 15.
			 */
			final Long ceil = values.ceiling((long)nums[ind] - t);
			
			if ((floor != null && floor >= nums[ind])
					|| (ceil != null && ceil <= nums[ind])) {
				return true;
			}

			values.add((long)nums[ind]);
			
			/* if index exceeds k, then remove it.
			 * Thus any match will be within k indexes
			 */
			if (ind >= k) {
				values.remove((long)nums[ind - k]);
			}
		}

		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*                   this example requires long
		 * [1,2]  [-1,-1] 	[-2147483648,-2147483647]
		 *	1		1				3
		 *	-1		0				3
		 */
	}

}
