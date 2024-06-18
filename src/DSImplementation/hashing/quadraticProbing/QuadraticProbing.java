package DSImplementation.hashing.quadraticProbing;

import java.util.ArrayList;

public class QuadraticProbing {

    String[] hashTable;
    int usedCellNumber;

    // Time Complexity = O(1) and Space Complexity = O(N)
    public QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    // Time Complexity = O(N) and Space Complexity = O(1)
    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i,sum;
        for (sum=0, i=0; i < word.length(); i++) sum += ch[i];
        return sum % M;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public double getLoadFactor() {
        return usedCellNumber * 1.0 /hashTable.length;
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s: hashTable){
            if (s != null) data.add(s);
        }
        data.add(word);
        hashTable = new String[hashTable.length*2];
        for (String s: data) {
            insertKeyInHashTable(s);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void insertKeyInHashTable(String word) {
        if(getLoadFactor() >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter = 0;
            for (int i = index; i < index+hashTable.length; i++) {
                // To get every index from the index to the end of hashTable
                int newIndex = (index + (counter*counter)) % hashTable.length;
                if (hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted successfully at location :" + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. Trying next empty cell");
                }
                counter++;
            }
        }
        usedCellNumber++;
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
    public boolean searchInHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            // To get every index from the index to the end of hashTable
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println(word + " found at location : " + newIndex);
                return true;
            }
        }
        System.out.println(word + " not found in the HashTable");
        return false;
    }

    // Time Complexity = O(N) and Space Complexity = O(1)
    public void deleteKeyHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            // To get every index from the index to the end of hashTable
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println(word + " has been deleted from HashTable");
                return;
            }
        }
        System.out.println(word + " not found in HashTable");
    }

}