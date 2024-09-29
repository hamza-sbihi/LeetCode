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
    public boolean isBalanced(TreeNode root) {
        return depth(root).getKey();
    }
    public Pair<Boolean,Integer> depth(TreeNode root){
        if(root == null) return new Pair<>(true,0);
        Pair<Boolean,Integer> left = depth(root.left);
        Pair<Boolean,Integer> right = depth(root.right);
        Boolean isB = (left.getKey()&&right.getKey()
        &&(Math.abs(left.getValue()-right.getValue())<=1));
        return new Pair<>(isB,1+Math.max(left.getValue(),right.getValue()));
    }
}