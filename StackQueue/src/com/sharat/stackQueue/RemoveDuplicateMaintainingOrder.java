package com.sharat.stackQueue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class RemoveDuplicateMaintainingOrder {

	public String removeDuplicates(String input){

		Map <Character,Integer> count=new HashMap<Character,Integer>();
		HashSet<Character> stackitems=new HashSet<Character>();
		Stack <Character> stack=new Stack<Character>();
		
		//count of no of characters
		for(int i=0;i<input.length();i++){
			if(count.containsKey((Character)input.charAt(i))){
				int value=count.get(input.charAt(i));
				value=value+1;
				count.put(input.charAt(i), value);
				System.out.println(input.charAt(i)+"  "+value);
			}
			else{
				count.put(input.charAt(i), 1);
				System.out.println(input.charAt(i)+"  "+1);
			}
		}

		for(int i=0;i<input.length();i++){	
			char ch=input.charAt(i);
			int tempcount=count.get(ch);
			count.put(ch, tempcount-1);
			//if element is already present then, skip current iteration
			if(stackitems.contains(ch))
				continue;
			//if current element in string is < than stack element,
			// and that element appears later in the string
			// then pop it else keep it
			while(stack.size()!=0 && ch<stack.peek() && count.get(stack.peek())!=0){
				//remove from stack and update the hashset
				char temp=stack.peek();
				System.out.println("contains: "+temp+" "+stackitems.contains(temp));
				stackitems.remove(stack.pop());
				System.out.println("contains: "+temp+" "+stackitems.contains(temp));
			}
			stack.push(ch);
			stackitems.add(ch);
		}
		
		System.out.println(stack);
		StringBuffer sb=new StringBuffer();
		// bcabc --- instack [c,b,a]
		while(stack.size()>0){
			sb.append(stack.pop());
		}
		
		//reverse it
		return sb.reverse().toString();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateMaintainingOrder rd=new RemoveDuplicateMaintainingOrder();
		String input="bcabc";
		String input2="cbacdcbc";
		
		System.out.println("input string : "+input2+"  output: "+rd.removeDuplicates(input2));

	}

}
