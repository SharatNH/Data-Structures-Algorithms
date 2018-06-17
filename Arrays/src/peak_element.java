

/*
 * https://leetcode.com/problems/find-peak-element/
 */
public class peak_element {

	//O(n) space O(1)
	public void traversal_approach(int[] nums){
		int length=nums.length;
		int i=0;
		if(nums.length==1)
			System.out.print(i); 
		else
		{
			for(i=0;i<length-1;i++)
			{
				if(nums[i]>nums[i+1] && nums[i]>nums[i-1] )
					System.out.println(i);
			}
			System.out.println(nums[i]);
		}
	}
	
	//log(n) compute time
	public void binary_search_approach(int[] nums){
		
		int low=0;
		int high=nums.length-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			int before=Integer.MIN_VALUE;
			int after=Integer.MIN_VALUE;
			
			if(mid>0){
			before=nums[mid-1];
			}
			
			if(mid<nums.length-1)
				after=nums[mid+1];
			
		//	System.out.println(mid+" "+before+" "+after);
			if(before<nums[mid] && after<nums[mid]){
			//	System.out.println("peak element: "+nums[mid]);
				break;
			}
			else if(before>after){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
			
			
		}
		System.out.println("peak element: "+nums[mid]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,5,7,9};
		
		peak_element pe=new peak_element();
		System.out.println("traversal way");
		pe.traversal_approach(nums);
		System.out.println("binary search way");
		pe.binary_search_approach(nums);
		
		

	}

}
