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
        Stack<Pair<TreeNode, Integer>> stackD = new Stack<>();
        stackD.push(new Pair<>(root, 1));
        int maxDepth=0;
        while(!stackD.empty()){
            Pair<TreeNode,Integer> currentPair = stackD.pop(); 
            TreeNode current = currentPair.getKey();
            int depth = currentPair.getValue();
            maxDepth = (depth<maxDepth)?maxDepth:depth;
            if(current.right!=null) 
            stackD.push(new Pair<>(current.right,depth+1));
            if(current.left!=null) 
            stackD.push(new Pair<>(current.left,depth+1));
            
        }
        return maxDepth;
        
    }
}