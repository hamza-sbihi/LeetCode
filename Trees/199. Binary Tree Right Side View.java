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
//recurssive
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        return RSV(root,arr,0);
    }
    public List<Integer> RSV(TreeNode root,List<Integer> arr,int level){
        if(root == null) return new ArrayList<>();
        if(level==arr.size()) {
            arr.add(root.val);
            }
        RSV(root.right,arr,level+1);
        RSV(root.left,arr,level+1);
        return arr;
    }
}
//iterative
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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.offer(root);
        List<Integer> res = new ArrayList<>();
        while(!treeQ.isEmpty()){
            int len=treeQ.size();
            
            for(int i=0;i<len;i++){
                TreeNode curr = treeQ.poll();
                if(i==len-1)
                res.add(curr.val);
                if(curr.left!=null) treeQ.offer(curr.left);
                if(curr.right!=null) treeQ.offer(curr.right);
            }
            
        }
        return res;
    }
}