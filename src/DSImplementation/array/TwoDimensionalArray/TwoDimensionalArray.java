package DSImplementation.array.TwoDimensionalArray;

//Dynamic Array Implementation
public class TwoDimensionalArray {

    /*
     * 2D array of type arr[m][n]
     * where,
     * m = number of rows
     * n = number of columns
     */

    int[][] arr = null;

    //constructor - timeComplexity = O(1), spaceComplexity = O(mn)
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        arr = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //insert an element - timeComplexity = O(1), spaceComplexity = O(1)
    public void insert(int row, int col, int value){
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to 2D array!");
        }
    }

    //access an element - timeComplexity = O(1), spaceComplexity = O(1)
    public void accessCell(int row, int col){
        try {
            System.out.println("The value at index [" + row + "][" + col + "] is " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to 2D array!");
        }
    }

    //traverse array - timeComplexity = O(mn), spaceComplexity = O(1)
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("[");
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("] ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    //Linear Searching an element - timeComplexity = O(mn), spaceComplexity = O(1)
    public void searchInArray(int value){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Value " + value + " found at index of [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Value " + value + " not found in the array");
    }

    //Delete value from Array - timeComplexity = O(1), spaceComplexity = O(1)
    public void deleteValue(int row, int col){
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.format("Cant delete the value as index [%d] [%d] provided is not in the range of array!", row, col);
        }
    }

}
