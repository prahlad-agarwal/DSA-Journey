import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int count = 0;

        for(int i = 1; i < s.length(); i++) {

            int ithmin1 = map.get(s.charAt(i-1));
            int ithVal = map.get(s.charAt(i));

            if(ithVal > ithmin1) {
                count -= ithmin1;
            } else {
                count += ithmin1;
            }
        }   
        
        return count + map.get(s.charAt(s.length()-1));
    }
}