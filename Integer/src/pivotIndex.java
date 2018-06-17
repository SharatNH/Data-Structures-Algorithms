
public class pivotIndex {

	private static int findPivotIndex(Integer[] values){
		
		int minSum=0;
		int maxSum=0;
		
		int i=0;
		int j=values.length-1;
		
		for(i=0;i<j;i++){
			minSum=minSum+values[i];
			if(minSum>maxSum){
				j--;
				maxSum=maxSum+values[j];
			}		
		}
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Integer[] values={1,1,1,2,3}; //ans is 2
	 Integer[] values2={1,2,3,4,4,5,5};
	 pivotIndex p=new pivotIndex();
	 System.out.println("pivot index: "+p.findPivotIndex(values));
	}

}
