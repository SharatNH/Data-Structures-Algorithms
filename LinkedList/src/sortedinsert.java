import java.io.*;






 class Node1
{
 public int item;
  public Node next;
  
  
}

 class listfunction
{
   Node first=new Node();
   
   public listfunction()
   {
//    System.out.println("0");
      first=null;
   }
  
      
  public void insert(int item)
  {
      
      Node temp=new Node();
      Node newnode=new Node();
      Node prev=new Node();
      int count=0;
      temp=first;
      
      if(first==null)
      {
          newnode.item=item;
          newnode.next=null;
          
          first=newnode;
          
      }
      else{
          
          //System.out.println("temp.item:"+temp.item);
          //System.out.println("item:"+item);
          while(temp != null && temp.item<item)
          {
            //  System.out.println("inside while");
              prev=temp;
              temp=temp.next;
              count++;
             // System.out.println("end of while");
          }
          if(count>0)
          {
             // System.out.println("inside count if");
               newnode.item=item;
          prev.next=newnode;
          newnode.next=temp;
          }
          else
          {
            //  System.out.println("else");
              newnode.item=item;
              newnode.next=temp;
              first=newnode;
          }
         
          
          
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
      System.out.println("delete rear");
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
     
     
     
     public void find_item(int pos)
     {
         
       //  System.out.println("F1");
         
         if(pos>0)
         {
             
         Node temp=new Node();
         Node temp2=new Node();
         
         if(first==null)
         {
             System.out.println("List is empty");
             
             
         }
         else
         {
           
             
             int count=1;
             temp=first;
             temp2=first;
          
             
          //   System.out.println("F2");
             while(count<pos)
             {
              
                     temp=temp.next;
                     count++;
                 }
             
            // System.out.println("F3");
             if(temp!=null)
             {
                   while(temp.next!=null)
                 
                 {
                    temp=temp.next;  
                     temp2=temp2.next;
                     
                 }
                
            //     System.out.println("F4");
                   if(temp2!=null)
             {
                      // System.out.println("F5");
                   System.out.println("item found");
                   System.out.println(temp2.item);
                 
             }
                 //System.out.println("F6");
                 
             }
             else{
                 
                 System.out.println("range out of bound");
             }
             
          
             
           
          
             
         }
         
         
     }
     
         else
         {
             System.out.println("pos should greater than 0");
         }
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
 class myCode
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    
      listfunction list=new listfunction();  
      list.print_list();
      list.insert(5);
      list.insert(1);
      
       list.print_list();
      list.insert(7);
       list.print_list();
      list.insert(9);
      list.insert(3);
      
      list.print_list();
    
      System.out.println("delete section");
    
    list.delete_rear();
      list.delete_front();
      list.print_list();
      list.delete_pos(2);
      
      

       list.print_list();

      System.out.println("item to found at pos");
      list.find_item(1);
       
  }
}

