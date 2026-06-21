import java.util.Arrays;

class Solution {
    public void printDuplicates(String s) {

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int count = 1;

        for(int i = 1; i < ch.length; i++) {
            if(ch[i] == ch[i - 1]) {
                count++;
            } else {
                if(count >= 2) System.out.print("['" + ch[i - 1] + "' " + count + "], ");
                count = 1;
            }
        }
        if(count >= 2) System.out.print("['" + ch[ch.length-1] + "' " + count + "]");
    }
}