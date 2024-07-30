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
        
        ListNode prev=reverse(head);

        ListNode current=prev;
        if(n==1){
            return reverse(current.next);
        }
        if(n==2){
            current.next=current.next.next;
            return reverse(prev);
        }
        for(int i=0;i<n-1;i++){
            if(i==n-2) {current.next=current.next.next;
            break;}
            current=current.next;
            
        }
        return reverse(prev);
    }

    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
            ListNode nextCurrent=current.next;
            current.next=prev;
            prev=current;
            current=nextCurrent;
        }
        return prev;
    }
}
