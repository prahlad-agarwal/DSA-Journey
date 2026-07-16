/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int leafLevel = -1;
    
    public boolean helper(Node root, int currLevel) {
        if(root == null) {
            return true;
        }
        
        if(root.left == null && root.right == null) {
            if(leafLevel == -1) {
                leafLevel = currLevel;
                return true;
            }

            return (currLevel == leafLevel);
        }
        
        return helper(root.left, currLevel+1) && helper(root.right, currLevel+1);
    }

    public boolean check(Node root) {
        if(root == null) {
            return true;
        }
        
        if(helper(root, 0)) {
            return true;
        } else {
            return false;
        }
    }
}