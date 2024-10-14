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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        while(!treeQ.isEmpty()){
            int len=treeQ.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode curr = treeQ.poll();
                arr.add(curr.val);
                if(curr.left!=null) treeQ.offer(curr.left);
                if(curr.right!=null) treeQ.offer(curr.right);
            }
            res.add(arr);
        }
        return res;
        
    }
}