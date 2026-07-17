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
        if(head == null) return null;
        Node curr = head;
        HashMap<Node, Node> copies = new HashMap<>();
        while(curr!=null){
            copies.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            Node copy = copies.get(curr);
            copy.next = copies.get(curr.next);
            copy.random = copies.get(curr.random);
            curr = curr.next;
        }
        return copies.get(head);
    }
}
