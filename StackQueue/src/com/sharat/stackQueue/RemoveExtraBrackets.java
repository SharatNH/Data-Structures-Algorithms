package com.sharat.stackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveExtraBrackets {
	/* 
	 * Using stack approach wont work 
	 * ex: (((abc)(lm))
	 * This cant differiate which '(' should be placed for ')' 
	 * so result would be (((abc)lm))
	 */ 
	public String removeExtra(String input){

		Deque <Integer> dq=new LinkedList<Integer>();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='(')
			{
				dq.addFirst(i);
			}
			else if(input.charAt(i)==')')
			{			
				if(dq.size()!=0 && input.charAt(dq.peekFirst())=='('){
					dq.pollFirst();
				}
				else{
					dq.addFirst(i);
				}
			}
			else{
				//if character in between '(' and ')'
				continue;
			}
		}

		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<input.length();i++){
			if(dq.size()!=0 && dq.peekLast()==i){
				dq.pollLast();
				
			}
			else{
				sb.append(input.charAt(i));
			}
		}
		
		return sb.toString();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveExtraBrackets reb=new RemoveExtraBrackets();
		String input="(((abc)(lm)(()";
		String input2=")(";
		String input3="((mnq)abc)))";
		String input4="(a)";
		System.out.println("processed string: "+reb.removeExtra(input));
		System.out.println("processed string 2: "+reb.removeExtra(input2));
		System.out.println("processed string 3: "+reb.removeExtra(input3));
		System.out.println("processed string 4: "+reb.removeExtra(input4));
	}

}
