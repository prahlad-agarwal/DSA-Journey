class Solution {
    public String removeDuplicates(String s) {
        
        char[] ch = new char[s.length()];
        ch[0] = s.charAt(0);
        int idx = 0;

        for(int i = 1; i < s.length(); i++) {

            if(s.charAt(i) != ch[idx]) {
                idx++;
                ch[idx] = s.charAt(i);
            }
        }
        return new String(ch);
        
    }
}