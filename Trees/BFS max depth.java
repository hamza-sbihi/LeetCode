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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> treeQ = new LinkedList<>();
        int depth=0;
        treeQ.offer(root);
        while(!treeQ.isEmpty()){
            int len=treeQ.size();
            for(int i=0;i<len;i++){
                TreeNode current = treeQ.poll();
                if(current.right!=null) treeQ.offer(current.right);
                if(current.left!=null) treeQ.offer(current.left);
            }
            depth++;
        }
        return depth;
        
    }
}