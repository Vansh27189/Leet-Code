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
        // node reverse -> right - left + 1
        // dummy node -> yes

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //0->1->2->3->4->5  left = 2, right = 4
        //   h
        //   p  c
        //   pr curr
        //
        int counter = 0;
        ListNode p = dummy;
        ListNode c = head;
        while(counter<left-1){
            counter++;
            p = p.next;
            c = c.next;
        }
        ListNode prev = null;
        ListNode curr = c;
        counter = 0;
        while(counter< (right - left + 1)){
             counter++;

            // reverse logic 

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }

        // after reversing
        //0->1->2->3->4->5  left = 2, right = 4
        //   h
        //   p  c
        //   pr curr
        //0-> 1 -> 
        //    p
        //        4 -> 3 -> 2  5 
        //       prev       c  C

        p.next = prev;
        c.next = curr;
        return dummy.next;

    }
}