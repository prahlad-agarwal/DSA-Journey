class Solution {
    public boolean isStringExist(String s, String[] str) {
        
        for(String word : str) {
            if(word.length() == s.length()) {
                
                int count = 0; 
                for(int i = 0; i < word.length(); i++) {    // s.length()
                    if(word.charAt(i) != s.charAt(i)) {
                        count++;
                    }
                }
                
                if(count == 1) {
                    return true;
                }
            }

        }

        return false;
    }
}