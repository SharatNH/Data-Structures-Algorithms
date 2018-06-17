/*find the min of stack at O(1)*/

import java.util.Stack;

class leetCodeSolution{
	public Stack<Integer> mStack = new Stack<Integer>();
	public Stack<Integer> mMinStack = new Stack<Integer>();

	public void transcation(){
		
		this.push(7);
		this.push(4);
		System.out.println("min: "+this.getMin());
		this.push(1);
		this.push(-1);
		this.push(2);
		this.pop();
		this.pop();
		System.out.println("min: "+this.getMin());
	}
	public void push(int x) {
		mStack.push(x);
		if (mMinStack.size() != 0) {
			int min = mMinStack.peek();
			if (x <= min) {
				mMinStack.push(x);
			}
		} else {
			mMinStack.push(x);
		}
	}

	public void pop() {
		int x = mStack.pop();
		if (mMinStack.size() != 0) {
			if (x == mMinStack.peek()) {
				mMinStack.pop();
			}
		}
	}

	public int top() {
		return mStack.peek();
	}

	public int getMin() {
	    return mMinStack.peek();
	} 

}


public class minStack_twoStacks {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetCodeSolution lsol=new leetCodeSolution();
		lsol.transcation();
	}

}
