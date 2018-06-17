package com.sharat.integer;

/* 
 * given a number n, find the trailing zeros in n!.
 *  eg: 5!=120, so return 1.
 */
public class FactorialTrailingZeros {

	/* this below method doesnt work after 14, since it exceeds the range
	 * so we need some other way to do so.
	 */
	public void factorial1(int n){
		long factorial=1;
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		}

		int count=0;

		while(factorial>0){

			if(factorial%10==0){   
				factorial=factorial/10;
				count++;
			}
			else{
				break;
			}

		}

		System.out.println(count);
	}

	/* here the concept is, the number of zeros is directly proportional to
	 * number of 5 in the factorial sequence.
	 * 
	 * Eg: 5! has 1 5 and 10! has 2 5. 
	 * similarly 15! has 3 5 and 30's.
	 * So we count the number of 5's we count the number of zeros.
	 * A twist to plot is, 25 will have additional 5 i.e 5*5 and any multiples of 25
	 * 
	 */
	public void trailingZeroes(int n) {

		int result = 0;

		// initial division with 5 will take care of all such individual 5.
		// next we need to take care of multiples of 25s.
		for(long i=5; n/i>0; i*=5){
			result += (n/i);
		}
		System.out.println(result);
	}

	public void trailingZeros2(int n){
		int r = 0;
		while (n > 0) {
			n /= 5;
			r += n;
		}
		System.out.println(r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
