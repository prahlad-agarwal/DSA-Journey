class Solution {
    public int findGCDOfTwo(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }

    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return findGCDOfTwo(min, max);
    }
}