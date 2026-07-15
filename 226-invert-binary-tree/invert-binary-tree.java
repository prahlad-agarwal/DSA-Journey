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
import java.util.*;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();

            TreeNode temp = currNode.left;
            currNode.left = currNode.right;
            currNode.right = temp;

            if(currNode.left != null) {
                q.add(currNode.left);
            }
            if(currNode.right != null) {
                q.add(currNode.right);
            }
        }
        return root;
    }
}