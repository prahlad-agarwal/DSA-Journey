import java.util.Stack;

class Solution {
    public String removeStars(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*' && !s.isEmpty()) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character c : s) {
            sb.append(c);
        }

        return sb.toString();
    }
}