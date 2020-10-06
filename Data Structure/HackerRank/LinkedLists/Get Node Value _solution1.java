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
        int counter = 0;
        for(SinglyLinkedListNode n = head; n != null; n = n.next){          
            counter ++;
        }

        counter = (counter - positionFromTail) - 1; //as you're iterating from head(0)
        while(counter != 0){
            head = head.next;
            counter--;
        }
        return head.data;

    }
