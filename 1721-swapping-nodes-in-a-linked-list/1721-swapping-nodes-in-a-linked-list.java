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
    public ListNode swapNodes(ListNode head, int k) {
        int jump1 = k - 1;

        ListNode curr = head;
        int len = 0;

        while(curr!=null){
            len++;
            curr = curr.next;
        }

        ListNode n1 = head;
        ListNode n2 = head;

        int counter = 0;

        while(counter<jump1){
            counter++;
            n1 = n1.next;
        }

        counter = 0;

        int jump2 = len - k;

        while(counter<jump2){
            counter++;
            n2 = n2.next;
        }

        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
        

        return head;
    }
}