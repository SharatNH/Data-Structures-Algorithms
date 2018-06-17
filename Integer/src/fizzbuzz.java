import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class fizzbuzz {
	
	 public List<String> fizzBuzz(int n) {
         List<String> returnString=new LinkedList<String>();
         
         int i=1;
         while(i<=n){
             if(i%3==0 && i%5==0)
                 returnString.add(new String("FizzBuzz"));
             else if(i%3==0)
                 returnString.add(new String("Fizz"));
             else if(i%5==0)
                 returnString.add(new String("Buzz"));
             else
                 returnString.add(Integer.toString(i));
             
             i++;
         }
        
        return returnString;
    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzbuzz f=new fizzbuzz();
		int n=15;
		List<String> result=f.fizzBuzz(n);
		
		Iterator itr=result.iterator();
		while(itr.hasNext()){
			String s=(String)itr.next();
			System.out.println(s);
		}
	}

}
