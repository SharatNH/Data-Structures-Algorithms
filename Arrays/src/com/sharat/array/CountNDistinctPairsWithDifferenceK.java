package com.sharat.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * http://www.geeksforgeeks.org/count-pairs-difference-equal-k/
 */

public class CountNDistinctPairsWithDifferenceK {

	//invokes binary search and keeps track of count
	public int invoke_binary_search(int[] arr,int k){
		Arrays.sort(arr);
        int count = 0;
        for(int i=0; i < arr.length; i++){
            boolean result = binarySearch(arr, i+1, arr.length-1, arr[i] + k);
            if(result){
                count++;
            }
        }
        return count;
	}
	
	//performs binary search and returns booleans values
	private boolean binarySearch(int arr[],int start,int end,int num){
        if(start > end){
            return false;
        }
        int mid = (start + end)/2;
        if(arr[mid] == num){
            return true;
        }
        else if(arr[mid] > num){
            return binarySearch(arr,start,mid-1,num);
        }else{
            return binarySearch(arr,mid+1,end,num);
        }
    }
	
	//hashset based search
	public int hash_map_based_sol(int[] arr,int k){
		
		//load values into hashmap
		Arrays.sort(arr);
		Set<Integer> map=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			map.add(arr[i]);
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(map.contains(arr[i]+k)){
				count++;
			}
		}
		
		if(count==0)
			return -1;
		
		return count;
	}
	
	//sorting and using 2 pointers
	public int pointer_function(int[] arr,int k){
		
		Arrays.sort(arr);
		
		int left_ptr=0;
		int right_ptr=0;
		int count=0;
		while(right_ptr<arr.length){
			
			int diff=arr[right_ptr]-arr[left_ptr];
			
			//if diff is bigger than k, then more elements are present in the cal range
			if(diff>k){
				left_ptr++;
			}
			else if(diff<k){
				right_ptr++;
			}
			else if(diff==k){
				count++;
				left_ptr++;
				right_ptr++;
			}	
		}
		
		if(count==0)
			return -1;
		else
			return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNDistinctPairsWithDifferenceK cn = new CountNDistinctPairsWithDifferenceK();
        int arr[] = {1,2,3,4,5,7,9};
        System.out.println("binary search result: "+cn.invoke_binary_search(arr, 3));
        System.out.println("hashset based result: "+cn.hash_map_based_sol(arr, 3));
        System.out.println("using 2 pointers: "+cn.pointer_function(arr, 3));
	}

}
