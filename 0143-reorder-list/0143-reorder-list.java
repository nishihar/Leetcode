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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = p2;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        ListNode p1 = head;
        p2 = prev; 
        while (p2 != null) {
            ListNode tmp1 = p1.next;
            ListNode tmp2 = p2.next;

            p1.next = p2;
            p2.next = tmp1;

            p1 = tmp1;
            p2 = tmp2;
        }
    }
}
