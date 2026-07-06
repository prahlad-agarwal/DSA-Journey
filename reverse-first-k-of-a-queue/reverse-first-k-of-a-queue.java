class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(k > q.size() || k <= 0) return q;

        Stack<Integer> s = new Stack<>();

        for(int i = k; i >= 1; i--) {
            s.push(q.poll());
        }

        while(!s.isEmpty()) {
            q.add(s.pop());
        }

        int rem = q.size() - k;
        for(int i = 1; i <= rem; i++) {
            q.add(q.poll());
        }
        
        return q;
    }
}