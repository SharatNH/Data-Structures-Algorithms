
/* given 2 sorted array, merge them*/
/*no extra space and best complexity*/

public class mergeArray {

	public void merge(int[] A, int m, int[] B, int n) {
		int i=m-1, j=n-1, k=m+n-1;
		while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
		while (j>-1)         A[k--]=B[j--];

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mergeArray m=new mergeArray();
		int[] nums1=new int[5];
		nums1=new int[]{1,5,6,0,0};
		int[] nums2={2,4};
		int a=3;
		int b=2;
		m.merge(nums1, a, nums2, b);

		for(int i=0;i<5;i++)
			System.out.println(nums1[i]);


	}

}
