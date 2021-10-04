package Week4;

public class Insert_a_node_at_the_head_of_a_Linked_List {
    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if(llist != null) {
            newNode.next = llist;
        }

        return newNode;
    }

    public static void main(String[] args)  {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        SinglyLinkedListNode newList = insertNodeAtHead(n1, 0);
        SinglyLinkedListNode.printLinkedList(newList);
    }
}
