package Week4;

public class Merge_two_sorted_linked_lists {
    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.printf("%d ", head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(0);

        SinglyLinkedListNode temp = newNode;

        while(true) {
            if(head1 == null) {
                temp.next = head2;
                break;
            }
            else if(head2 == null) {
                temp.next = head1;
                break;
            }
            else if(head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        return newNode.next;
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

        SinglyLinkedListNode newList = mergeLists(n1, m1);
        printLinkedList(newList);
    }
}
