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
    class Info {
        TreeNode node;
        int row, col;

        Info(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Info> q = new LinkedList<>();

        q.offer(new Info(root, 0, 0));

        while (!q.isEmpty()) {
            Info cur = q.poll();

            map.putIfAbsent(cur.col, new ArrayList<>());
            map.get(cur.col).add(new int[]{cur.row, cur.node.val});

            if (cur.node.left != null)
                q.offer(new Info(cur.node.left, cur.row + 1, cur.col - 1));

            if (cur.node.right != null)
                q.offer(new Info(cur.node.right, cur.row + 1, cur.col + 1));
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (List<int[]> list : map.values()) {
            Collections.sort(list, (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0];
                return a[1] - b[1];
            });

            List<Integer> col = new ArrayList<>();
            for (int[] arr : list)
                col.add(arr[1]);

            ans.add(col);
        }

        return ans;
    }
}