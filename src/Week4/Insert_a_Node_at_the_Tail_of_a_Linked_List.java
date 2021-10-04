package Week4;

public class Insert_a_Node_at_the_Tail_of_a_Linked_List {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if(head == null) {
            return newNode;
        }

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next  = newNode;
        newNode.next = null;

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        SinglyLinkedListNode newList = insertNodeAtTail(n1, 4);
        SinglyLinkedListNode.printLinkedList(newList);
    }
}
