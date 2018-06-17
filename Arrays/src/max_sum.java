
public class max_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index=0;
		int result=0;
		
		int[] a={-8,4,0,5,-3,6};
		int n=a.length;
		
		/*for(int i=0;i<n;i++)
		{
			int total=a[i]+a[index]+(i-index);
			result= (result>total)?  result:  total;
			
			if(a[i]-i>a[index]-index){
				index=i;
			}
			
		}*/
		int sump=Integer.MIN_VALUE;
		int sumq=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			
			sump=Math.max(a[i]-i, sump);
			sumq=Math.max(a[i]+i, sumq);
		}
		
		System.out.println("result "+(sump+sumq));
	
	}

}
