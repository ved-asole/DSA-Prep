package DSImplementation.tree.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    BinaryNode root;

    // Time Complexity = O(1) and Space Complexity = O(1)
    public BinarySearchTree() {
        this.root = null;
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public BinaryNode insert(BinaryNode currentNode, int value) {
        if(currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value has been successfully inserted!");
            return newNode;
        } else if (value <= currentNode.value){
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public void insert(int value){
        this.root = insert(root, value);
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void preOrder(BinaryNode node){
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void inOrder(BinaryNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void postOrder(BinaryNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if(currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
        System.out.println();
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public void search(BinaryNode node, int value) {
        if(node == null) {
            System.out.println("Value " + value + " not found in the BST");
            return;
        } else if (node.value == value) {
            System.out.println("Value " + value + " found in the BST");
        } else if (value < node.value) {
            search(node.left, value);
        } else {
            search(node.right, value);
        }
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) return root;
        else return minimumNode(root.left);
    }

    // Time Complexity = O(logN) and Space Complexity = O(logN)
    public BinaryNode delete(BinaryNode root, int value) {
        if(root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.value) root.left = delete(root.left, value);
        else if (value > root.value) root.right = delete(root.right, value);
        else {
          if(root.left != null && root.right != null) {
              BinaryNode temp = root;
              BinaryNode minimumRightNode = minimumNode(temp.right);
              root.value = minimumRightNode.value;
              root.right = delete(root.right, minimumRightNode.value);
          } else if (root.left != null) {
              root = root.left;
          } else if (root.right != null) {
              root = root.right;
          } else {
              root = null;
          }
        }
        return root;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void deleteBST() {
        this.root = null;
        System.out.println("BST has been deleted!");
    }
}