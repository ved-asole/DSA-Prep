package DSImplementation.tree.binaryTree.usingArray;

import DSImplementation.array.DynamicArray.Array;
import DSImplementation.tree.binaryTree.usingLinkedList.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    String[] arr;
    int lastUsedIndex;

    // Time Complexity = O(1) and Space Complexity = O(1)
    public BinaryTree(int size) {
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.format("BinaryHeap of size %d is created!%n", size);
    }

    public boolean isFull(){
        return arr.length-1 == lastUsedIndex;
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // always use level order search
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.format("The value of %s has been inserted %n", value);
        } else {
            System.out.println("The Binary Tree is Full");
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Root Node -> Left Subtree -> Right Subtree
    public void preOrder(int index){
        if(index > lastUsedIndex) return;
        else {
            System.out.print(arr[index] + " ");
            preOrder(index*2);
            preOrder(index*2 + 1);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Left Subtree -> Root Node -> Right Subtree
    public void inOrder(int index) {
        if(index > lastUsedIndex) return;
        else {
            inOrder(index*2);
            System.out.print(arr[index] + " ");
            inOrder(index*2 + 1);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Left Subtree -> Right Subtree -> Root Node
    public void postOrder(int index) {
        if(index > lastUsedIndex) return;
        else {
            postOrder(index*2);
            postOrder(index*2 + 1);
            System.out.print(arr[index] + " ");
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Level by Level all nodes
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // always use level order search
    public int search(String value) {
        for (int i = 0; i <= lastUsedIndex; i++) {
            if(arr[i] == value) {
                System.out.println(value + " exists at location : " + i);
                return i;
            }
        }
        System.out.println("Value does not exist in Binary Tree!");
        return -1;
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // always use level order search
    public void delete(String value) {
        int index = search(value);
        if(index!=-1) {
            arr[index] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Node has been successfully deleted");
        }
    }

    public void deleteBinaryTree() {
        arr=null;
        System.out.println("Binary Tree has been successfully deleted");
    }

}
