/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode faster = head;
        boolean check = false;

      
    while(faster!=null && faster.next!=null){

        faster = faster.next.next;
        slow = slow.next;

        if(slow== faster){
            check = true;
            break;
        }
    }
    if(check){
       faster = head;
    }
    if(faster== null || faster.next==null){
       return  null;
    }
  
while(slow!=faster){
    slow =slow.next;
    faster = faster.next;
}
 return faster;
    }
}