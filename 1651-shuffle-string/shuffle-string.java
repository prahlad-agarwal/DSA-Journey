class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];

        for(int i = 0; i < indices.length; i++) {
            int val = indices[i];
            ans[val] = s.charAt(i);
        } 

        return new String(ans);
    }
}