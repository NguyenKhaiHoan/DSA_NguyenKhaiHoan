package Week4;

public class Compare_two_linked_lists {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
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


    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
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
}
