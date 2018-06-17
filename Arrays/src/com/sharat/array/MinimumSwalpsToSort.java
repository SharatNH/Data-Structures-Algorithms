package com.sharat.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * http://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
 */

/*
 * time complexity: nlogn
 * space complexity: O(n)
 */
public class MinimumSwalpsToSort {
	public int findMinSwapsToSort(int[] ar) {
	    int n = ar.length;
	    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	    for (int i = 0; i < n; i++) {
	        m.put(ar[i], i);
	    }
	    Arrays.sort(ar);
	    for (int i = 0; i < n; i++) {
	        ar[i] = m.get(ar[i]);
	    }
	    m = null;
	    int swaps = 0;
	    for (int i = 0; i < n; i++) {
	        int val = ar[i];
	        if (val < 0) continue;
	        while (val != i) {
	            int new_val = ar[val];
	            ar[val] = -1;
	            val = new_val;
	            swaps++;
	        }
	        ar[i] = -1;
	    }
	    return swaps;
	}
	
	public static void main(String[] args){
		int[] arr={1,3,2,4};
		MinimumSwalpsToSort swalps=new MinimumSwalpsToSort();
		int no_of_swalps=swalps.findMinSwapsToSort(arr);
		System.out.println("no of swalps: "+no_of_swalps);
		
	}
}
