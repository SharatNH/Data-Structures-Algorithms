package com.sharat.array;

import java.util.HashSet;

public class GroupElementsInSizeM {

	public int[] groupelements(int[] arr, int m){

		int n=arr.length;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<n-1;i++){
			if(set.contains(arr[i])){
				int j=i+1;
				while(set.contains(arr[j])){
					//	System.out.println(i+" "+arr[i]+" "+j+" "+arr[j]);
					j++;
				}			
				//System.out.println("swap "+arr[i]+" and "+arr[j]);
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;			
			}
			set.add(arr[i]);
			if((i+1)%m == 0){	
				set.clear();
				//System.out.println("clear"+i+" "+set.size());
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,1,1,1,1,1,3,4,4,4,5};
		int m=2;
		GroupElementsInSizeM ge=new GroupElementsInSizeM();
		int[] result=ge.groupelements(arr, m);

		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");

	}

}
