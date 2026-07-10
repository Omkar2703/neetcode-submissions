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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return solve(l1, l2, 0);
    }
    private ListNode solve(ListNode l1, ListNode l2, int carry){
        if(l1==null && l2==null && carry==0){
            return null;
        }
        int x = (l1!=null) ? l1.val : 0;
        int y = (l2!=null) ? l2.val : 0;
        int sum = x + y + carry;

        ListNode currNode = new ListNode(sum%10);
        currNode.next = solve(
            (l1!=null) ? l1.next : null,
            (l2!=null) ? l2.next : null,
            sum/10
        );
        return currNode;
    }
}
