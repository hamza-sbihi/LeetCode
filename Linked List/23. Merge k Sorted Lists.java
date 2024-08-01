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
    public ListNode mergeKLists(ListNode[] lists) {
        int size=lists.length;
        int interval=1;
        while(interval<size){
            for(int i =0;i<size-interval;i+=2*interval){
                lists[i]=merge2Lists(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return size > 0 ? lists[0] : null;
    }
    public static ListNode merge2Lists(ListNode l,ListNode l1){
        ListNode head=new ListNode();
        ListNode current=head;
        while(l!=null&&l1!=null){
            if(l.val<l1.val){
                current.next=l;
                l=l.next;
            }
            else{
                current.next=l1;
                l1=l1.next;
            }
            current=current.next;
        }
        current.next=(l==null)?l1:l;
        return head.next;
    }
}