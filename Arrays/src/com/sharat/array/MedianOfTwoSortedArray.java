package com.sharat.array;

/* http://www.geeksforgeeks.org/median-of-two-sorted-arrays/
 * O(logn) efficiency
 */
public class MedianOfTwoSortedArray {

	public float cal_median(int[] arr1,int[] arr2){

		int low1=0,low2=0,high1=arr1.length-1,high2=arr2.length-1;

		while(true){

			//if no of elements in each array is 1.
			if(high1==low1){
				return ((arr1[low1]+arr2[low2])/2);
			}
			
			//if no of elements in each array is 2
			if(high1-low1==1){
				return ((Math.max(arr1[low1],arr2[low2])+Math.min(arr1[high1], arr2[high2]))/2);
			}

			//get medians of first and second array respectively
			float median1=median(arr1,low1,high1);
			float median2=median(arr2,low2,high2);

			/* if median1<median2, then median of 2 array will be in:
			 * arr1[median1....high] so low1 should start from mid2
			 * arr2[low....median2] so high2 should be at mid2
			 */
			if(median1<=median2){
				//len=(high-low)+1
				if((high1-low1)+1%2==0){
					low1=(low1+high1)/2;
					high2=(low2+high2)/2+1;	
				}
				else{
					low1=(low1+high1)/2;
					high2=(low2+high2)/2;
				}
			}
			else{
				/* if median1>median2, then median of 2 array will be at:
				 * arr1[low....median1] so high1=mid1
				 * arr2[median2....high] so low2=mid
				 * 
				 */
				if((high1-low1)+1%2==0){
					low2=(low2+high2)/2;
					high1=(low1+high1)/2+1;
				}
				else{
					low2=(low2+high2)/2;
					high1=(low1+high1)/2;
				}
			}
		}
	}

	public float median(int[] arr,int low,int high){
		
		int len = high - low+1;
		if(len % 2 == 0){
			return (arr[low + len/2] + arr[low+ len/2-1])/2;
		}else{
			return arr[low+len/2];
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,12,15,26,38};
		int arr2[]={2,13,17,30,45};


		//int arr1[]={1,2,3,4,6};
		//int arr2[]={-1,5,6,7,8};

		MedianOfTwoSortedArray mts=new MedianOfTwoSortedArray();
		float median=mts.cal_median(arr1, arr2);

		System.out.println("median: "+median);


	}

}
