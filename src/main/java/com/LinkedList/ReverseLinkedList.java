package com.LinkedList;

/**
 * Created by rakeshg on 9/18/17.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        Node node = new Node(3);
        node.next = new Node(4);
        node.next.next = new Node(6);


        ReverseLinkedList rev = new ReverseLinkedList();
        rev.reverseLinkedList(node);
    }

    public Node reverseLinkedList(Node node) {
       Node currentNode = node;
       Node nextNode = null;
       Node previousNode = null;

       while(currentNode != null) {

           // Store the current.next until the value gets overwritten
           nextNode = currentNode.next;

           // Reverse the linkedlist
           currentNode.next = previousNode;

           // This is the place where reverse linkedlist happens
           previousNode  = currentNode;
           currentNode = nextNode;
       }

       return previousNode;
    }
}
