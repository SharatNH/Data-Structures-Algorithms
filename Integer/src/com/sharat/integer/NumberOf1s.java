package com.sharat.integer;

public class NumberOf1s {

	public int hammingWeight(int n) {

		/* this case fails for   2147483648 (10000000000000000000000000000000) */
		int bitCount=0;
		int oneBits=0;

		/* here due to cyclic representation of the value, when this number si given,
		 * it exceeds the +ve maximum of int. and hence we cannot do any such lower operation
		 * so we need to go for bitwise manipulations.
		 */
		while(n!=0 && bitCount<32){
			int bit=n%2;
			if(bit==1){
				oneBits++;
			}
			bitCount++;
			n=n/2;
		}

		return oneBits;
	}

	public int hammingWeight2(int n){
		int ones = 0;
		
		/*
		 * In Java we need to put attention on the fact 
		 * that the maximum integer is 2147483647
		 * 2147483648 is represented in Java as -2147483648 
		 * in java int type has a cyclic representation,
		 * that means Integer.MAX_VALUE+1==Integer.MIN_VALUE
		 */
		while(n!=0) {

			/*
			 * To count the 1s in the Integer representation we put the input int
			 * n in bit AND with 1 (that is represented as
			 * 00000000000000000000000000000001, and 
			 * if this operation result is 1,
			 * that means that the last bit of the input integer is 1. 
			 * Thus we add it to the 1s count.
			 */
			ones = ones + (n & 1);
			/*We need to use bit shifting unsigned operation >>> 
			 * (while >> depends on sign extension)
			 * 
			 */
			n = n>>>1;
		}
		return ones;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
