/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Map<Node,Node> map=new HashMap<>();

        /* Here we are creating a dummy Linked list of with same values */
        Node curr=head;
        while(curr != null){
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }

         
        for(Node key : map.keySet()){
            Node newnode=map.get(key);
            newnode.next=map.get(key.next);
            newnode.random=map.get(key.random);
        }
        return map.get(head);
    }
}