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
    public ListNode mid(ListNode head){
         ListNode slow = head;
        ListNode fast = head; 
        while( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode rev(ListNode middle){
        ListNode prev = null;
        ListNode curr = middle;
        while (curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
       ListNode middle = mid(head);
       ListNode sec = rev(middle.next);
       middle.next = null;
       ListNode first = head;
       while (sec!= null){
        ListNode t1 = first.next;
        ListNode t2 = sec.next;
        first.next = sec;
        sec.next = t1;
        first = t1;
        sec = t2;
       }
    }
}