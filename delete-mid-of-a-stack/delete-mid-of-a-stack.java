class Solution {
    // Function to delete middle element of a stack.
    
    public int i = 1;
    
    public void deleteMid(Stack<Integer> s) {
        if(s.size() <= i) {
            s.pop();
            return;
        }
        
        int top = s.pop();
        i += 1;
        deleteMid(s);
        s.push(top);
    }
}