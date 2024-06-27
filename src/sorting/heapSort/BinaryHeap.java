package sorting.heapSort;

public class BinaryHeap {

    int[] arr;
    int sizeOfTree;

    // Time Complexity = O(1) and Space Complexity = O(N)
    public BinaryHeap(int size) {
        arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.format("BinaryHeap of size %d is created%n", size);
    }

    public boolean isEmpty(){
        return sizeOfTree == 0;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public Integer peek() {
        if(isEmpty()) {
            System.out.println("Binary Heap is Empty!");
            return null;
        }
        return arr[1];
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int sizeOfBH() {
        return sizeOfTree;
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Root Node -> Left Subtree -> Right Subtree
    public void preOrder(int index){
        if(index > sizeOfTree) return;
        else {
            System.out.print(arr[index] + " ");
            preOrder(index*2);
            preOrder(index*2 + 1);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Left Subtree -> Root Node -> Right Subtree
    public void inOrder(int index) {
        if(index > sizeOfTree) return;
        else {
            inOrder(index*2);
            System.out.print(arr[index] + " ");
            inOrder(index*2 + 1);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Left Subtree -> Right Subtree -> Root Node
    public void postOrder(int index) {
        if(index > sizeOfTree) return;
        else {
            postOrder(index*2);
            postOrder(index*2 + 1);
            System.out.print(arr[index] + " ");
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Level by Level all nodes
    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index/2;
        if(index <= 1) return;
        if(heapType.equals("Min")) {
            if(arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if(heapType.equals("Max")) {
            if(arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    // always use level order search
    public void insert(int value, String heapType) {
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, heapType);
        System.out.format("The value of %s has been inserted in Heap%n", value);
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index*2;
        int right = (index*2) + 1;
        int swapChild = 0;
        if(sizeOfTree < left) return;

        if(heapType.equals("Max")) {
            if (sizeOfTree == left) {
                if(arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
              if (arr[left] > arr[right]){
                  swapChild = left;
              } else {
                  swapChild = right;
              }
              if(arr[index] > arr[swapChild]) {
                  int temp = arr[index];
                  arr[index] = arr[swapChild];
                  arr[swapChild] = temp;
              }
            }
        } else if(heapType.equals("Min")) {
            if (sizeOfTree == left) {
                if(arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] < arr[right]){
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if(arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public int extractHeadOfBH(String heapType) {
        if(isEmpty()) return -1;
        else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void deleteBH() {
        arr=null;
        System.out.println("Binary Heap has been successfully deleted");
    }

}
