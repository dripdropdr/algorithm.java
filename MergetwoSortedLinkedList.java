/* https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem?isFullScreen=true
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        // for saving head
        SinglyLinkedListNode dummyNode = new SinglyLinkedListNode(0);
        // last stores the last node
        SinglyLinkedListNode last = dummyNode;

        while(true){
            if (head1 == null){
                last.next = head2;
                break;
            }
            if (head2 == null){
                last.next = head1;
                break;
            }

            if(head1.data <= head2.data){
                last.next = head1;
                head1 = head1.next;
            } else{
                last.next = head2;
                head2 = head2.next;
            }
            last = last.next;
        }
        return dummyNode.next;
    }
