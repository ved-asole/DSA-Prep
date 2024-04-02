package DSImplementation.array.OnedimentionalArray;

public class Main {

    public static void main(String[] args) {

        OneDimensionalArray oda = new OneDimensionalArray(5);
        oda.insert(0, 10);
        oda.insert(1, 20);
        oda.insert(2, 30);
        oda.insert(3, 40);
        oda.insert(4, 50);

        oda.traverseArray();

        oda.searchInArray(30);

        oda.deleteValue(3);

        oda.traverseArray();
    }

}
