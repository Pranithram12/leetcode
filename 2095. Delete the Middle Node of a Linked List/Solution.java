/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode prev=null;
        ListNode turtle=head;
        ListNode here=head;
        
        while(here != null && here.next!= null){
            prev=turtle; 
            turtle=turtle.next;
            here=here.next.next;
        }
        if(prev != null){
            prev.next = turtle.next;
        }
        else{
            head=head.next;
        }

        return head;
    }
}