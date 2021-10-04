package Week4;

public class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    public static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.printf("%d ", head.data);
            head = head.next;
        }
        System.out.println();
    }
}
