/* given a string find the longest palindrome subsequence in it..
 * eg:"bananas" ans: anana */

package dynamicProgramming;

public class longest_palindrome {

	boolean[][] truthArray;
	int palindromeBeginsAt=0;
	int max_len=1;

	public void initialize(String s){
		truthArray=new boolean[s.length()][s.length()];
		
		/* initialized array, all values set to false*/
		/*
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				System.out.print(truthArray[i][j]+"\t");
			}
			System.out.println(" ");
		}
		*/	


		/* single word palindrome*/
		for(int i=0;i<s.length();i++){
			truthArray[i][i]=true;
		}


	}

	public void process(String s){

		/* two letter palindrome*/
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				truthArray[i][i+1]=true;
				palindromeBeginsAt=i;
				max_len=2;
			}
		}

		/* two or more letter palindrome subsequence*/
		for(int k=3;k<=s.length();k++){
			for(int i=0;i<s.length()-k+1;i++){
				int j=i+k-1;
				if(s.charAt(i)==s.charAt(j)&& truthArray[i+1][j-1])
				{
					truthArray[i][j]=true;
					if(i>palindromeBeginsAt && k>max_len){
						palindromeBeginsAt=i;
					}
					max_len=k;
				}
			}
		}
		
		
		System.out.println("start position:"+palindromeBeginsAt);
		System.out.println("length of the palindrome:"+max_len);
		System.out.println("substring:"+s.substring(palindromeBeginsAt, max_len+1));
		System.out.println("********************");
		System.out.println("final output array");
		/* final output array*/
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				System.out.print(truthArray[i][j]+"\t");
			}
			System.out.println(" ");
		}	

	}

	public static void main(String[] args) {
		String s="bananas";
		longest_palindrome l=new longest_palindrome();
		l.initialize(s);
		l.process(s);


	}

}
