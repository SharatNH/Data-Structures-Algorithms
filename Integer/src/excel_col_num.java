
public class excel_col_num {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="BXX";
		//System.out.println((int)s.charAt(0));

		int result=0;
		for(int i=0;i<s.length();i++)
			result=result*26+((int)(s.charAt(i)-65)+1);


		System.out.println(result);


	}



}
