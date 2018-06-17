import java.util.Arrays;


/*
 * Given an array of integers, every element appears twice except for one. 
 * Find that single one.
 */

public class array_count_1 {

	/*my solution*/
	public int singleNumber(int[] nums) {

		Arrays.sort(nums);
		int i=0;
		for(i=0;i<nums.length-1;i=i+2){
			//  System.out.println(nums[i]+" "+nums[i+1]);
			if(nums[i]!=nums[i+1]){
				//  System.out.println("inside unmatch "+nums[i]+" "+nums[i+1]);
				break;
			}

		}

		return nums[i];
	}

	/*leetcode solution*/
	int leetCodeSolution(int A[], int n) {
		int result = 0;
		for (int i = 0; i<n; i++)
		{
			result ^=A[i]; //XOR based solution---A XOR A = 0 
			System.out.println("result : "+result+" i "+i);
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
		array_count_1 A=new array_count_1();

		int result1=A.singleNumber(nums);
		int result2=A.leetCodeSolution(nums, nums.length);

		System.out.println("result 1: "+result1);
		System.out.println("result 2: "+result2);
	}

}
