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
    public ListNode middleNode(ListNode head) {

        ListNode middle=head;
        ListNode end=head;
        while(end.next!=null&&end.next.next!=null){
            end=end.next.next;
            middle=middle.next;
        }
        if(end.next!=null) middle=middle.next;

        return middle;
    }
}