package problems.recursion.udemyCourse.basics;

public class ProductOfArray {

    //Problem : Write a function called productOfArray which takes in an array of numbers and returns the product of them all.

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int productofArray = productofArray(arr, arr.length);
        System.out.format("The product of array is %d", productofArray);
    }

    public static int productofArray(int A[], int N)
    {
        if(N == 0) return A[0];
        else {
            return A[N-1] * productofArray(A, N-1);
        }
    }

}
