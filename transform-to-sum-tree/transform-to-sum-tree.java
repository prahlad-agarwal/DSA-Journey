/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public int sumChildNodes(Node root) {
        if(root == null) {
            return 0;
        }
        
        int leftChild = sumChildNodes(root.left);
        int rightChild = sumChildNodes(root.right);
        
        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        
        root.data = leftChild + rightChild + newLeft + newRight;
        
        return data;
    }
    
    public void toSumTree(Node root) {
        sumChildNodes(root);

    }
}