package DSImplementation.hashing.linearProbing;

public class Main {

    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(13);
        linearProbing.insertInHashTable("The");
        linearProbing.insertInHashTable("quick");
        linearProbing.insertInHashTable("brown");
        linearProbing.insertInHashTable("fox");
        linearProbing.insertInHashTable("over");

        linearProbing.searchInHashTable("fox");

        linearProbing.deleteKeyHashTable("fox");
        linearProbing.displayHashTable();

    }

}
