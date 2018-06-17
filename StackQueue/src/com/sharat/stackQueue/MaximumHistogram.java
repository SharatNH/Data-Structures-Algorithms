package com.sharat.stackQueue;

import java.util.Stack;

public class MaximumHistogram {


	public int maxHistogram(int[] input){

		Stack<Integer> s=new Stack<Integer>();
		int i=0;
		int area=0;
		int maxArea=-1;
		while(i<input.length){
			if(s.isEmpty())
			{
				s.push(i);	
				//System.out.println("first element pushed "+s.peek()+ " "+ input[s.peek()]);
			}
			else{
				if(input[i]>input[s.peek()]){
					//System.out.println("current value "+input[i]+" > stack top "+input[s.peek()]);
					s.push(i);
				}
				else{
					//System.out.println("current value "+input[i]+" < stack top "+input[s.peek()]);
					while(input[i]<input[s.peek()]){
						int top=s.pop();
						if(s.isEmpty()){
							area=(input[top])*i;
						}
						else{
							area=input[top]*(i-s.peek()-1);
						}
						if(area>maxArea)
							maxArea=area;

						if(s.isEmpty())
							break;
					}

					s.push(i);
				}
			}
			i++;
		}

		//System.out.println(" i value: "+i+ " top of stack"+s.peek());
		while(!s.isEmpty()){
			int top=s.pop();
			if(s.isEmpty()){
				area=input[top]*i;	
			}
			else{
				area=input[top]*(i-s.peek()-1);
			}
			if(area>maxArea)
				maxArea=area;
		}
		return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumHistogram mh=new MaximumHistogram();
		int input[]={2,1,2,3,1}; //maxarea=5
		int input2[]={6, 2, 5, 4, 5, 1, 6}; //maxarea=12
		int input3[] = {2,2,2,6,1,5,4,2,2,2,2}; //maxarea=12
		int maxArea=mh.maxHistogram(input3);
		System.out.println("max area: "+maxArea);
	}

}
