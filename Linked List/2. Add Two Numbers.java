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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        int rest=0;
        ListNode res=new ListNode();
        ListNode current=res;
        while(l1!=null||l2!=null||rest!=0){
            int val=rest;
            if(l1!=null){val+=l1.val;l1=l1.next;}
            if(l2!=null){val+=l2.val;l2=l2.next;}
            res.next=new ListNode(val%10);
            rest=val/10;
            res=res.next;           
            
        } 

        return current.next;
    }

}