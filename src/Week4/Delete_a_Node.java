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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if(position == 0) {
            if(llist != null) {
                return llist.next;
            }
            return llist;
        }
        SinglyLinkedListNode currNode = llist;
        SinglyLinkedListNode prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while(currNode != null) {
            if(count == position) {
                bIsFound = true;  // remove currNode
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }
        // remove curr
        if(bIsFound) {
            if(prevNode == null) { // Current Node is Last Node
                return null;
            } else {
                if(currNode != null){
                    prevNode.next = currNode.next;
                }
            }
        }
        return llist;
    }

}

public class Delete_a_Node {
    public static void main(String[] args) throws IOException {

    }
}
