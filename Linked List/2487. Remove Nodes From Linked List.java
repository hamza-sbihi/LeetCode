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
    public ListNode removeNodes(ListNode head) {

        ListNode previous=null;
        ListNode current=head;
        //reversing the linked List
        while(current!=null){
            ListNode nextCurrent=current.next;
            current.next=previous;
            previous=current;
            current=nextCurrent;
        }
        //deleting if next element is less than current and update pointer when its greater

        ListNode revPrevious=previous;
        while(revPrevious.next!=null){
            if(revPrevious.val>revPrevious.next.val)
            revPrevious.next=revPrevious.next.next;
            else revPrevious=revPrevious.next;
        }

        //reversing the List again
        ListNode result=null;
        ListNode current2=previous;
        while(current2!=null){
            ListNode nextCurrent=current2.next;
            current2.next=result;
            result=current2;
            current2=nextCurrent;
        }

        return result;
    

        
    }
}