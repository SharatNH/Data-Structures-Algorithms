


class find extends listfunction
{
	
	//finding position based on position
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


public class nthelement extends myCode
{
	
	public static void main(String[] args)
	{
		
		find list=new find();
		list.find_item(1);
	}
}

