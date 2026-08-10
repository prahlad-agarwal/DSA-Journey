class Solution {

    class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;

        public Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public Node root = new Node();

    public void insert(String word) {
        Node curr = root;

        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }

    public boolean search(String key) {
        Node curr = root;

        for(int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endOfWord == true;
    }

    public boolean entireLogic(String key, int start) {
        if(start == key.length()) {
            return true;
        }

        if(dp[start] != null) {
            return dp[start];
        }

        for(int i = start + 1; i <= key.length(); i++) {

            if(search(key.substring(start, i)) &&
            entireLogic(key, i)) {

                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }

    private Boolean[] dp;
    public boolean wordBreak(String key, List<String> wordDict) {

        for (String word : wordDict) {
            insert(word);
        }

        dp = new Boolean[key.length() + 1];

        return entireLogic(key, 0);
    }
}