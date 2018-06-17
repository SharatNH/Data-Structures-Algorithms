/*
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element 
 * always exist in the array
 */

import java.util.HashMap;


public class majority_element {
	
	/*leetcode solution---note this takes care of major element n 
	 * neglects the count of the major element
	 */
	
	 int majorityElement_leetcode(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
	
	/* my solution based on hashmap*/
	 public int majorityElement(int[] nums) {
	        
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        int maxValue=Integer.MIN_VALUE;
	        int key=0;
	        
	        if(nums.length==0) return 0;
	        
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                int value=(int)map.get(nums[i]);

	                map.put(nums[i],value+1);
	                if((value+1)>maxValue){
	                    maxValue=value+1;
	                    key=nums[i];
	                }
	            }
	            else{
	                map.put(nums[i],1);
	                if(key==0 && maxValue==Integer.MIN_VALUE)
	                {
	                maxValue=1;
	                key=nums[i];
	                }
	            }
	        }
	        
	        System.out.println(key+" "+maxValue);
	        
	        return key;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-3,-3,4};
		majority_element p = new majority_element();
		System.out.println("my solution: "+p.majorityElement(nums));
		System.out.println("leetcode sol: "+p.majorityElement_leetcode(nums));

	}

}
