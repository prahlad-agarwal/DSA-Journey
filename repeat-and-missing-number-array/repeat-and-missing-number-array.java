import java.util.Arrays;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] nums) {
        int dup = 0;
        int count = 1;
        int i = 0;
        int n = nums.length;

        Arrays.sort(nums);

        for(i = 0; i < n; i++) { 
            
	    // find duplicate value
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                dup = nums[i];
            }
                
	    // find missing value
            if(count == nums[i]) {
                count++;
            } else if(count - 1 == nums[i]) {
                count = count;
            }
        }
        return new int[]{dup, count};
    }
}