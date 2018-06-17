package com.sharat.array;

/* https://www.geeksforgeeks.org/increasing-subsequence-of-length-three-with-maximum-product/
 * 
 */
public class IncreasingSubsequnceOfLength3WithMaxProduct {
	
	/** 
	 * @func maxproduct
	 * @desc brute force 
	 * 
	 * @param input
	 * @return
	 */
	public int[] maxproduct(int[] input){

		int[] seq=new int[3];
		int i=0,j=0;
		int n=input.length;
		int max=Integer.MIN_VALUE;
		for(i=0;i<n-2;i++){
			for(j=i+1;j<n-1;j++){
				if((input[i]<input[j] && input[j]<input[j+1])){
					int product=input[i]*input[j]*input[j+1];
					if(product>max){
						max=product;
						seq[0]=input[i];
						seq[1]=input[j];
						seq[2]=input[j+1];
					}
				}
			}
		}

		return seq;
	}
	
	/** @ func maxproduct2
	 * @desc maxproduct using 2 arrays
	 * @param input
	 */
	//avl tree nlogn
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreasingSubsequnceOfLength3WithMaxProduct is=new IncreasingSubsequnceOfLength3WithMaxProduct();
		int[] input={1,5,10,8,9};
		int[] input2={6, 7, 8, 1, 2, 3, 9, 10};
		int[] result=is.maxproduct(input2);
		
		
		for(int i=0;i<3;i++)
			System.out.print(result[i]+" ");
	}

}
