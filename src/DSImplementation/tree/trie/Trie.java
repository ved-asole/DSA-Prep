package DSImplementation.tree.trie;

public class Trie {

    public TrieNode root;

    // Time Complexity = O(1) and Space Complexity = O(1)
    public Trie() {
        root = new TrieNode();
        System.out.println("Trie has been created!");
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void insert(String word) {
        TrieNode current =  root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie");
    }

    // Time Complexity = O(N) and Space Complexity = O(1)
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            // Case 1 : Word does not exist in Trie
            if (node == null) {
                System.out.println("Word " + word + " does not exist in the Trie");
                return false;
            }
            current = node;
        }
        // Case 2 : Word exists
        if (current.endOfString) {
            System.out.println("Word " + word + " exist in the Trie");
            return true;
        }
        // Case 3 : Word exists, but it's a prefix of another string and not the end of a string
        else {
            System.out.println("Word " + word + " does not exist in the Trie. But is a prefix of another string");
            return false;
        }
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canBeDeleted;

        // Case 1: Some other word prefix is same as current node
        if (currentNode.children.size() > 1){
            delete(currentNode, word, index+1);
            return false;
        }
        // Case 2: We are at last character, but it's a prefix of another string
        if (index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        // Case 3: Some other word is prefix of this word
        if (currentNode.endOfString) {
            delete(currentNode, word, index+1);
            return false;
        }
        // Case 4: No other word is prefix of this word
        canBeDeleted = delete(currentNode, word, index+1);
        if (canBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }

}