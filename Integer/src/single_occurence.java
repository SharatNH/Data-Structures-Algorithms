import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class single_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] values={1,1,1,3,3,4,4,4};
		single_occurence s=new single_occurence();
		System.out.println(s.findOneValue(values));
	}

	private static Integer findOneValue(Integer[] values){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n=values.length;
		int i=0;
		while(i<n){
			if(map.containsKey(values[i])){
				int value=map.get(values[i]);
				map.put(values[i], value+1);
			}
			else{
				map.put(values[i], 1);
			}
			i++;
		}

		Set set = map.entrySet();
		Iterator k = set.iterator();
		while(k.hasNext()) {
			Map.Entry me = (Map.Entry)k.next();
			int value=(Integer) me.getValue();
			if(value==1){
				return (Integer) me.getKey();
			}
		}
		return -1;
	}

}
