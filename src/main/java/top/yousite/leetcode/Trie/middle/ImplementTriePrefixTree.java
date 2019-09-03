package top.yousite.leetcode.Trie.middle;


public class ImplementTriePrefixTree {
    /**
     * 208. 实现 Trie (前缀树)
     */
    class Trie {

        /**
         * 前缀树节点
         */
        private class TrieNode{
            TrieNode[] children;
            boolean isEnd;
            TrieNode(){
                children = new TrieNode[26];
                isEnd = false;}
        }


        private TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                int j = word.charAt(i) - 'a';
                if (node.children[j] == null){
                    node.children[j] = new TrieNode();
                }
                node= node.children[j];
            }
            node.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                int j = word.charAt(i) - 'a';
                if (node.children[j] == null){
                    return false;
                }
                node=node.children[j];
            }
            return node.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (int i = 0; i < prefix.length(); i++) {
                int j = prefix.charAt(i)-'a';
                if (node.children[j] == null){
                    return false;
                }
                node=node.children[j];
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
}
