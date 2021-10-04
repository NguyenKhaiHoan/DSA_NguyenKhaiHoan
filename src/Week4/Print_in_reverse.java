package Week4;

public class Print_in_reverse {

    public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode curNode = llist;

        while (curNode != null && curNode.next != null) {
            SinglyLinkedListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            nextNode.next = llist;
            llist = nextNode;
        }

        while (llist != null) {
            System.out.println(llist.data);
            llist = llist.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        reversePrint(n1);
    }
}
