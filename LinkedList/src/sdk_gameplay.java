class linkedlist{
	int item;
	linkedlist next;
	

	public linkedlist() {
		// TODO Auto-generated constructor stub
	}
	
}
public class sdk_gameplay {
	
	static int count=0;
	boolean alt=false;
	boolean flip=false;
	int limit;
	linkedlist head=new linkedlist();
	int target_length;
	sdk_gameplay(int tl){
		head=null;
		limit=tl;
		
	}
	
	
	public void addFrame(int item){
		
		
		linkedlist temp=new linkedlist();
		temp.item=item;
		temp.next=null;
		if(head==null){
			head=temp;
			count++;
		}
		else{
			linkedlist temp2=head;
			
			if(flip){
				alt=!alt;
			}
			if(!alt){
				while(temp2.next!=null)
				{
					temp2=temp2.next;
				}
				temp2.next=temp;
				count++;
				//System.out.println("count:"+count+"limit:"+limit);
				if(count>limit){
					flip=true;
					/* delete every alt occurence of words*/
					linkedlist curr=head;
					linkedlist next=head.next;
					while(curr.next!=null){
						//System.out.println(curr.item+" "+count);
						curr.next=next.next;
						curr=next.next;
						next=curr.next;	
						count--;
					}
				}
			}
			
			
		}
		
		
	}
	
	public void getFrame(){
		linkedlist temp=head;
		while(temp!=null){
			System.out.print(temp.item+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int target_length=5;
		
		int limit=(int) Math.round(((1.33)*target_length)-0.2);
		sdk_gameplay sdk=new sdk_gameplay(limit);
		
		/*
		sdk.addFrame(1);
		sdk.addFrame(2);
		sdk.addFrame(3);
		sdk.getFrame();
		sdk.addFrame(4);
		sdk.getFrame();
		sdk.addFrame(5);
		sdk.getFrame();
		sdk.addFrame(6);
		sdk.getFrame();
		sdk.addFrame(7);
		sdk.getFrame();
		sdk.addFrame(8);
		sdk.getFrame();
		sdk.addFrame(9);
		sdk.getFrame();
		*/
		
		sdk.addFrame(1);
		sdk.addFrame(2);
		sdk.addFrame(3);
		sdk.addFrame(4);
		sdk.addFrame(5);
		sdk.addFrame(6);
		sdk.getFrame();
		sdk.addFrame(7);
		sdk.getFrame();
		sdk.addFrame(8);
		sdk.addFrame(9);
		System.out.println("final output");
		sdk.getFrame();
		
	}

}
