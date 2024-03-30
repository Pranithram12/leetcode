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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next == null || k == 1){
            return head;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        int length=getlength(head);
        for(int i=0;i<length/k;i++){
            for(int j=0;j<k-1;j++){
                ListNode next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev=curr;
            curr=curr.next;
        }
        return dummy.next;
    }

    public int getlength(ListNode head){
        int length=0;
        ListNode curr=head;
        while(curr != null){
            length++;
            curr=curr.next;
        }
        return length;
    }
}