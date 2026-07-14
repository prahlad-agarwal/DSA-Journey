/*
Definition for Node
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

class Solution {
    public ArrayList<Integer> rightView(Node root) {
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
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
            }
        }
        return ans;
    }
}