package heapImplementation;

public class Heap {
	public int[] heap;
	public int count;
	public int capacity;

	public Heap(int capacity){
		this.heap=new int[capacity];
		this.capacity=capacity;
		this.count=0;
	}

	public void resize(){
		int[] old_value=new int[capacity];
		for(int i=0;i<count;i++){
			old_value[i]=heap[i];
		}
		
		heap=new int[capacity*2];
		for(int i=0;i<count;i++){
			heap[i]=old_value[i];
		}
		
		capacity=capacity*2;
		old_value=null;
	}
	
	public int parentNode(int index){
		if(index==0 || index>this.capacity)
			return -1;

		int parent_index=(index-1)/2;

		return heap[parent_index];
	}
	
	public int leftChild(int index){		
		if(index>this.capacity)
			return -1;
		
		int left_child_index=index*2+1;
		
		if(left_child_index>=this.capacity)
			return -1;
		else
			return left_child_index;
	}
	
	public int rightChild(int index){
		if(index>this.capacity)
			return -1;
		
		int right_child_index=index*2+2;
		
		if(right_child_index>=this.capacity)
			return -1;
		else
			return right_child_index;
	}
	
	public void display(){
		
		for(int i=0;i<capacity;i++){
			System.out.print(heap[i]+" ");
		}
	}
}
