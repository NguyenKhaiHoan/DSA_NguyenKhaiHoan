package Week4;

public class Delete_a_Node {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if(position == 0) {
            if(llist != null) {
                return llist.next;
            }
            return llist;
        }

        SinglyLinkedListNode currNode = llist;
        SinglyLinkedListNode prevNode = null;
        int count = 0;
        boolean bIsFound = false;

        while(currNode != null) {
            if(count == position) {
                bIsFound = true;  // Xóa currNode
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }
        // xóa curr
        if(bIsFound) {
            if(prevNode == null) { // Current Node là Last Node
                return null;
            } else {
                if(currNode != null){
                    prevNode.next = currNode.next;
                }
            }
        }
        return llist;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2; n2.next = n3;

        SinglyLinkedListNode newList = deleteNode(n1, 1);
        SinglyLinkedListNode.printLinkedList(newList);
    }
}
