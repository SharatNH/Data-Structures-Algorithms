package com.sharat.stackQueue;

import java.util.Stack;

/*
 * https://leetcode.com/problems/basic-calculator-ii/description/
 *  "3+2*2" = 7
	" 3/2 " = 1
	" 3+5 / 2 " = 5
 */

public class BasicCalculator2 {

	public int calculate(String s){
		int len;
		if(s==null || (len = s.length())==0) return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int num = 0;
		char sign = '+';
		for(int i=0;i<len;i++){
			if(Character.isDigit(s.charAt(i))){
				num = num*10+s.charAt(i)-'0';
			}
			if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
				if(sign=='-'){
					stack.push(-num);
				}
				if(sign=='+'){
					stack.push(num);
				}
				if(sign=='*'){
					stack.push(stack.pop()*num);
				}
				if(sign=='/'){
					stack.push(stack.pop()/num);
				}
				sign = s.charAt(i);
				num = 0;
			}
		}

		int re = 0;
		for(int i:stack){
			re += i;
		}
		return re;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator2 bc=new BasicCalculator2();
		String s="3+2*2";
		int result=bc.calculate(s);
		
		System.out.println("result: "+result);
	}

}
