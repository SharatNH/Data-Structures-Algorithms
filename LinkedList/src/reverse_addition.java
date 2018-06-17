/*You are given two non-empty linked lists 
	representing two non-negative integers. 
	The digits are stored in reverse order 
	and each of their nodes contain a single digit. 
	Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, 
 except the number 0 itself.
 
 eg:
 
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

class reverse_addition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode l3=new ListNode(0);
        ListNode l3_head=l3;
        int sum=0,carry=0;
        boolean first=true;
        while(l1!=null && l2!=null){
           // System.out.println("carry: "+carry);
            sum=l1.val+l2.val+carry;
            if(carry>0) 
                carry=0;
            if(sum>9)
            {
                carry=sum/10;
                sum=sum%10;
             
            }
           // System.out.println("sum: "+sum);
            ListNode temp=new ListNode(sum);
            if(l3_head.val==0 && first){
                l3=temp;
                l3_head=l3;
                first=false;
            }
                
            else{
                l3.next=temp;
                l3=l3.next;
            } 
            
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            if(carry>0)
            {
                sum=l1.val+carry;
                if(carry>0) 
                     carry=0;
                 if(sum>9)
                  {
                 carry=sum/10;
                 sum=sum%10;
                
                 }
                ListNode temp=new ListNode(sum);
                l3.next=temp;
                l3=l3.next;
                l1=l1.next;
            }
            else{
                  l3.next=l1;
                  l1=l1.next;
                 l3=l3.next;
            }
          
        }
        
         while(l2!=null){
                  if(carry>0)
            {
                sum=l2.val+carry;
                if(carry>0) 
                     carry=0;
                 if(sum>9)
                  {
                     carry=sum/10;
                     sum=sum%10;
                 
                 }
                  ListNode temp=new ListNode(sum);
                l3.next=temp;
                l3=l3.next;
                l2=l2.next;
            }
           else{
                l3.next=l2;
            l2=l2.next;
            l3=l3.next;
           }
        }
        
        if(l1==null && l2==null){
            if(carry>0){
                 ListNode temp=new ListNode(carry);
                l3.next=temp;
                l3=l3.next;
            }
        }
        
        return l3_head;
        
    }
}

