class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prevnode = null;
        ListNode currntnode = head;
        while(currntnode != null){
            ListNode nextnode = currntnode.next;
            currntnode.next = prevnode;

            /*Update the node */
            prevnode = currntnode;
            currntnode = nextnode;
        }
        head = prevnode;
        return head;
    }
}
