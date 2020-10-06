// Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        SinglyLinkedListNode pointerNode = head;
        int counter = 0;

        while (head != null) {

            head = head.next;
            if ( counter > positionFromTail){
                pointerNode = pointerNode.next;
            }  
            counter++;
           
        }
        return pointerNode.data;
    }