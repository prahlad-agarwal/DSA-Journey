class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // calculate Left Max boundary
        int leftArr[] = new int[n];
        leftArr[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftArr[i] = Math.max(height[i], leftArr[i - 1]);
        }

        // calculate Right Max boundary
        int rightArr[] = new int[n];
        rightArr[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(height[i], rightArr[i + 1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {

            // waterLevel = min(maxLeft, maxRight)
            int waterLevel = Math.min(leftArr[i], rightArr[i]);

            // trappedWater = (waterLevel - height)
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}