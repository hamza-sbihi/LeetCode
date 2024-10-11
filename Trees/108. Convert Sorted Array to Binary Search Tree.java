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
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        return findRoot(nums,l,r);
    }
    public TreeNode findRoot(int [] nums,int l, int r){
        if (l > r) return null;
        int m = (r-l)/2 +l;
        
        TreeNode root = new TreeNode(nums[m]);
        root.right = findRoot(nums,m+1,r);
        root.left = findRoot(nums,l,m-1);
        return root;
    }
    
}