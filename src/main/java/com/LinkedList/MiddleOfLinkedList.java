package com.LinkedList;

/**
 * Created by rakeshg on 9/17/17.
 */
public class MiddleOfLinkedList {

    public void printMiddleElement(int data) {


        Node head = new Node(data);

        Node fastPointer = head;
        Node slowPointer = head;

        if (head != null) {
            while (fastPointer != null && fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
            }

            System.out.println("The middle element is " + slowPointer.data);
        }

    }

    public static  void main(String[] args) {
        MiddleOfLinkedList ml = new MiddleOfLinkedList();

        ml.printMiddleElement(3);
    }
}
