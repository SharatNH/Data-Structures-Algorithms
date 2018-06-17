package com.sharat.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * https://www.geeksforgeeks.org/merge-k-sorted-arrays/
 * 
 */

/*
 * Given k sorted arrays of size n each, merge them and print the sorted output
 * 
 * k = 3, n =  4
 * 	arr[][] = { {1, 3, 5, 7},
 * 			    {2, 4, 6, 8},
 * 				{0, 9, 10, 11}
 * 			  };
 * 
 * output: 0 1 2 3 4 5 6 7 8 9 10 11 
 * 
 * complexity: nk*logk
 */

class PQNode {
	public int data;
	public int nextIndex;
	public int arrIndex;

	public PQNode(int d, int ni, int ai) {
		this.data = d;
		this.nextIndex = ni;
		this.arrIndex =ai;
	}
}

public class MergeKSortedArrays {

	public static void merge_priority_queues(int[][] arr,int k,int n){
		int[] result=new int[k*n];
		int count=0;

		PriorityQueue<PQNode> pq = new PriorityQueue<>(k, new Comparator<PQNode>() {
			@Override
			public int compare(PQNode o1, PQNode o2) {
				return o1.data - o2.data;
			}
		});

		/*
		 * here iterate through first column. 
		 * storage structure: array value, next column to be seen, current index(row)
		 * concept--add columns side ward for the same row
		 */
		for(int i=0; i<k; i++) {
			pq.add(new PQNode(arr[i][0], 1, i));
		}

		int j=0;
		while(!pq.isEmpty()) {
			PQNode node = pq.poll();
			result[j] = node.data;
			if(node.nextIndex < n) {
				// arr[current row][side column], next column,current row  
				pq.add(new PQNode(arr[node.arrIndex][node.nextIndex], node.nextIndex+1, node.arrIndex));
			}
			j++;
		}




		/*
		PriorityQueue<inputItem> pq=new PriorityQueue<inputItem>(k,new Comparator<inputItem>(){
			public int compare(inputItem i1,inputItem i2){
				return i1.value-i2.value;
			};
		});




		 --------this method wont work---------

		// i - row
		// j- col
		for(int col=0;col<n;col++){
			int i=0;
			for(int j=0;j<k;j++,i++){
				if(pq.size()==k){
					inputItem item=(inputItem) pq.poll();
					int tempj=item.j;

					output[count++]=item.value;

					if(tempj+1>=n){
						inputItem temp=new inputItem(Integer.MIN_VALUE,-1,-1);
						pq.add(temp);
					}
					else{
						System.out.println("@2 "+col+" "+(tempj));
						inputItem temp=new inputItem(arr[i][tempj+1],i,tempj+1);
						pq.add(temp);
					}
				}
				else{
					System.out.println("@1 "+i+" "+j);
					inputItem temp=new inputItem(arr[i][j],i,j);
					pq.add(temp);

				}
			}
		}

		while(!pq.isEmpty()){
			inputItem temp=pq.poll();
			if(temp.i!=-1 && temp.j!=-1)
				output[count++]=temp.value;
		}
		// */


		for(int i=0;i<n*k;i++)
			System.out.print(result[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=4;

		int[][]arr={ {1, 3, 5, 7},
				{2, 4, 6, 8},
				{0, 9, 10, 11}} ;

		merge_priority_queues(arr, k, n);
	}

}
