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
    public void inOrder(TreeNode root, Queue<Integer> q) {
        if(root == null) {
            return;
        }

        inOrder(root.left, q);
        q.add(root.val);
        inOrder(root.right, q);
    }

    public int getMinimumDifference(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        inOrder(root, q);

        int prev = q.remove();
        int ans = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int curr = q.remove();
            ans = Math.min(ans, curr-prev);
            prev = curr;
        }
  
        return ans;
    }
}