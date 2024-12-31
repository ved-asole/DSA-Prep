package searching.binarySearch;

public class BinarySearch {

    public int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start+end)/2;
//        System.out.printf("Start: %d, Mid: %d, End: %d\n", start, mid, end);
        while (start <= end) {
            if (arr[mid] == value) {
                System.out.println("The element is found at the index : " + mid);
                return mid;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start+end)/2;
//            System.out.printf("Start: %d, Mid: %d, End: %d\n", start, mid, end);
        }
        System.out.println("The element " + value + " is not found");
        return -1;
    }

}
