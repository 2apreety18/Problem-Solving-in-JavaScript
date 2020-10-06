// Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
       //if the head is not yet null...
        if (head != null) {
            //call the function again but on the next node
            reversePrint(head.next);
            /*----------------------------------------------
            The recursion will get "stacked" right here!
            The code below this area will not get called
            until we go back up through the recursive stack.
            -----------------------------------------------*/
            System.out.println(head.data);
        }
    }