package DSImplementation.array.OnedimentionalArray;

//Dynamic Array Implementation
public class OneDimensionalArray {

    int[] arr = null;

    //constructor - timeComplexity = O(1), spaceComplexity = O(n)
    public OneDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //insert an element - timeComplexity = O(1), spaceComplexity = O(1)
    public void insert(int location, int value){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted " + value + " at index " + location);
            } else {
                System.out.println("This cell is already occupied by another value.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    //traverse array - timeComplexity = O(n), spaceComplexity = O(1)
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    //Linear Searching an element - timeComplexity = O(n), spaceComplexity = O(1)
    public void searchInArray(int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value " + value + " found at index of " + i);
                return;
            }
        }
        System.out.println("Value " + value + " not found in the array");
    }

    //Delete value from Array - timeComplexity = O(1), spaceComplexity = O(1)
    public void deleteValue(int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.format("Cant delete the value as index %d provided is not in the range of array!", valueToDeleteIndex);
        }
    }

}
