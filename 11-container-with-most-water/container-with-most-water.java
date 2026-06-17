class Solution {
    public int maxArea(int[] height) {
        int lp = 0, rp = height.length - 1;
        int areaWater = 0;

        while(lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currWater = width * ht;
            areaWater = Math.max(areaWater, currWater);

            if(height[lp] < height[rp]) {
                lp++;
            }else {
                rp--;
            } 
        }

        return areaWater;
    }
}