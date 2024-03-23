/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode here=head;
        ListNode turtle=head;
        while(here != null && here.next != null){
            here=here.next.next;
            turtle=turtle.next;
            if(here == turtle){
                return true;
            }
        }
        return false;
    }
}