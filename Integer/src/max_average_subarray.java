
public class max_average_subarray {
	public double findMaxAverage(int[] nums, int k) {

		int i=0;
		int sum=0;
		int res=Integer.MIN_VALUE;
		while(i<nums.length){
			if(i<k) sum=sum+nums[i];
			else{
				res=Math.max(sum,res);
				sum=sum+(nums[i]-nums[i-k]);
			}
			i++;
		}
		res=Math.max(sum,res);  
		return (double)res/k;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,12,-5,-6,50,3};
		int k = 4;
		max_average_subarray findMax=new max_average_subarray();
		double result=findMax.findMaxAverage(nums, k);
		System.out.println("result: "+result);
	}

}
