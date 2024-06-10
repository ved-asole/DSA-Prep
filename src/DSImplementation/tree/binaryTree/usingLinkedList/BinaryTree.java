package DSImplementation.tree.binaryTree.usingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    BinaryNode root;

    // Time Complexity = O(1) and Space Complexity = O(1)
    public BinaryTree() {
        this.root = null;
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Root Node -> Left Subtree -> Right Subtree
    public void preOrder(BinaryNode node){
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Left Subtree -> Root Node -> Right Subtree
    public void inOrder(BinaryNode node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Left Subtree -> Right Subtree -> Root Node
    public void postOrder(BinaryNode node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // Level by Level all nodes
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if(currentNode.left != null) queue.add(currentNode.left);
            if(currentNode.right != null) queue.add(currentNode.right);
        }
        System.out.println();
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // always use level order search
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if(currentNode.value == value) {
                System.out.format("The value %s is found!%n", value);
                return;
            } else {
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
        }
        System.out.format("The value %s is not found! %n", value);
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // always use level order search
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null) {
            root = newNode;
            System.out.println("Inserted new node to the Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.left == null) {
                currentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (currentNode.right == null) {
                currentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            } else {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = null;
        while(!queue.isEmpty()) {
            currentNode = queue.remove();
            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return currentNode;
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode prevNode, currentNode = null;
        while (!queue.isEmpty()) {
            prevNode = currentNode;
            currentNode = queue.remove();
            if(currentNode.left == null) {
                prevNode.right = null;
                return;
            }
            if(currentNode.right == null) {
                currentNode.left = null;
                return;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);
        }
    }

    // Time Complexity = O(N) and Space Complexity = O(N)
    // always use level order search
    public void delete(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if(currentNode.value == value) {
                currentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.format("The value %s has been deleted!%n", value);
                return;
            } else {
                BinaryNode leftNode = currentNode.left;
                if(leftNode != null) queue.add(leftNode);
                BinaryNode rightNode = currentNode.right;
                if(rightNode != null) queue.add(rightNode);
            }
        }
        System.out.format("The value %s is not found in Binary Tree! %n", value);
    }

    public void deleteBinaryTree() {
        this.root = null;
        System.out.println("Binary Tree has been successfully deleted!");
    }

}
