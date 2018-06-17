package heapImplementation;

public class minHeap extends Heap{

	public minHeap(int capacity) {
		super(capacity);
	}

	public int getMin(){
		if(count==0)
			System.out.println("heap empty");

		return heap[0];
	}

	public void insert(int item){
		//bottom up approach for min heap
		//insert at the last location of the array
		//bubble up comparing with each element

		if(count==this.capacity)
		{
			System.out.println("overflow");
			resize();
		}

		count++;
		int index=count-1;
		heap[index]=item;

		System.out.println(index+" "+parentNode(index)+" "+heap[index]);
		while(index!=0 && parentNode(index)>heap[index]){
			swap(index);
			index=(index-1)/2;
		}	
	}

	public void swap(int index){
		System.out.println("swap called");
		int temp=parentNode(index);
		heap[(index-1)/2]=heap[index];
		heap[index]=temp;
	}

	public void delete(int index){
		//first set the ith index at Integer.Min
		//bring this value to root
		// remove this value from root 
		// construct min heap again

		heap[index-1]=Integer.MIN_VALUE;

		value_to_root(index-1);

		heap[0]=heap[count-1];
		heap[count-1]=0;
		count--;

		minHeapifying(0);
	}

	public void value_to_root(int index){

		while(index!=0 && parentNode(index)>heap[index]){
			swap(index);
			index=(index-1)/2;
		}
		
		return;
	}

	public void minHeapifying(int i){

		System.out.println("minheapifying");
		int left_child=leftChild(i);
		int right_child=rightChild(i);

		int min=i;
		System.out.println(left_child+" "+right_child);
		if((left_child!=-1) && heap[i]>heap[left_child])
			min=2*i+1; //min=left
		 
			
		if((right_child!=-1) && heap[min]>heap[right_child])
			min=2*i+2; //min=right

		//swap i and min

		if(min!=i){

			int temp=heap[min];
			heap[min]=heap[i];
			heap[i]=temp;

			minHeapifying(min);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minHeap heap=new minHeap(11);
		heap.insert(3);
		heap.insert(2);
		heap.insert(1);
		heap.insert(15);
		heap.insert(5);
		heap.insert(4);
		heap.insert(45);
		heap.insert(6);
		
		System.out.println("min:"+heap.getMin());
		heap.display();
		System.out.println("after delete");
		heap.delete(3);
		heap.display();
	}

}
