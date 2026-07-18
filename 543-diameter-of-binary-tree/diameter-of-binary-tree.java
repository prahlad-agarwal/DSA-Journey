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
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);

        return Math.max(lheight, rheight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftdiam = diameterOfBinaryTree(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt;
        return Math.max(selfDiam, Math.max(leftdiam, rightDiam));
    }
}