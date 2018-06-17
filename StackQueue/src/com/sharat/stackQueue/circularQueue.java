package com.sharat.stackQueue;

public class circularQueue<T> {

	private int QUEUE_LENGTH;
	private T data[] = null;
	public circularQueue(int size){
		this.QUEUE_LENGTH = size;
		data = (T [])new Object[QUEUE_LENGTH];
	}
	private int front=-1;
	private int rear= -1;

	public void offer(T t){
		if(front == -1){
			data[0] = t;
			front =0;
			rear = 0;
		}else if(front == (rear + 1) % QUEUE_LENGTH){
			//queue is full
			throw new IllegalArgumentException();
		}else{
			rear = (rear + 1) % QUEUE_LENGTH;
			data[rear] = t;
		}
	}

	public T top(){
		//retrieve first element of the queue
		if(front == -1){
			throw new IllegalArgumentException();
		}else{
			return data[front];
		}
	}

	public T poll(){
		//remove the first element from the queue
		if(front == -1){
			throw new IllegalArgumentException();
		}else if(front == rear){
			T t =  data[front];
			front = -1;
			rear = -1;
			return t;
		}
		else{
			T t =  data[front];
			front = (front +1)% QUEUE_LENGTH;
			return t;
		}

	}
	public boolean isEmpty(){
		if(front == -1){
			return true;
		}
		return false;
	}

	public boolean isFull(){
		if(front == (rear + 1)% QUEUE_LENGTH){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		circularQueue<Integer> circularQueue = new circularQueue<Integer>(5);
		circularQueue.offer(1);
		circularQueue.offer(2);
		circularQueue.offer(3);
		System.out.println(circularQueue.poll());
		circularQueue.offer(4);
		circularQueue.offer(5);
		System.out.print(circularQueue.isFull());
		circularQueue.offer(6);
		System.out.print(circularQueue.isFull());

		while(!circularQueue.isEmpty()){
			System.out.println(circularQueue.poll());
		}

	}

}
