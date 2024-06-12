package DSImplementation.tree.avlTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {

    BinaryNode root;

    // Time Complexity = O(1) and Space Complexity = O(1)
    public AVLTree() {
        this.root = null;
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
            System.out.println("Value " + value + " not found in the AVL");
            return;
        } else if (node.value == value) {
            System.out.println("Value " + value + " found in the AVL");
        } else if (value < node.value) {
            search(node.left, value);
        } else {
            search(node.right, value);
        }
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int getHeight(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int getBalance(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {
            return getHeight(node.left) - getHeight(node.right);
        }
    }

    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value){
            node.left = insertNode(node.left, nodeValue);
        } else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        // Left-Left Case
        if(balance > 1 && nodeValue < node.left.value) {
            rotateRight(node);
        }
        // Left-Right Case
        if (balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            rotateRight(node);
        }
        // Right-Right Case
        if (balance < -1 && nodeValue > node.right.value) {
            rotateLeft(node);
        }
        // Right-Left Case
        if (balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            rotateLeft(node);
        }
        return node;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private BinaryNode minimumNode(BinaryNode root) {
        if(root.left == null) {
            return root;
        }
        return minimumNode(root.left);
    }

    private BinaryNode deleteNode(BinaryNode node, int value) {
        if(node == null) {
            System.out.println("Value not found in AVL");
            return node;
        }
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if(node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeFromRight = minimumNode(temp.right);
                node.value = minNodeFromRight.value;
                node.right = deleteNode(node.right, minNodeFromRight.value);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null){
                node = node.right;
            } else {
                node = null;
            }
        }

        int balance = getBalance(node);

        // Left-Left Case
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }
        // Left-Right Case
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        // Right-Right Case
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }
        // Right-Left Case
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    public void deleteAVLTree() {
        this.root = null;
        System.out.println("AVL Tree has been deleted successfully!");
    }

}