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
    public ListNode reverse(ListNode head){
        ListNode prevnode=null;
        ListNode currnode=head;
        while(currnode != null){
            ListNode nextnode = currnode.next;
            currnode.next=prevnode;
            prevnode=currnode;
            currnode=nextnode;
        }
        return prevnode;
    }
    public void reorderList(ListNode head) {
        ListNode here=head;
        ListNode turtle=head;
        while(here.next != null && here.next.next != null){
            here=here.next.next;
            turtle=turtle.next;
        }
        ListNode first=head;
        ListNode sec=reverse(turtle.next);
        turtle.next=null; 
        while(sec != null){
           ListNode temp1=first.next;
           ListNode temp2=sec.next;
           first.next=sec;
           sec.next=temp1;
           first=temp1;
           sec=temp2;
        }
    }
}