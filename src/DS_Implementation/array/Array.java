package DS_Implementation.array;

//Dynamic Array Implementation
public class Array{

    private int size;
    private int length;
    private int[] array;

    public Array(int length) {
        this.array = new int[length];
        this.length = length;
        this.size = 0;
    }

    public void insert(int value) {
        if (this.size == this.length) {
            int newSize = this.length * 2;
            int[] newArray = new int[newSize];
            if (this.length >= 0) System.arraycopy(this.array, 0, newArray, 0, this.length);
            this.array = newArray;
            this.length = array.length;
        }
        this.array[this.size] = value;
        this.size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < this.size; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < this.size; i++) {
            if (i!= 0) System.out.print(", ");
            System.out.print(this.array[i]);
        }
        System.out.print("]");
    }
}
