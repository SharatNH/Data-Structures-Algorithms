package com.sharat.linklist;

/*
 * http://www.geeksforgeeks.org/maximum-sum-linked-list-two-sorted-linked-lists-common-nodes/
 * Test cases
 * Test that chains never meet
 * Test that chain meets only once
 * Test that chain meets multipe times
 * Test that one chain ends where it meets chain 2
 */

public class MergeForLargestSum {

	public Node maxChain(Node head1,Node head2){

		if(head1==null)
			return head2;

		if(head2==null)
			return head1;

		Node result=null;
		Node tail=null;
		int sum=0;
		int sum1=0,sum2=0;

		Node curr1=head1;
		Node curr2=head2;

		while(curr1.next!=null && curr2.next!=null){

			if(curr1.data==curr2.data){

				int temp1=0;
				int temp2=0;

				Node prev1=curr1;
				Node prev2=curr2;

				temp1=curr1.data;
				temp2=curr2.data;

				if(result==null){
					if(sum1+temp1>sum2+temp2){
						result=head1;
						tail=curr1;
					}else{
						result=head2;
						tail=curr2;
					}
				}
				curr1=curr1.next;
				curr2=curr2.next;

				while(curr1.data!=curr2.data){

					if(curr1.data<curr2.data){
						temp1+=curr1.data;
						curr1=curr1.next;
					}
					if(curr1.data>curr2.data){
						temp2+=curr2.data;
						curr2=curr2.next;
					}
				}

				if(temp1+sum>temp2+sum){
					sum+=temp1;
					Node next=curr1.next;
					tail.next=prev1;
					tail=curr1;
					tail.next=null;
					curr1=next;
				}
				else{
					sum+=temp2;
					Node next=curr2.next;
					tail.next=prev2;
					tail=curr2;
					tail.next=null;
					curr2=next;
				}
			}

			if(curr1.data>curr2.data){
				sum1+=curr1.data;
			}

			if(curr1.data<curr2.data){
				sum2+=curr2.data;
			}
		}

		Node prev1=curr1;
		while(curr1!=null){
			sum1+=curr1.data;
			curr1=curr1.next;
		}
		
		Node prev2=curr2;
		while(curr2!=null){
			sum2+=curr2.data;
			curr2=curr2.next;
		}
		
		if(result!=null){
			if(sum1>=sum2){
				tail.next=prev1;
			}
			else{
				tail.next=prev2;
			}
		}
		else{
			if(sum1>=sum2){
				result=head1;
			}
			else{
				result=head2;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll = new LinkList();
		Node head1 = null;
		head1 = ll.addNode(1, head1);
		head1 = ll.addNode(3, head1);
		head1 = ll.addNode(30, head1);
		head1 = ll.addNode(90, head1);
		head1 = ll.addNode(120, head1);
		head1 = ll.addNode(240, head1);
		head1 = ll.addNode(243, head1);
		head1 = ll.addNode(251, head1);
		head1 = ll.addNode(511, head1);
		Node head2 = null;
		head2 = ll.addNode(0, head2);
		head2 = ll.addNode(3, head2);
		head2 = ll.addNode(12, head2);
		head2 = ll.addNode(32, head2);
		head2 = ll.addNode(90, head2);
		head2 = ll.addNode(125, head2);
		head2 = ll.addNode(240, head2);
		head2 = ll.addNode(249, head2);
		head2 = ll.addNode(251, head2);
		head2 = ll.addNode(260, head2);


		MergeForLargestSum mls=new MergeForLargestSum();
		Node result=mls.maxChain(head1, head2);
		
		System.out.println("printing result");
		
		while(result!=null){
			System.out.print(result.data+" ");
			result=result.next;
		}
	}

}
