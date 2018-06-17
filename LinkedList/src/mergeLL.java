



public class mergeLL {

	/* leetcode solution---recurssion*/
	public Node mergeTwoLists(Node l1, Node l2) {
        
        if(l1==null){
            return l2;
        }
        
        if(l2==null)
            return l1;
        
        if(l1.item<l2.item){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
        
    }
	
	/*my solution--non recursive*/
public Node mergeTwoLists_2(Node l1, Node l2) {
        
        if(l1==null){
            return l2;
        }
        
        if(l2==null)
            return l1;
        
        Node mergeList=null;
        Node pos=null;
        while(l1!=null && l2!=null){
            
            if(l1.item<l2.item){
                Node temp=new Node();
                temp.item=l1.item;
                temp.next=null;
                if(mergeList==null){
                    mergeList=temp;
                    pos=mergeList;
                    System.out.println(pos.item);
                }
                else{
                    mergeList.next=temp;
                    mergeList=mergeList.next;
                }
                l1=l1.next;           
            }
            else{
                Node temp=new Node();
                temp.item=l2.item;
                temp.next=null;
                if(mergeList==null){
                    mergeList=temp;
                    pos=mergeList;
                    System.out.println(pos.item);
                }
                else{
                    mergeList.next=temp;
                    mergeList=mergeList.next;
                }
                l2=l2.next;  
            }
        }
        
        while(l1!=null){
            Node temp=new Node();
            temp.item=l1.item;
            temp.next=null;
            mergeList.next=temp;
            mergeList=mergeList.next;
            l1=l1.next;   
        }
        
        while(l2!=null){
            Node temp=new Node();
            temp.item=l2.item;
            temp.next=null;
            mergeList.next=temp;
            mergeList=mergeList.next;
            l2=l2.next;   
        }
        
        return pos;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeLL m1=new mergeLL();
		
		
		
	}

}
