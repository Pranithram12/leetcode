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
        if(head == null  || head.next == null){
            return head;
        }
        ListNode prevnode=null;
        ListNode currnode=head;
        while(currnode != null){
            ListNode nextnode=currnode.next;
            currnode.next=prevnode;
            prevnode = currnode;
            currnode=nextnode;
        }
        return prevnode;
    } 
    public ListNode findmiddle(ListNode head){
        ListNode here=head;
        ListNode turtle=head;
        while(here.next != null && here.next.next != null){
            here=here.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null  || head.next == null){
            return true;
        }
        ListNode middle=findmiddle(head);
        ListNode Secondhalfstart = reverse(middle.next);
         
        ListNode Firsthalfstart=head;
        while(Secondhalfstart != null){
            if(Firsthalfstart.val != Secondhalfstart.val){
                return false;
            }
            Firsthalfstart=Firsthalfstart.next;
            Secondhalfstart=Secondhalfstart.next;
        }
        return true;
    }
}