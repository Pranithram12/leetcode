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
    public int pairSum(ListNode head) {


        /* Find the midlle value */
        ListNode turtle=head;
        ListNode here=head;
        while(here != null && here.next != null){
            turtle=turtle.next;
            here=here.next.next;
        } 

        /* Reverse the nodes form the middle node*/
        ListNode prev=null;
        while(turtle != null){
            ListNode next=turtle.next;
            turtle.next=prev;
            prev=turtle;
            turtle=next;
        }

        /* Find the maximum value of the twin numbers */

        int maxsum=0;
        ListNode left=head;
        while(prev != null){
            maxsum=Math.max(maxsum,prev.val + left.val);
            prev=prev.next;
            left=left.next;
        }
        return maxsum;
    }
}