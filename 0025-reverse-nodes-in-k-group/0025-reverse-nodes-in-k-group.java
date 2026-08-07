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
    public ListNode reverseKGroup(ListNode head, int k) {
        // how many time reverse??
        // reverse k times
        // linking

        int len = 0;
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        while(curr!=null){
            len++;
            curr = curr.next;

        }

        int times = len/k; // len - 20, k - 6, 20/6=3

        // 0-> 1-> 2-> 3-> 4-> 5
        // d
        //             c
        //    p2
        // 0-> 2-> 1-> 3-> 4-> 5->
        //     p
        //         p1
        //         p2
        //             c
        // k = 2
        curr = head;
        ListNode p1 = dummy;


        for(int i =0; i<times;i++){
            // reverse k nodes
            int count = 0;
            ListNode prev = null;
            ListNode p2 = curr;

            while(count<k && curr!=null){
                count++;

                // save next

                ListNode next = curr.next;

                // reverse curr node

                curr.next = prev;
                prev = curr;
                curr = next; 
            }
            p1.next = prev;
            p2.next = curr;
            p1=p2;
        }

        return dummy.next;



        
    }
}