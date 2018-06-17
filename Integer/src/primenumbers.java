
public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		 boolean[] notPrime=new boolean[n];
	        int count=0;
	        
	        for(int i=2;i<n;i++){
	            if(notPrime[i]==false){
	                count++;
	                for(int j=2;i*j<n;j++)
	                    notPrime[i*j]=true;
	            }
	        }
	        
	    System.out.println("count: "+count);
	        

	}

}
