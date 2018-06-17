package com.sharat.array;

/**
 * http://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
 */
public class MinimumDistanceBetweenTwoNumbers {


	public int minDistance2(int input[],int x,int y){
		int prev=-1,i=0,minDist=Integer.MAX_VALUE,n=input.length;

		for(i=0;i<n;i++){
			if(input[i]==x||input[i]==y){
				prev=i;
				break;
			}
		}

		for(;i<n;i++){
			if(input[i]==x || input[i]==y){
				if(input[prev]!=input[i] && (i-prev)<minDist){
					minDist=i-prev;
					prev=i;
				}
				else
					prev=i;
			}
		}
		return minDist;

	}

	public int minDistance(int input[],int x, int y){
		int prev = -1;
		int prevFound = -1;
		int min = 10000;
		for(int i=0; i < input.length; i++){
			if(input[i] == x){
				if(prevFound == -1){
					prevFound = x;
					prev = i;
				}else if(prevFound == x){
					prev = i;
				}else{
					min = min > i - prev ? i -prev : min;
					prev = i;
					prevFound = x;
				}
			}else if(input[i] == y){
				if(prevFound == -1){
					prevFound = y;
					prev = i;
				}else if(prevFound == y){
					prev =i;
				}else{
					min = min > i - prev ? i -prev : min;
					prevFound = y;
					prev = i;
				}
			}
		}
		return min;
	}

	public static void main(String args[]){
		MinimumDistanceBetweenTwoNumbers mdb = new MinimumDistanceBetweenTwoNumbers();
		int input[] = {6,4,1,5,6,9,10,4,6,6};
		System.out.println(mdb.minDistance(input, 5, 6));
		System.out.println(mdb.minDistance2(input, 5, 6));
	}
}