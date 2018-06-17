package com.sharat.integer;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersBeforeN {
	
	public List<Integer> primeNumbers1(int n){
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		boolean prime=true;
		for(int i=3;i<=n;i++){
			for(int num:list){
				if(2*num>i)
					break;
				if(i%num==0){
					prime=false;
					break;
				}
			}
			
			if(prime)
				list.add(i);
			
			prime=true;
			
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbersBeforeN pn=new PrimeNumbersBeforeN();
		List<Integer> result=pn.primeNumbers1(150);
		System.out.println(result);
	}

}
