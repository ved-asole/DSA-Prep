package DSImplementation.tree.binarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

        System.out.println("Root : " + bst.root.value);

        System.out.print("PreOrder Traversal : ");
        bst.preOrder(bst.root);

        System.out.println();

        System.out.print("InOrder Traversal : ");
        bst.inOrder(bst.root);

        System.out.println();

        System.out.print("PostOrder Traversal : ");
        bst.postOrder(bst.root);

        System.out.println();

        System.out.print("LevelOrder Traversal : ");
        bst.levelOrder();

        bst.search(bst.root,30);
        bst.search(bst.root,120);

        bst.insert(160);

        bst.levelOrder();

        bst.delete(bst.root, 70);

        bst.levelOrder();

        bst.deleteBST();

    }

}
