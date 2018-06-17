package com.sharat.integer;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 */
public class KthLargestElementInArray {

	//my method using sort
	// nlog(n) time complexity + O(1) space complexity
	public int findKthLargest(int[] nums, int k) {
		if(k<=0)
			return -1;
		Arrays.sort(nums);
		int n=nums.length;
		return nums[n-k];
	} 

	//using priority queue
	/*
	 * using priority queues, stores items in natural order i.e sorted order
	 * heap structure
	 * 
	 * 
	 */

	//time complexity - nlog(k) and space complexity O(k)
	// offer() and poll() methods have O(lg K) complexity and 
	//altogether since you doing this operation N times 
	//the total complexity is O(N lg K)
	
	
	public int findKthLargest2(int[] nums,int k){
		final PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int val : nums) {
			pq.offer(val);

			if(pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,2,1,5,6,4};
		int k=2;
		
		KthLargestElementInArray klargest=new KthLargestElementInArray();
		System.out.println("first method: "+klargest.findKthLargest(arr, k));
		System.out.println("second method: "+klargest.findKthLargest2(arr, k));
	}

}
