class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int isOdd = 0;

        for (int i : arr) {
            if(i % 2 == 1) {
                isOdd++;
                if(isOdd == 3) {
                    return true;
                }
            } else {
                isOdd = 0;
            }
        }
        return false;
    }
}