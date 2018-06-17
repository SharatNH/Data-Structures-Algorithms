/*
 *  Write a program to check whether a given number is an ugly number.

	Ugly numbers are positive numbers whose prime factors 
	only include 2, 3, 5. 
	For example, 6, 8 are ugly while 14 is not ugly since it 
	includes another prime factor 7.

	Note that 1 is typically treated as an ugly number.
 */


public class uglyNumber {
	
	public static boolean isUgly(int num) {
	    if (num <= 0) {return false;}
	    if (num == 1) {return true;}
	    if (num % 2 == 0) {
	        return isUgly(num/2);
	    }
	    if (num % 3 == 0) {
	        return isUgly(num/3);
	    }
	    if (num % 5 == 0) {
	        return isUgly(num/5);
	    }
	    return false;
	}
	
	public static boolean isUgly2(int num){

	        if (num <= 0) {
	            return false;
	        }
	        
	        int[] divisors = {2, 3, 5};
	        
	        for(int d : divisors) {
	            while (num % d == 0) {
	                num /= d;
	            }
	        }
	        return num == 1;
	    
	}

	public static void main(String[] args) {
			
		int num=7;
		int num2=8;
		System.out.println(" is the number ugly? :"+uglyNumber.isUgly(num));
		System.out.println(" is the number ugly 2 ?:"+uglyNumber.isUgly2(num2));

	}

}
