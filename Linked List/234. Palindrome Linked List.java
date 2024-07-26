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
    public boolean isPalindrome(ListNode head) {
        
        // O(n) time O(1) space
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode nextCurrent=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextCurrent;
        }

        while(prev!=null&&head!=null){
            if(prev.val!=head.val) return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
        /*
        O(n) space and time

        List<Integer> palindromeArr=new ArrayList<>();
        while(head!=null){
            palindromeArr.add(head.val);
            head=head.next;
        }

        int l=0;
        int r=palindromeArr.size()-1;
        while(l<r){
            if(palindromeArr.get(l)!=palindromeArr.get(r))
             return false;
            l++;
            r--;
        }
        return true;
        */
    }
}