package DSImplementation.array.TwoDimensionalArray;

public class Main {

    public static void main(String[] args) {

        TwoDimensionalArray tda = new TwoDimensionalArray(2, 3);
        tda.insert(0, 0, 10);
        tda.insert(0, 1, 20);
        tda.insert(0, 2, 30);
        tda.insert(1, 0, 40);
        tda.insert(1, 1, 50);
        tda.insert(1, 2, 60);

        tda.traverseArray();

        tda.accessCell(1, 2);

        tda.searchInArray(50);

        tda.deleteValue(0,2);

        tda.traverseArray();
    }

}
