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
    ListNode front;
    boolean stop = false;
    public void reorderList(ListNode head) {
        front = head;
        reorder(front);
    }
    public void reorder(ListNode current){
        if(current == null) return;
        reorder(current.next);
        if(stop) return;
        if(front==current){
            current.next = null;
            stop = true;
            return;
        }
        if(front.next==current){
            current.next = null;
            stop = true;
            return;
        }
        ListNode nextfront = front.next;
        front.next = current;
        current.next = nextfront;

        front = nextfront;
    }
}
