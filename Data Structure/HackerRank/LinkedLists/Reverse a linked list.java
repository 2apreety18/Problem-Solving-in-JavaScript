// Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode revHead = null;
        
         for(SinglyLinkedListNode n = head; n != null; n = n.next){
             SinglyLinkedListNode newNode = new SinglyLinkedListNode(n.data);
             newNode.next = revHead;
             revHead = newNode;
         }
        return revHead;
    }