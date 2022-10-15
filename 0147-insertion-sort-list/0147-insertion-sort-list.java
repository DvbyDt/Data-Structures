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
    public ListNode insertionSortList(ListNode head) {
      //APPROACH-1: BRUTE FORCE
      //base case
        if(head==null || head.next==null){return head;}
        ListNode temp = head;
        while(temp!=null){
            ListNode next = temp.next;
            ListNode start = head;
            ListNode prev = head;
            //Now Compare
            while(start!=next){
                if(start.val>temp.val){
                    temp.next = start;//Point temp to start
                    if(start==head){//start is at the head
                        head = temp;
                    }else{
                        prev.next = temp;
                    }
                    //Moving start pointer
                    while(start.next!=temp){
                        start = start.next;
                    }
                    //Pointing start to the right pointer
                    start.next = next;
                }
                //If less than the temp val
                prev = start;
                start = start.next;
            }
            temp = next;
        }
        return head;
    }
}