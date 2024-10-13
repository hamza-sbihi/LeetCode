/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        return sum(root,low,high,0);

    }
    public int sum(TreeNode root, int low, int high, int currSum){
        
        if(root==null) return currSum;
        int sum=currSum;
        if(root.val<=high&&root.val>=low) sum+=root.val;
        if(root.val>low) sum+=sum(root.left,low,high,currSum);
        if(root.val<high) sum+=sum(root.right,low,high,currSum);
        
        return sum;
    }
}