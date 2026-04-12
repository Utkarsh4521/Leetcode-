/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getlen(ListNode head){
        int count = 0 ; 
        while(head != null){
            count++;
            head= head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = getlen(headA);
        int b = getlen(headB);
        ListNode slow = headA;
        ListNode fast = headB;
        if(a> b){
            for(int i = 0; i < a-b;i++){
                 slow = slow.next;
            }
        }
        else if (a < b){
            for(int i = 0 ;i < b-a;i++){
                fast = fast.next;
            }
            
        }
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}