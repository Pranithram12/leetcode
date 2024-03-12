
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map =new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        map.put(0,dummy);
        int prefixsum=0;
        while(head != null){
            prefixsum += head.val;
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum,head);
            }
            else{
                ListNode start= map.get(prefixsum);
                ListNode curr= start;
                int sum=prefixsum;
                while(curr != head){
                    curr = curr.next;
                    sum += curr.val;
                    if(curr != head){
                        map.remove(sum);
                    }
                }
                start.next = head.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}