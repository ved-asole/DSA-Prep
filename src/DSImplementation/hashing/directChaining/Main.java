package DSImplementation.hashing.directChaining;

public class Main {

    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insert("One");
        directChaining.insert("Two");
        directChaining.insert("Three");
        directChaining.insert("Four");
        directChaining.insert("Five");
        directChaining.insert("Six");
        directChaining.insert("Ninety");
        directChaining.insert("Random");

        directChaining.displayHashTable();

        directChaining.searchHashTable("Six");
        directChaining.searchHashTable("Eighty");

        directChaining.deleteKeyHashTable("Six");

        directChaining.displayHashTable();

        directChaining.searchHashTable("Six");

    }

}
