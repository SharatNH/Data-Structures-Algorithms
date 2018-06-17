import java.util.HashMap;
import java.util.Map;

/*
 * Given a package with a weight limit limit 
 * and an array arr of item weights, implement a function 
 * getIndicesOfItemWeights that finds two items whose sum of weights 
 * equals the weight limit limit. Your function should return a pair [i, j] 
 * of the indices of the item weights. If such a pair doesn’t exist, 
 * return an empty array.
 * 
 * arr = [4, 6, 10, 15, 16],  lim = 21
 * 
 * output: [3, 1] # since these are the indices of the
               # weights 6 and 15 whose sum equals to 21
 */
public class pair_package {

	  static int[] getIndicesOfItemWeights(int[] arr, int limit) {
		    // your code goes here
		    
		    Map<Integer, Integer> map=new HashMap<Integer,Integer>();

		    for(int i=0;i<arr.length;i++)
		    {
		       Integer intg = new Integer(arr[i]);
		      if(map.containsKey(intg))
		      {
		         
		     
		        int index=map.get(intg);
		        int[] result={i,index};
		        return result;
		      }
		      else
		      {
		        int key=limit-arr[i];
		        intg = new Integer(key);
		        map.put(intg,i);
		      }
		    }
		  
		    
		    int[] result={};
		    return result;
		    
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,6,10,15,16};
		int limit=21;
		int[] result=pair_package.getIndicesOfItemWeights(arr, limit);
		System.out.println("result :"+result[0]+" "+result[1]);
	}

}
