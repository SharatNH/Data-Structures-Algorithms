
public class valid_cube {

	public boolean binarySearch_way(int num){
		int low=1,high=num;
		int mid=0;
		while(low<high){
			mid=(low+high)>>>2;
			System.out.println("mid: "+mid);
			if(mid*mid*mid<num){
				low=mid+1;
			}
			else if(mid*mid*mid==num)
				return true;
			else
				high=mid-1;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valid_cube v=new valid_cube();
		int num=9;
		System.out.println(v.binarySearch_way(num));
	}

}
