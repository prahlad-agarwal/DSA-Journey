class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s = new Stack<>();

        s.add(str.charAt(0));

        for(int i = 0; i < str.length()-1; i++) {

            if(!s.isEmpty() && str.charAt(i+1) == s.peek()) {
                s.pop();
            } else {
                s.add(str.charAt(i+1));
            }
        }

        return s.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}