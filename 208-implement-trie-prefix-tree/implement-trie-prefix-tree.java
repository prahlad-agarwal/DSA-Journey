class Trie {

    private Trie[] children;
    private boolean endOfWord;

    public Trie() {
        children = new Trie[26];
        endOfWord = false;

        // for(int i = 0; i < 26; i++) {
        //     children[i] = null;
        // }
    }
    
    public void insert(String word) {
        Trie curr = this;

        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Trie();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }
    
    public boolean search(String word) {
        Trie curr = this;

        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endOfWord == true;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;

        for(int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */