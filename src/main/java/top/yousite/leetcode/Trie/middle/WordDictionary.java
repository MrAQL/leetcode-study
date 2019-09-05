package top.yousite.leetcode.Trie.middle;

/**
 * 211. 添加与搜索单词 - 数据结构设计
  */
//思路:前缀树 + bfs
public class WordDictionary {

    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int j = word.charAt(i)-'a';
            if (node.children[j] == null){
                node.children[j] = new TrieNode();
            }
            node=node.children[j];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return help(root,word,0);
    }

    private boolean help(TrieNode node,String express,Integer index){
        if (index == express.length()){
            return node.isEnd;
        }
        char ch = express.charAt(index);

        //TODO 不是.
        if (ch != '.'){
            int j = ch - 'a';
            if (node.children[j] == null){
                return false;
            }else{
                return help(node.children[j],express,index+1);
            }

        //TODO 是. -->迭代每个children
        }else{
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null && help(node.children[i],express,index+1)){
                    return true;
                }
            }
            return false;
        }
    }
}

/**
 * 前缀树节点
 */
class TrieNode{
    TrieNode[] children;
    boolean isEnd;
    TrieNode(){
        children = new TrieNode[26];
        isEnd = false;
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
