import java.util.*;

class Solution {
    
     class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;
        int freq;

        public Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public Node root = new Node();
    
    public void insertPrefix(String word) {
        Node curr = root;

        for(int level = 0; level < word.length(); level++) {

            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }

    
    public String findPrefix(String word) {

        Node curr = root;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            curr = curr.children[idx];

            ans.append(word.charAt(i));

            // Only one word has this prefix
            if (curr.freq == 1) {
                break;
            }
        }

        return ans.toString();
    }

    public ArrayList<String> findPrefixes(String[] arr) {

        // Reset Trie
        root = new Node();

        // STEP 1: Build Trie
        for (int i = 0; i < arr.length; i++) {
            insertPrefix(arr[i]);
        }

        ArrayList<String> res = new ArrayList<>();

        // STEP 2: Process words in ORIGINAL order
        for (int i = 0; i < arr.length; i++) {

            String prefix = findPrefix(arr[i]);

            res.add(prefix);
        }

        return res;
    }
}