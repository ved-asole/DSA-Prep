package DSImplementation.array.DynamicArray;

import java.util.Arrays;

//Dynamic Array Implementation
public class Array{

    private int size;
    private int length;
    private int[] arr;

    public Array(int length) {
        this.arr = new int[length];
        this.length = length;
        this.size = 0;
    }

    public void insert(int value) {
        if (this.size == this.length) {
            int newSize = this.length * 2;
            int[] newArray = new int[newSize];
            if (this.length >= 0)
                newArray = Arrays.copyOf(this.arr, this.length);
            this.arr = newArray;
            this.length = arr.length;
        }
        this.arr[this.size] = value;
        this.size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < this.size; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.size--;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < this.size; i++) {
            if (i!= 0) System.out.print(", ");
            System.out.print(this.arr[i]);
        }
        System.out.print("]");
    }
}
