
/*Determine whether an integer is a palindrome. Do this without extra space.*/


public class palindrome_no_extra_space {
	
	public boolean leetcode_solution(int x){
		if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
	
	public boolean mySolution(int x){
		 if(x>=0){
	            String s=Integer.toString(x);
	        int i=0;
	        int j=s.length()-1;
	        for(i=0;i<=j;i++,j--){
	           // System.out.println(s.charAt(i)+" "+s.charAt(j));
	            if(s.charAt(i)!=s.charAt(j)){
	                
	               // System.out.println(s.charAt(i)+" "+s.charAt(j));
	                break;
	            }
	        }
	        
	        if(i>j)
	            return true;
	        else
	            return false;
	        
	        }
	        else{
	            return false;
	        }
	            
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1222345;
		//int x=4224;

		palindrome_no_extra_space p=new palindrome_no_extra_space();
		boolean result1=p.leetcode_solution(x);
		boolean result2=p.mySolution(x);
		
		System.out.println("result 1:"+result1);
		System.out.println("result 2:"+result2);
	}

}
