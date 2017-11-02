package com.LinkedList;

/**
 * Created by rakeshg on 9/18/17.
 */
public class InsertNode {


    // Insert Node at the beginning of the LinkedList. Basically add ing it as Head
    public Node insertNodeAtTheBeginning(int data) {

        Node head = new Node(7);

        Node newNode = new Node(data);

        if (newNode != null) {
            newNode.next = head;

            //Make the New node as head
            head = newNode;
            System.out.println("Node inserted at the beginning");
        }

        return head;
    }

    // Insert new Node after a given Node
    public void insertNodeAfterGivenNode(int insertData, int data) {

        InsertNode insertNode = new InsertNode();
        Node head = insertNode.insertNodeAtTheBeginning(6);

        Node newNode = new Node(insertData);

        if (newNode != null) {

            while (head != null) {

                if (head.data == data) {
                    // Store head.next in another pointer
                    Node targetNextNode = head.next;
                    head.next = newNode;
                    newNode.next = targetNextNode;
                    System.out.println("Added new Node after target");
                    break;
                } else {
                    head = head.next;
                }

            }
            System.out.println("Done");
        }
    }


    public static void main(String[] args) {
        InsertNode insertNode = new InsertNode();
//        insertNode.insertNodeAtTheBeginning(6);
        insertNode.insertNodeAfterGivenNode(8,6);

    }
}
