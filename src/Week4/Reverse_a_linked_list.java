package Week4;


public class Reverse_a_linked_list {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode curNode = llist;

        while (curNode != null && curNode.next != null) {
            SinglyLinkedListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = llist;
            llist = nextNode;
        }

        return llist;
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

        SinglyLinkedListNode newList = reverse(n1);
        SinglyLinkedListNode.printLinkedList(newList);
    }
}
