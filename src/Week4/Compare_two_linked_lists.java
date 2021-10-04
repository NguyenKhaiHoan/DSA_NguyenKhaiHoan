package Week4;

public class Compare_two_linked_lists {

    public static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null && head2 == null) {
            return true;
        }
        SinglyLinkedListNode firstList = head1;
        SinglyLinkedListNode secondList = head2;
        while (firstList != null && secondList != null) {
            if(firstList.data != secondList.data) {
                break;
            }
            if(firstList.next == null && secondList.next == null) {
                return true;
            }
            firstList = firstList.next;
            secondList = secondList.next;
        }
        return false;
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

        System.out.println(compareLists(n1, m1));
    }
}
