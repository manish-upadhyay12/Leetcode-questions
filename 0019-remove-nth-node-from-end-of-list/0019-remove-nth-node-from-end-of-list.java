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
        int noOfNode = 0;
        ListNode tem = head;
        while(tem!=null){
            noOfNode++;
            tem = tem.next;
            
        
        }
           int left = noOfNode -n;

     

        tem = head;
        int count = 1;

        if(left ==0){
            head = head.next;
            return head;
        }

        while(count<left){
            
            tem = tem.next;
            count++;
        }
        tem.next = tem.next.next;
        return head;
    }
}