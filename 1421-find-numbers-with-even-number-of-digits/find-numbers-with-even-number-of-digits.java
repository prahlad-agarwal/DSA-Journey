class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;

        for(int i = 0; i < nums.length; i++) {
            StringBuilder s = new StringBuilder().append(nums[i]);
            if(s.length() % 2 == 0) {
                even++;
            }
        }
        
        return even;
    }
}