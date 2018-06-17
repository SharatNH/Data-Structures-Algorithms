
/*
 * https://leetcode.com/problems/sqrtx/description/
 */
/* 
 * given a number find its square root
 */
public class SquareRoot {

	public int sqrt(int num){
		
		int low=1,high=num,mid=0;
		int sqrt=0;
		while(low<=high){
			mid=(low+high)>>>1;
			
			/*
			 *  preference over mid*mid since it may overflow. 
			 */
			if(mid<=num/mid){
				low=mid+1;
				sqrt=mid;
			}
			if(mid*mid>num){
				high=mid-1;
			}
		}
		return sqrt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareRoot sr=new SquareRoot();
		System.out.println("square root: "+sr.sqrt(9));
	}

}
