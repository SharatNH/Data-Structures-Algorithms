package com.sharat.array;

import java.util.HashMap;
import java.util.Map;

/** http://www.cdn.geeksforgeeks.org/check-for-majority-element-in-a-sorted-array/
 *  @author sharat
 *
 */

public class FirstOccurrenceOfMajoirtyNumber {

	public boolean majority_element(int[] arr, int item){
		int n=arr.length;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==item && arr[i+(n/2)]==item )
				return true;
		}		
		return false;
	}

	public int first_occurrence(int input[],int item){
		int low = 0;
		int high = input.length-1;

		while(low <= high){
			int middle = (low + high)/2;
			if(input[middle] == item && (middle == 0 || input[middle-1] < item)){
				return middle;
			}else if(input[middle] < item){
				low = middle+1;
			}else{
				high = middle-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstOccurrenceOfMajoirtyNumber fos = new FirstOccurrenceOfMajoirtyNumber();
		int input[] = {1,2,2,2,2,2,5,7,7};
		int majority_element=2;
		//checking for majority element
		int index=fos.first_occurrence(input, majority_element);
		if(input[index+ (input.length)/2]==majority_element){
			System.out.println("the number "+majority_element+ " is a majority element");
		}
		else
			System.out.println("the number "+majority_element+" is not majority element");

		System.out.println(" is it majority element? "+fos.majority_element(input, 2));
	}

}
