/*Complete the function(s) below*/
class GfG {
    public int size = 0;
    public void push(int a, Stack<Integer> s) {
        size++;
        s.push(a);
    }

    public int pop(Stack<Integer> s) {
        int a = s.pop();
        size--;
        return a;
    }

    public int min(Stack<Integer> s) {
        int minimum = Integer.MAX_VALUE;
        while (!s.isEmpty()) {
            minimum = Math.min(minimum, s.peek());
            s.pop();
        }
        return minimum;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        return size == n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        return s.isEmpty();
    }
}