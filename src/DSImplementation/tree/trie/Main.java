package DSImplementation.tree.trie;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("API");
        trie.insert("APIS");

        trie.search("API");
        trie.search("APIS");
        trie.search("AP");
        trie.search("APPS");

        System.out.println(trie.root.children.keySet());

        trie.delete("API");
        trie.search("API");
        trie.search("APIS");

        System.out.println(trie.root.children.keySet());

//        trie.deleteTrie();
    }
}