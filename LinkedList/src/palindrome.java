


class check_palindrome extends reverse
{
	
	public void checklist()
	{
		
		Node slow_ptr=first;
		Node fast_ptr=first.next;
		int count=1;
		
		while(fast_ptr.next!=null && fast_ptr!=null)
		{
			slow_ptr=slow_ptr.next;
			count++;
		//	System.out.println("fast ptr:"+fast_ptr.item);
			if(fast_ptr.next.next==null)
			{
				slow_ptr=slow_ptr.next;
				count++;
				fast_ptr=null;
				break;
			}
			fast_ptr=fast_ptr.next.next;
			
		}
		
		
		
		
		
		Node prev=new Node();
        Node next=new Node();
        Node current=new Node();
        
        
        prev=null;
        current=slow_ptr.next;
        
        
        while(current!=null)
        {
            
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        slow_ptr.next=prev;
        System.out.println("count:"+count);
     //   Node second_ptr=slow_ptr;
        
        
    }
		
}
	



public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check_palindrome palindrome=new  check_palindrome();
		palindrome.print_list();
		palindrome.insert_start(1);
		palindrome.insert_start(2);
		palindrome.insert_start(3);
		palindrome.insert_start(4);
		palindrome.insert_start(4);
		palindrome.insert_start(3);
		palindrome.insert_start(2);
		palindrome.insert_start(1);
		//palindrome.insert_start(6);
		
		System.out.println("before");
		palindrome.print_list();
		
		palindrome.checklist();
		
		System.out.println("after");
		palindrome.print_list();
	}

}
