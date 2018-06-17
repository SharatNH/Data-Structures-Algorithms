import java.util.HashMap;

/*A happy number is a number defined by the following process: 
 * Starting with any positive integer, replace 
 * the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 * 
 */

/*
 * Example: 19 is a happy number

	1^2 + 9^2 = 82
	8^2 + 2^2 = 68
	6^2 + 8^2 = 100
	1^2 + 0^2 + 0^2 = 1
 */
public class happy_number {

	public boolean isHappy(int n) {

		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();

		int temp=0;

		int num1;
		int num2;
		while(n!=1){
			num2=n;
			temp=0;
			while(num2>0){

				num1=num2%10;
				temp=temp+(int)Math.pow(num1,2);
				num2=num2/10;
			}
			n=temp;
			if(map.containsKey(n))
				return false;
			else
				map.put(n,1);
		}

		return true;   

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		happy_number h=new happy_number();
		System.out.println(h.isHappy(n));

	}

}
