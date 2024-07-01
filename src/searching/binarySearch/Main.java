package searching.binarySearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 10, 23, 11};

        Arrays.sort(arr);

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(arr, 10);
        binarySearch.binarySearch(arr, 30);

    }

}
