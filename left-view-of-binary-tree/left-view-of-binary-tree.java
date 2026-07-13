/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) {
            return ans;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                Node currNode = q.remove();

                if(i == 0) {
                    ans.add(currNode.data);
                }
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        return ans;
    }
}