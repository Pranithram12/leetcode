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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp != null){
                values.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(values);
        ListNode head=new ListNode(0);
        ListNode curr=head;
        for(int j=0;j<values.size();j++){
            curr.next = new ListNode(values.get(j));
            curr=curr.next;
        }
        return head.next;
     }
}