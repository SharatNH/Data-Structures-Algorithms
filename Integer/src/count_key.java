import java.util.Scanner;


public class count_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		num=in.nextInt();
		System.out.println("enter the key");
		int d=in.nextInt();
		int count=0;
		while(num>0){
			 rem=num%100;
			//System.out.println(num);
			if(rem==d){
				count++;
				
			}
			num=num/10;
		}
		
		System.out.println(count);
	}

}
