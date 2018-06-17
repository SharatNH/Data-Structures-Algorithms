package dynamicProgramming;

/*
 * https://www.geeksforgeeks.org/trapping-rain-water/
 */
public class TrappingRainWater {
	
	/* time and space complexity:
	 * time: O(n)
	 * space: O(2n)==>O(n)
	 */
	public int findTrapperWater1(int[] buildings){
		
		int n=buildings.length;
		// left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int left[] = new int[n];
      
        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[n];
      
        // Initialize result
        int water = 0;
      
        // Fill left array
        left[0] = buildings[0];
        for (int i = 1; i < n; i++)
           left[i] = Math.max(left[i-1], buildings[i]);
      
        // Fill right array
        right[n-1] = buildings[n-1];
        for (int i = n-2; i >= 0; i--)
           right[i] = Math.max(right[i+1], buildings[i]);
      
        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
           water += Math.min(left[i],right[i]) - buildings[i];
      
        return water;
	}
	
	/*
	 * no additional space required.
	 * Time complexity O(n) 
	 * Space O(1)
	 */
	public int findTrappedWater2(int[] building){
		if(building==null || building.length==0)
			return 0;
		
		int leftMax=0,rightMax=0,result=0,low=0,high=building.length-1;
		
		while(low<=high){
			if(building[low]<building[high]){
				if(building[low]>leftMax)
					leftMax=building[low];
				else
					result+=leftMax-building[low];
				
				low++;
			}
			else{
				if(building[high]>rightMax)
					rightMax=building[high];
				else
					result+=rightMax-building[high];
				
				high--;
			}
		}
		
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrappingRainWater trw=new TrappingRainWater();
		int[] building1={0, 1, 0, 2, 1, 0, 1,3, 2, 1, 2, 1};
		int[] building2={3,0,0,2,0,4};
		int[] building3={2,0,2};
		
		System.out.println("method 1: "+trw.findTrapperWater1(building1));
		System.out.println("method 2: "+trw.findTrappedWater2(building1));
	}

}
