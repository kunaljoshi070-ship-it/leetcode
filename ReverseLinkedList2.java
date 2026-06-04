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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }

        ListNode temp = head;
        ListNode oghead = head;

        int count = 1;

        while(count != left){
            head = head.next;
            count++;
        }

        while(temp.next != head && temp != head){
            temp = temp.next;
        }

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while(count != right){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
            count++;
        }
        if(temp != head){
            temp.next = prevNode;
            head.next = currNode;
        } else{
            head.next = currNode;
        }
        
        if(left == 1){
            return prevNode;
        }

        return oghead;
    }
}
