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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null) return null;
        TreeNode current = new TreeNode();
        if(root1!=null && root2!=null) {
            current.val=root1.val+root2.val;
        }
        else if(root1==null) return root2;
        else return root1;
        if(root1.left!=null&&root2.left!=null)
        current.left = mergeTrees(root1.left,root2.left);
        else if(root1.left==null) current.left=root2.left;
        else if(root2.left==null) current.left=root1.left;
        
        if(root1.right!=null&&root2.right!=null)
        current.right = mergeTrees(root1.right, root2.right);
        else if(root1.right==null) current.right=root2.right;
        else if(root2.right==null) current.right=root1.right;
        
        return current;
    }
}