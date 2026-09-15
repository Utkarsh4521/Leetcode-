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
        ListNode prev = head;
        if(left ==right ){
            return head;
        }
        for(int i =1;i<left-1;i++){
            prev= prev.next;
        }
        ListNode curr= prev.next;
        if(left==1){
            curr = head;
            prev = null;
        }
        ListNode bef = prev;
        ListNode aft = curr;
        for(int i= left ; i<=right; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        aft.next = curr;
        if(left==1){
            return prev;
        }
        bef.next = prev;

    return head;
    }
}