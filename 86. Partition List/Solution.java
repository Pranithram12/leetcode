class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode smallervalue = new ListNode(-1);
        ListNode small = smallervalue;
        ListNode greatervalue = new ListNode(-1);
        ListNode greater = greatervalue;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }
        greater.next = null;
        small.next = greatervalue.next;

        return smallervalue.next;
    }
}
