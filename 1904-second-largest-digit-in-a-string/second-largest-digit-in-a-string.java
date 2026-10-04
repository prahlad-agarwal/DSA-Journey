class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(char c : s.toCharArray()) {
            if (Character.isDigit(c)) {

                int num = Character.getNumericValue(c);
                if(num > max) {
                    sMax = max;
                    max = num;
    
                } else if(num > sMax && num != max) {
                    sMax = num;
                }
            }
        }

        return (sMax == Integer.MIN_VALUE) ? -1 : sMax;
    }
}