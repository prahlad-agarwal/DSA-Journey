import java.util.Stack;

class Solution {
    
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String str) {
  
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop(); // remove '('
            }

            else { // operator

                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && (precedence(stack.peek()) > precedence(ch)
                        || (precedence(stack.peek()) == precedence(ch) && ch != '^'))) {

                    ans.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        
        return ans.toString();
    }

}