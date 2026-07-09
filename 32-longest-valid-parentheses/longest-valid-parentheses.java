class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int max = 0;

        // left to right
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if(open == close) {
                max = Math.max(max, 2 * close);
            } else if(close > open) {
                open = close = 0;
            }
        }

        // right to left
        open = close = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if(open == close) {
                max = Math.max(max, 2 * close);
            } else if(open > close) {
                open = close = 0;
            }
        }
        return max;
    }
}