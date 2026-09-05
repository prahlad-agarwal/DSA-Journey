class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        String[] strArray = s.split(" ");

        for (String word : strArray) {

            int st = 0, end = word.length() - 1;
            char[] ch = word.toCharArray();

            while(st < end) {
                char temp = ch[st];
                ch[st] = ch[end];
                ch[end] = temp;

                st++;
                end--;
            }
            ans.append(new String(ch) + " ");
        }  

        return ans.toString().trim();
    }
}