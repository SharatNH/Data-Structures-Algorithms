
public class valid_square {

	public boolean binarySearch_way(int num){
		int low=1, high=num;

		/* mid is of long, because to prevent mid*mid overflow*/
		/* to avoid type casting, have low & high as long*/

		while(low<high){
			long mid=(low+high)>>>1;
			System.out.println("mid: "+mid);
			if(mid*mid==num)
				return true;
			else if(mid*mid<num)
				low=(int)mid+1;
			else
				high=(int)mid-1;
		}
		return false;
	}

	public boolean newtonMethod(int num){
		long x=num;
		while(x*x>num){
			x=(x+num/x)>>1;
		}
		return x*x==num;
	}

	public boolean isPerfectSquare(int num){
		int i=1;
		while(num>0){
			num-=i;
			i+=2;
		}
		return num==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valid_square v=new valid_square();
		int num=9;
		//v.binarySearch_way(num);
		System.out.println(v.binarySearch_way(num));
		//System.out.println(v.newtonMethod(num));
		//System.out.println(v.isPerfectSquare(num));
	}
}
