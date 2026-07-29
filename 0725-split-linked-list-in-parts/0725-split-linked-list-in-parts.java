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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // 1.Size distribution

        int length = 0;
        ListNode curr = head;

        while(curr!=null){
            length++;
            curr = curr.next;
        }

        int equaldistribution = length/k;
        int remainder = length % k;

        ListNode[] res = new ListNode[k];
        curr = head;     

        for(int i = 0;i<k;i++){
            int count = equaldistribution;
            if(remainder>0){
                count = count + 1;
                remainder = remainder - 1;
            }

            ListNode temp1 = curr;
            ListNode prev = null;

            int counter = 0;

            while(counter<count){
                prev = curr;
                curr = curr.next;
                counter++;

            }

            if(prev!=null){
                prev.next=null;
            }


            res[i] = temp1;




        }
        return res;
        
    }
}