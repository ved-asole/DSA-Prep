package DSImplementation.hashing.directChaining;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    // Time Complexity = O(1) and Space Complexity = O(N)
    public DirectChaining(int size) {
        this.hashTable = new LinkedList[size];
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i,sum;
        for (sum=0, i=0; i < word.length()-1 ; i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void insert(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(1)
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash Table does not exist!");
            return;
        } else {
            System.out.println("---------------HashTable-------------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key : " + hashTable[i]);
            }
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(1)
    public boolean searchHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            System.out.println("\"" + word + "\" found in HashTable at the location: " + newIndex);
            return true;
        } else {
            System.out.println("\"" + word + "\" not found in HashTable" );
            return false;
        }
    }

    public void deleteKeyHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        boolean result = searchHashTable(word);
        if (result) {
            hashTable[index].remove(word);
            System.out.println("\"" + word + "\" has been deleted from HashTable");
        }
    }

}
