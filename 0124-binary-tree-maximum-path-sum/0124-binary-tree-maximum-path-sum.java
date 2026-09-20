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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findmax(root);
        return ans;
    }
    public int findmax(TreeNode root){
        if(root==null) return 0;
        int l=Math.max(0,findmax(root.left));
        int r=Math.max(0,findmax(root.right));
        int curr=root.val+l+r;
        ans=Math.max(ans, curr);
        return root.val+Math.max(l,r);
    }
}