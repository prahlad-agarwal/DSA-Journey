class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int count = nums[0];

        for(int i = 1; i < nums.length; i++) {
            count += nums[i];
            ans[i] = count;
        }

        return ans;
    }
}