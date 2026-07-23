/**
 * Definition for a binary tree TreeNode.
 * public class TreeTreeNode {
 *     int val;
 *     TreeTreeNode left;
 *     TreeTreeNode right;
 *     TreeTreeNode() {}
 *     TreeTreeNode(int val) { this.val = val; }
 *     TreeTreeNode(int val, TreeTreeNode left, TreeTreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidate(TreeNode root, TreeNode min, TreeNode max) {
        if(root == null) {
            return true;
        }

        if((min != null && root.val <= min.val) || (max != null && root.val >= max.val)) {
            return false;
        }

        return isValidate(root.left, min, root) && isValidate(root.right, root, max);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidate(root, null, null);
    }
}