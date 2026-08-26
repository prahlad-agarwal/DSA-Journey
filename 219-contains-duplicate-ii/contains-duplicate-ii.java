import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {
                int currIdx = i;
                int prevIdx = map.get(nums[i]);

                int sub = currIdx - prevIdx;
                if(Math.abs(sub) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}