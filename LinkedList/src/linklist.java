/* package whatever; // don't place package name! */

import java.io.*;



class Node
{
 public int item;
  public Node next;
  
  
}

 class listfunctions
{
   Node first=new Node();
   
   public listfunctions()
   {
//    System.out.println("0");
      first=null;
      
   }
   
   public Node returnHead(){
	   return first;
   }
  
      
   public void insert_start(int item)
   {
  //  System.out.println("3");
     Node new_node=new Node();
     
     //stem.out.println("3.5");
     
     if(first==null)
     {
        new_node.item=item;
       new_node.next=null;
       first=new_node;
       
    // System.out.println("4");
       
     }
     else
     {
       new_node.item=item;
       new_node.next=first;
       first=new_node;
      
     }
   }
  
   public void insert_end(int item)
   {
      Node temp=new Node();
      Node new_node=new Node();
     
      temp=first;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      new_node.item=item;
      new_node.next=null;
     
      temp.next=new_node;
        
   }
  
   public void insert_pos(int pos, int item)
   {
     int count=1;
     Node temp=new Node();
     Node prev=new Node();
     Node new_node=new Node();
     
     temp=first;
     if(pos==1)
     {
     //System.out.println("insert pos");
       new_node.item=item;
       new_node.next=temp;
       first=new_node;
     }
     else
     {
     while(count!=pos)
     {
       count++;
       prev=temp;
       temp=temp.next;
       
     }
     new_node.item=item;
     prev.next=new_node;
     new_node.next=temp;
     }
   }
  
   public void print_list()
   {
      Node temp=new Node();
       temp=first;
     
     if(first==null)
     {
       System.out.println("list is empty");
     }
     else
     {
       System.out.println("list elements");
       while(temp!=null)
       {
         
          System.out.println(temp.item);
           temp=temp.next;
       }
     }
   }
     
     
       public void delete_front()
  {
  // Node temp=new Node();
 //  Node prev=new Node();
    
    // temp=first;
    if(first.next!=null)
    {
    first=first.next;
    }
    else
    {
      first=null;
    }
    
  }
  
  
  public void delete_rear()
  {
      Node temp=new Node();
      Node prev=new Node();
    
      temp=first;
      int count=1;
    while(temp.next!=null)
      {
        prev=temp;
        temp=temp.next;
        count++;
     
    }
     if(count>1)
     {
      prev.next=null;
     }
    else
    {
      first=null;
    }
     
    
  }
     
     
     
    public void delete_pos(int pos)
    {
        Node prev=new Node();
        Node next=new Node();
        
        int count=1;
        next=first;
        if(pos==1)
        {
            first=first.next;
        }
        else
        {
              while(count!=pos)
        {
            count++;
            prev=next;
            next=next.next;
        }
        prev.next=next.next;
        }
      
    }
    
    
    
    public void reverse() 
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

  
  /*
  
  public class delete_front()
  {
  // Node temp=new Node();
 //  Node prev=new Node();
    
     temp=first;
    if(first.next!=null)
    {
    first=first.next;
    }
    else
    {
      first=null;
    }
    
  }
  
  
  public class delete_rear()
  {
      Node temp=new Node();
      Node prev=new Node();
    
      temp=first;
      int count=1;
    while(temp.next!=null)
      {
        prev=temp;
        temp=temp.next;
        count++;
     
    }
     if(count>1)
     {
      prev.next=null;
     }
    else
    {
      first=null;
    }
     
    
  }
  
  */
  



// one class needs to have a main() method
 class myCode1
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    
      listfunctions list=new listfunctions(); 
      
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
    
    
    list.delete_rear();
      list.delete_front();
      list.delete_pos(4);
      

       list.print_list();
       
       list.reverse();
       System.out.println("Reversing the ll");
       list.print_list();
       
      
       
       
  }
}
