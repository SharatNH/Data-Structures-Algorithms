package com.sharat.integer;

/*
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 
 * (represented in binary as 00000010100101000001111010011100), 
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class ReverseBits {

	//wont work when reverse no > Int.max
	public void mymethod(int n){

		StringBuffer sb=new StringBuffer();
		//convert to binary
		while(n>0){
			int rem=n%2;
			n=n/2;
			sb.append(rem);
		}
		System.out.println(sb.toString());	
		while(sb.length()<32){
			sb.append(0);
		}
		System.out.println(sb.toString());
		System.out.println(sb.reverse().toString());
		//convert to integer
		int i=0,newValue=0;
		while(i<32){
			int bitvalue=(int)sb.charAt(i)-'0';
			//	System.out.println(bitvalue);
			newValue+=bitvalue*Math.pow(2,i);
			i++;
		}		
		System.out.println(newValue);
	}

	public void reverseBits(int n) {
		StringBuffer sb = new StringBuffer();
		String s = Integer.toBinaryString(n);
		for(int i = 0; i < 32-s.length(); i++)
			sb.append('0');
		s = sb.toString() + s;

		System.out.println(s);
		char[]  c = s.toCharArray();
		int r = 0;
		for(int i = 0; i < 32; i++){
			if(c[i] == '1'){
				System.out.print(r+" "+i+" "+(1<<i)+" || ");
				r += (1 << i);
				System.out.println(r+" "+i);
			}
		}
		System.out.println(r);
	}
	
	public int reverseBits2(int n) {
	    if (n == 0) return 0;
	    
	    int result = 0;
	    
	    //here result moves left while n will move right
	    // so result has reverse of n
	    for (int i = 0; i < 32; i++) {
	    	//result=result<<1 
	    	// on every iteration left shift. zero is inserted
	        result <<= 1;
	        // result++ is same as adding 1 bit to the bit sequence
	        
	        // & operation to check if last bit is 0 or 1.
	        if ((n & 1) == 1) result++;
	        n >>= 1;
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBits rb=new ReverseBits();
		//43261596  ans 964176192 
		// 1  ans 2147483648 (10000000000000000000000000000000)
		//  2147483648 (10000000000000000000000000000000) ans 1
		int n=1;
		//rb.mymethod(n);
		rb.reverseBits(n);
	}

}
