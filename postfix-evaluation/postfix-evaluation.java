class Solution {
    
    public int floorDiv(int a, int b) {
        if(a * b < 0 && a % b != 0) return (a / b) - 1;
               
        return a / b;
    }
    
    public int evaluatePostfix(String[] arr) {
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            
            if(Character.isDigit(arr[i].charAt(0)) || (arr[i].length() > 1 && arr[i].charAt(0) == '-')) {
                s.push(Integer.parseInt(arr[i]));
            } else {
                int operand1 = s.pop();
                int operand2 = s.pop();
                
                if(arr[i].equals("*")) s.push(operand2 * operand1);
                else if(arr[i].equals("+")) s.push(operand2 + operand1);
                else if(arr[i].equals("-")) s.push(operand2 - operand1);
                else if(arr[i].equals("/")) s.push(floorDiv(operand2, operand1));
                else if(arr[i].equals("^")) s.push((int)Math.pow(operand2, operand1));
            }
        }
        
        return s.peek();
    }
}
