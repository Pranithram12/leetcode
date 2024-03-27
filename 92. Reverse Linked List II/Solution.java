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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode lefprev=dummy;
        ListNode curr=head;


        for(int i=0; i<left-1; i++){
            lefprev=lefprev.next;
            curr=curr.next;
        }


        ListNode prev=null;
        ListNode subhead=curr;


        for(int i=0; i<=right-left; i++){
            ListNode newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
        }

        subhead.next=curr;
        lefprev.next=prev;
        
        return dummy.next;
    }
}