


class remove_gtvalue extends listfunction {

	public Node remove_values(int x,Node root){
		
		if(root==null){
			System.out.println("empty linked list");
			return root;
		}
		
		Node temp=new Node();
		Node prev=new Node();
		
		
		
		temp=root;
		prev=null;
		
		while(root!=null){
			if(root.item>x){
				System.out.println("deleted:"+root.item);
				if(prev==null){
					root=root.next;
					temp=root;
				}
				else{
					prev.next=root.next;
					root=prev.next;
				}		
			}
			else{
				prev=root;
				root=root.next;
			}
		}
		
		return temp;
	}
	
	public void print_list(Node root){
		Node temp=root;
		if(root==null){
			System.out.println("empty list");
		}
		while(temp!=null){
			System.out.print(temp.item+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listfunctions list=new listfunctions();
		  remove_gtvalue r=new remove_gtvalue();
		  list.insert_start(1);
	      list.insert_start(2);
	      list.insert_start(3);
	      list.insert_start(4);
	      list.insert_start(5);
	      list.insert_start(6);
	      
	      list.print_list();
	      
	      Node root=list.returnHead();
	      
	    
	      root= r.remove_values(3,root);
	      r.print_list(root);
	      
	}

}
