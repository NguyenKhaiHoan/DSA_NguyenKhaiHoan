package Week4;

public class Insert_a_node_at_a_specific_position_in_a_Linked_List {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        if(position == 0) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

            if(llist != null) {
                newNode.next = llist;
            }

            return newNode;
        } else {
            // B1. Tim vi tri can them
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            SinglyLinkedListNode curNode = llist;
            int count = 0;
            while(curNode != null) {
                count++;
                if(count == position) {
                    // Thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return llist;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        SinglyLinkedListNode newList = insertNodeAtPosition(n1, 0, 1);
        SinglyLinkedListNode.printLinkedList(n1);
    }
}
