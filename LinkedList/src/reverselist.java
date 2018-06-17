


class reverse extends listfunctions
{

public void reverselist() 
     {
         
                  
         Node prev=new Node();
         Node next=new Node();
         Node current=new Node();
         
         
         prev=null;
         current=first;
         
         
         while(current!=null)
         {
             
             next=current.next;
             current.next=prev;
             prev=current;
             current=next;
             
         }
         first=prev;
     }


}    


public class reverselist 
{
	public static void main(String[] args)
	{
		reverse list=new reverse();
		  list.print_list();
	      list.insert_start(1);
	      list.insert_start(2);
	      list.insert_start(3);
	      list.insert_start(4);
	      list.insert_start(5);
	      list.insert_start(6);
	      list.insert_end(7);
	      list.insert_pos(3,8);
	      list.insert_pos(1,9);
	      list.print_list();
	      System.out.println("////");
		list.reverselist();
		list.print_list();
		
	}
	
	
}
