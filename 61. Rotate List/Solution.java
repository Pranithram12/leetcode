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
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || k == 0){
            return head;
        }

        int length = 1;
        ListNode tail = head;

        while(tail.next != null){
            length++;
            tail=tail.next;
        }
        tail.next = head;

        ListNode newtail=head;
        k= k % length;
        for(int i=0;i<length - k - 1;i++){
            newtail=newtail.next;
        }

        head=newtail.next;
        newtail.next =null;

        return head;
    }
}