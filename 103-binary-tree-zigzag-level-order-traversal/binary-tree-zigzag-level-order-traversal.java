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
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode currNode = q.remove();
                        
                if(leftToRight) {
                    temp.add(currNode.val);
                } else {
                    temp.add(0, currNode.val);
                }
                
                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
                
            }

            ans.add(temp);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}