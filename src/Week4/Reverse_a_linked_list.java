package Week4;

import java.io.*;


class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}


class Result {

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode curNode = llist;

        while (curNode != null && curNode.next != null)
        {
            SinglyLinkedListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = llist;
            llist = nextNode;
        }

        return llist;
    }
}

public class Reverse_a_linked_list {
    public static void main(String[] args) {

    }
}
