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

    private ListNode reverse(ListNode head){

           ListNode prev = null;
           while(head != null){
               ListNode next = head.next;
               head.next = prev;
               prev = head;
               head = next;
           }
           return prev;
       }

   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  
       l1 = reverse(l1);
       l2 = reverse(l2);

       ListNode dummy = new ListNode(0);
       ListNode current = dummy;
       int carry = 0;

       while(l1 != null || l2 != null || carry > 0) {

           int sum = carry;

           if(l1 != null){
               sum = sum +  l1.val;
               l1 = l1.next; 
           }

           if(l2 != null){
               sum = sum + l2.val;
               l2 = l2.next;
           }

           carry = sum / 10;
           current.next = new ListNode(sum % 10);
           current = current.next;
       }        

       return reverse(dummy.next);
   }
}