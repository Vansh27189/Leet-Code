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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;


        int count_length = 0;
        ListNode count = head;
        while(count != null){
            count_length++;
            count = count.next;
        }
        int length = count_length - n + 1;
        ListNode prev = dummy;
        ListNode curr = head;

        int i = 0;
        while(i<length-1){
            
            curr = curr.next;
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
    
}