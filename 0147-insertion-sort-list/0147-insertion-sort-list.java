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
        // if(head==null || head.next==null){return head;}
        // ListNode temp = head;
        // while(temp!=null){
        //     ListNode next = temp.next;
        //     ListNode start = head;
        //     ListNode prev = head;
        //     //Now Compare
        //     while(start!=next){
        //         if(start.val>temp.val){
        //             temp.next = start;//Point temp to start
        //             if(start==head){//start is at the head
        //                 head = temp;
        //             }else{
        //                 prev.next = temp;
        //             }
        //             //Moving start pointer
        //             while(start.next!=temp){
        //                 start = start.next;
        //             }
        //             //Pointing start to the right pointer
        //             start.next = next;
        //         }
        //         //If less than the temp val
        //         prev = start;
        //         start = start.next;
        //     }
        //     temp = next;
        // }
        // return head;
        
        //APPROACH-2:O(1) approach
        if(head==null || head.next==null){return head;}
        ListNode prev = head;
        ListNode curr = prev.next;
        
        while(curr!=null){
            if(curr.val<prev.val){
                prev.next = curr.next;
                //Check if it is the head
                if(curr.val<=head.val){
                    curr.next = head;
                    head = curr;
                }else{
                    //Check from the starting
                    ListNode ptr = head;
                    //Finding right position for the ptr
                    while(ptr.next!=null && ptr.next.val < curr.val){
                        ptr = ptr.next;
                    }
                    //Swapping
                    ListNode temp = ptr.next;
                    ptr.next = curr;
                    curr.next = temp;
                }
                curr = prev.next;//Very important step this one. Remember the curr.next is changed.
                //Hence, can't be used and prev is pointing to the right node.
            }else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        
        return head;
    }
}