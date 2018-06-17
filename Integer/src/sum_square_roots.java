
public class sum_square_roots {

	public boolean judgeSquareSum(int c) {
		if(c==0)
			return true;
		int value=(int)Math.sqrt(c);
		while(value>0){
			double a=(double)c-Math.pow(value,2);
			/* Math.sqrt() gets square root*/
			a=(double)Math.sqrt(a);
			/* Math.abs() removes sign*/
			if((a-(int)a)==0)
				return true;
			value--;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=3;
		//1000,0,888888
		sum_square_roots s=new sum_square_roots();
		System.out.println(s.judgeSquareSum(c));

	}

}
