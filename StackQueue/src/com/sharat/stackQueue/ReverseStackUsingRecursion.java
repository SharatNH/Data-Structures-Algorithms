package com.sharat.stackQueue;

import java.util.Iterator;
import java.util.Stack;

public class ReverseStackUsingRecursion {
	static Stack <Integer> input=new Stack<Integer>();
	public void reverseStack(){
		
		if(input.isEmpty())
			return ;
		
		int pop=(Integer) input.pop();
		
		reverseStack();
		insertAtBottom(pop);
		
	}
	
	public void insertAtBottom(int item){
		
		if(input.isEmpty())
		{
			input.push(item);
		}
		else{
			int temp=input.pop();
			insertAtBottom(item);
			input.push(temp);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStackUsingRecursion rs=new ReverseStackUsingRecursion();
		
		input.push(1);
		input.push(2);
		input.push(3);
		
		System.out.println("before reverse");
		Iterator itr=input.iterator();
		while(itr.hasNext()){
			Integer item=(Integer) itr.next();
			System.out.println(item);
		}	
		rs.reverseStack();
		
		System.out.println("after reverse");
		itr=input.iterator();
		while(itr.hasNext()){
			Integer item=(Integer) itr.next();
			System.out.println(item);
		}
	}

}
