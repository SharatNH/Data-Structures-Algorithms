package com.sharat.array;

/*
 * Find missing number in consecutive numbers.
 */
public class MissingNumberInConsecutiveNumbers {

	public int find_missing_number(int[] arr){

		int low=0;
		int high=arr.length-1;

		while(low<high){
			float actualmedian=calulateMedian(arr,low,high);
			float expectedmedian=(float)(arr[high]+arr[low])/2;

			System.out.println(low+" "+high);
			System.out.println(actualmedian+" "+expectedmedian);
			if(actualmedian==expectedmedian){
				//System.out.println(low+" "+high);
				if(high-low==1 && arr[high]-arr[low]>1)
					return arr[low]+1;
				else if(high-low==1 && arr[high]-arr[low]==1)
					return -1;
				else
					low=(high+low)/2;
			}
			else if(actualmedian<expectedmedian){

				low=(high+low)/2;

			}
			else{
				high=(low+high)/2;
			}
		}

		return -1;
	}

	public float calulateMedian(int[] arr,int low, int high){

		int len = high - low+1;
		if(len % 2 == 0){
			return (float)(arr[low + len/2] + arr[low+ len/2-1])/2;
		}else{
			return (float)arr[low+len/2];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberInConsecutiveNumbers mn=new MissingNumberInConsecutiveNumbers();
		int[] arr1={3,4,5,6,7,8,9,11,12};
		int[] arr2={1,2,3,4,6,7,8};
		int[] arr3={3,4,5,6,7,8,9,10,11,12};
		System.out.println("result: "+mn.find_missing_number(arr2));
	}

}
