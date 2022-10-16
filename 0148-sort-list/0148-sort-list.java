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
    public ListNode sortList(ListNode head) {
        //base case
        if(head==null || head.next==null){return head;}
        
        ListNode prev = head;
        ListNode curr = prev.next;
        
        while(curr!=null){
           if(curr.val < prev.val){
               prev.next = curr.next;
               //Check if it is the head
               if(curr.val <= head.val){
                   curr.next = head;
                   head = curr;
               }else{
                   //Starting from the head
                   ListNode ptr = head;
                   while(ptr.next!=null && ptr.next.val < curr.val){
                       ptr = ptr.next;
                   }
                   ListNode temp = ptr.next;
                   ptr.next = curr;
                   curr.next = temp;    
               }
               curr = prev.next;               
           }else{
               curr = curr.next;
               prev = prev.next;
           }     
        }
        
        return head;
    }
}