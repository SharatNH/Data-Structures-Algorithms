/* question: container with most water
 * Given n non-negative integers a1, a2, ..., an, 
 * where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai)
 * and (i, 0).
 * Find two lines, which together with x-axis forms a container, 
 * such that the container contains the most water.
 */
public class container_water {

	public int maxArea(int[] height) {
        
	       int maxArea=Integer.MIN_VALUE;
	       int i=0;
	       int j=height.length-1;
	       int h=0;
	       int currentArea=0;
	       while(i<j){
	           if(height[i]<height[j])
	               h=height[i];
	           else
	               h=height[j];
	           
	           int base=j-i;
	           
	           currentArea=base*h;
	           
	           if(currentArea>maxArea)
	               maxArea=currentArea;
	           
	           if(height[i]>height[j]){
	               j--;
	           }
	           else{
	               i++;
	           }
	       }
	        
	       return maxArea;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		container_water c=new container_water();
		int[] height={2,3,4,5,18,17,6};
		int maxArea=c.maxArea(height);
		System.out.println(maxArea);

	}

}
