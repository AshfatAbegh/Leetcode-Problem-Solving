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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
       if (root == null && subRoot == null || root != null && subRoot == null) 
       return true;
       if (root == null && subRoot != null) 
       return false;    

       if (isSimilar(root, subRoot)) 
       return true;
       
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSimilar(TreeNode a, TreeNode b){
       
       if(a==null && b==null) return true;
       
       if(a==null && b!=null || a!=null && b==null) return false;

       if (a.val != b.val) return false;

       return isSimilar(a.left, b.left) && isSimilar(a.right, b.right);
    }
}