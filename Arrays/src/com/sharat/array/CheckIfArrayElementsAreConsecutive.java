package com.sharat.array;

import java.util.Arrays;

public class CheckIfArrayElementsAreConsecutive {

	/* The function checks if the array elements are consecutive
	       If elements are consecutive, then returns true, else returns
	       false */
	boolean areConsecutive_extraArray(int arr[], int n) 
	{
		if (n < 1)
			return false;

		/* 1) Get the minimum element in array */
		int min = getMin(arr, n);

		/* 2) Get the maximum element in array */
		int max = getMax(arr, n);

		/* 3) max - min + 1 is equal to n,  then only check all elements */
		if (max - min + 1 == n) 
		{
			/* Create a temp array to hold visited flag of all elements.
	               Note that, calloc is used here so that all values are initialized 
	               as false */
			boolean visited[] = new boolean[n];
			int i;
			for (i = 0; i < n; i++) 
			{
				/* If we see an element again, then return false */
				if (visited[arr[i] - min] != false)
					return false;

				/* If visited first time, then mark the element as visited */
				visited[arr[i] - min] = true;
			}

			/* If all elements occur once, then return true */
			return true;
		}
		return false; // if (max - min  + 1 != n)
	}


	public boolean areConsecutive_sorting(int arr[]){

		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i+1]-arr[i]!=1)
				return false;
		}
		return true;
	}

	public boolean areConsecutive_inplace(int arr[]){

		int min=getMin(arr, arr.length);
		for(int i=0;i<arr.length;i++){

			if(Math.abs(arr[i])-min>=arr.length)
				return false;
			if(arr[Math.abs(arr[i])-min]<0)
				return false;

			arr[Math.abs(arr[i])-min]=-arr[Math.abs(arr[i])-min];
		}
		return true;
	}
	
	/* UTILITY FUNCTIONS */
	int getMin(int arr[], int n) 
	{
		int min = arr[0];
		for (int i = 1; i < n; i++) 
		{
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	int getMax(int arr[], int n) 
	{
		int max = arr[0];
		for (int i = 1; i < n; i++) 
		{
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	/* Driver program to test above functions */
	public static void main(String[] args) 
	{
		CheckIfArrayElementsAreConsecutive consecutive = new CheckIfArrayElementsAreConsecutive();
		int arr[] = {5, 4, 2, 3, 1, 6,5};
		int n = arr.length;
		
		/////////////////////////
		//// extra space //////////
		//////////////////////
		System.out.println("extra space");
		if (consecutive.areConsecutive_extraArray(arr, n) == true)
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not consecutive");
		
		//////////////////////////////
		////// inplace ////////////
		//////////////////////////
		System.out.println("inplace");
		if (consecutive.areConsecutive_inplace(arr))
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not consecutive");

		////////////////////////////
		////// sorting /////////////
		///////////////////////////
		System.out.println("sorting");
		if (consecutive.areConsecutive_sorting(arr))
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not consecutive");

	}

}
