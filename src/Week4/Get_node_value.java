package Week4;

public class Get_node_value {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        SinglyLinkedListNode newNode = llist;
        SinglyLinkedListNode newNode2 = llist;
        int count = 0;

        for (int i = 0; i < positionFromTail; i++) {
            newNode2 = newNode2.next;
        }

        while (newNode2.next != null) {
            newNode = newNode.next;
            newNode2 = newNode2.next;
        }

        return newNode.data;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        System.out.println(getNode(n1, 0));
    }
}
