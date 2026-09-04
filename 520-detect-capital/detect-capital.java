class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0, low = 0, first = 0;

        for (char c : word.toCharArray()) {
            if(c >= 65 && c <= 90) {
                caps++;

                if(first == 0) first = 1;

            } else {
                low++;

                if(first == 0) first = 2;
            }
        }
        
        return (caps == 0 || low == 0 || first == 1 && caps == 1);
    }
}