class polyNode
{
   int data;
   int exp;
   polyNode next;
	
	
	
}

class poly_add
{
	public void polyNode_insert(int num,int exp, polyNode node)
	{
		polyNode temp=new polyNode();
		temp.data=num;
		temp.exp=exp;
		temp.next=null;
		
		if(node==null)
			node=temp;
		else
			node.next=temp;
		
	}
	
	public void add(polyNode n1,polyNode n2,polyNode l3){
		

		
		while(n1!=null && n2!=null){
			
			if(n1.exp>n2.exp)
			{
				if(l3==null)
				{
					polyNode temp=new polyNode();
					temp.data=n1.data;
					temp.exp=n1.exp;
					temp.next=null;
					
					l3=temp;
			
					
				}
				else
				{
					polyNode temp=new polyNode();
					temp.data=n1.data;
					temp.exp=n1.exp;
					temp.next=null;
					
					l3.next=temp;
					l3=l3.next;
				}
				n1=n1.next;
			}
			else if(n1.exp<n2.exp)
			{
				if(l3==null)
				{
					polyNode temp=new polyNode();
					temp.data=n2.data;
					temp.exp=n2.exp;
					temp.next=null;
					
					l3=temp;
				
					
				}
				else
				{
					polyNode temp=new polyNode();
					temp.data=n2.data;
					temp.exp=n2.exp;
					temp.next=null;
					
					l3.next=temp;
					l3=l3.next;
				}
				n2=n2.next;
			}
			else
			{
				polyNode temp=new polyNode();
				
				int sum=n1.data+n2.data;
				temp.data=sum;
				temp.exp=n1.exp;
				temp.next=null;
				l3.next=temp;
				l3=l3.next;
				
				n1=n1.next;
				n2=n2.next;
			}
				
		}
		
		while(n1!=null || n2!=null)
		{
			if(n1!=null)
			{
				polyNode temp=new polyNode();
				temp.data=n1.data;
				temp.exp=n1.exp;
				temp.next=null;
				l3.next=temp;
				l3=l3.next;
				n1=n1.next;
			}
			if(n2!=null)
			{
				polyNode temp=new polyNode();
				temp.data=n2.data;
				temp.exp=n2.exp;
				temp.next=null;
				l3.next=temp;
				l3=l3.next;
				n1=n2.next;
			}
		}
		
		
		//return l3;
	}
}


public class polynomial_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		polyNode n1=new polyNode();
		System.out.println("1");
		poly_add add=new poly_add();
		add.polyNode_insert(5, 2, n1);
		add.polyNode_insert(4, 1, n1);
		add.polyNode_insert(2, 0, n1);
		
		System.out.println("n1");
		while(n1.next!=null)
		{
			System.out.println(n1.data+" "+n1.exp);
			n1=n1.next;
		}
		polyNode n2=new polyNode();
		System.out.println("2");
		add.polyNode_insert(5, 1, n2);
		add.polyNode_insert(5, 0, n2);
		System.out.println("3");
		polyNode l3=new polyNode();
		System.out.println("3");
		
		add.add(n1, n2,l3);
		System.out.println("3");
		
	
		while(l3.next!=null)
		{
			System.out.println(l3.data+" "+l3.exp);
			l3=l3.next;
		}

	}

}
