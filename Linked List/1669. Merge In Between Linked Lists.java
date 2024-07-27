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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode initial=list1;
        ListNode head1=list1;
        int i=0;
        for(i=0;i<b;i++){
            initial=initial.next;
        }
        i=0;

        while(head1.next!=null){
            if(i==a-1)head1.next=list2;           
            head1=head1.next;
            i++;            
        }
        
        head1.next=initial.next;

        return list1;


    }
}