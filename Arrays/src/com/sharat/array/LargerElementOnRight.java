package com.sharat.array;

import java.util.Stack;

/*
 * O(n)
 */

public class LargerElementOnRight {

	public int[] largerelement(int[] arr){
		
		Stack <Integer> st=new Stack<Integer>();
		
		int[] res=new int[arr.length];
		
		/* pushing elements wont work 
		 * ex: 13 7 6 12
		 * all will be -1 
		 */
//		for(int i=arr.length-1;i>=0;i--){
//			st.push(arr[i]);
//		}
		
		st.push(0);
		for(int i=1;i<arr.length;i++){
			while(st.size()!=0 && arr[i]>arr[st.peek()]){
				res[st.peek()]=arr[i];
				st.pop();
			}
			if(st.size()==0 || arr[i]<arr[st.peek()]){
				st.push(i);
			}
			
		}
		
		while(!st.isEmpty()){
			res[st.pop()]=-1;
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={13,7,6,12};
		int[] arr2={4, 5, 2, 25};
		LargerElementOnRight le=new LargerElementOnRight();
		int[] res=le.largerelement(arr2);
		
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}

}
