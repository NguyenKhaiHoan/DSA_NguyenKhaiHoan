package Week4;

public class Print_the_Elements_of_a_Linked_List {
    public static void printLinkedList(SinglyLinkedListNode head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        SinglyLinkedListNode m1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode m2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode m3 = new SinglyLinkedListNode(4);
        m1.next = m2; m2.next = m3;

        printLinkedList(n1);
    }
}
