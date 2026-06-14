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
    public int pairSum(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        ListNode prev = null;
        ListNode curr = turtle.next;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        int maxSum = 0;
        while(prev != null){
            int twinSum = head.val + prev.val;
            if(twinSum>maxSum){
                maxSum = twinSum;
            }

            prev = prev.next;
            head = head.next;
        }

        return maxSum;
    }
}