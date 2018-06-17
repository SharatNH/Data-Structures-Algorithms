/*find the min stack with O(1) using single stack*/

import java.util.Stack;

class MinStack {
    long min;
    Stack <Long> stack;

    public MinStack(){
         stack=new Stack<Long>();
    }
    

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
        if (stack.isEmpty()){
            stack.push((long)x);
            min=x;
        }else{
            stack.push(x-min);//Could be negative if min value needs to change
            if (x<min) min=x;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        
        long pop=stack.pop();
        
        if (pop<0)  min=min-pop;//If negative, increase the min value
        
    }

    public int top() {
        long top=stack.peek();
        if (top>0){
            return (int)(top+min);
        }else{
           return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}
public class minStack_singleStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MinStack min=new MinStack();
			min.transcation();
			
	}

}
