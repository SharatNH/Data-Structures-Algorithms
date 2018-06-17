


public class rotate_list extends listfunctions {

	/* my method will fail for large number of k say 2L*/
	/* so i need to use the formula to fix that. */
	public Node myMethod(Node head,int k){
		if(head==null || k==0){
			return head;
		}

		Node pointerOne=head;

		Node pointerTwo=head.next; 

		if(pointerTwo==null)
			return head;

		int count=1;
		while(count<k){
			pointerTwo=pointerTwo.next;
			count++;
			if(pointerTwo==null)
				pointerTwo=head;
		}


		while(pointerTwo.next!=null){
			pointerOne=pointerOne.next;
			pointerTwo=pointerTwo.next;
		}

		if(pointerOne.next==null){
			return head;
		}
		Node tempHead=pointerOne.next;
		pointerOne.next=null;

		pointerTwo.next=head;
		return tempHead;


	}
	
	public Node leetCodeSolution(Node head,int k){
		
		/* first count and then convert it to cycle*/
		if (head == null)
			return head;
		
		Node copyHead = head;
		
		int len = 1;
		while (copyHead.next != null) {
			copyHead = copyHead.next;
			len++;
		}
		
		copyHead.next = head;
		
		/* keeping min at 1, the navigate to the point given by formula*/
		for (int i = len - k % len; i > 1; i--)
			head = head.next;

		//point to new head, since its a cycle it will follow the path
		copyHead = head.next;
		//break the current node, there by breaking the cycle
		head.next = null;

		return copyHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
