package com.sharat.linklist;




public class deleteNodeWithGreaterValueOnRight {

    private int maxFound = Integer.MIN_VALUE;
    
    public Node deleteNodes(Node head){
        if(head == null){
            return null;
        }
        Node nextNode = deleteNodes(head.next);
        if(head.data > maxFound){
            maxFound = head.data;
        }
        if(maxFound > head.data){
            return nextNode;
        }
        head.next = nextNode;
        return head;
    }
    
    public static void main(String args[]){
        deleteNodeWithGreaterValueOnRight dng = new deleteNodeWithGreaterValueOnRight();



        LinkList ll = new LinkList();
        Node head = null;
        head = ll.addNode(12, head);
        head = ll.addNode(15, head);
        head = ll.addNode(10, head);
        head = ll.addNode(11, head);
        head = ll.addNode(5, head);
        head = ll.addNode(6, head);
        head = ll.addNode(2, head);
        head = ll.addNode(3, head);
        head = dng.deleteNodes(head);
        ll.printList(head);
    }
}