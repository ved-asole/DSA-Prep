package DSImplementation.tree.avlTree;

public class Main {

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();

        avl.insert(70);
        avl.insert(50);
        avl.insert(90);
        avl.insert(30);
        avl.insert(60);
        avl.insert(80);
        avl.insert(100);
        avl.insert(20);
        avl.insert(40);

        System.out.println("Root : " + avl.root.value);

        System.out.print("PreOrder Traversal : ");
        avl.preOrder(avl.root);

        System.out.println();

        System.out.print("InOrder Traversal : ");
        avl.inOrder(avl.root);

        System.out.println();

        System.out.print("PostOrder Traversal : ");
        avl.postOrder(avl.root);

        System.out.println();

        System.out.print("LevelOrder Traversal : ");
        avl.levelOrder();

        avl.search(avl.root,30);
        avl.search(avl.root,120);

        avl.insert(160);

        System.out.print("LevelOrder Traversal : ");
        avl.levelOrder();

        avl.delete(70);

        System.out.print("LevelOrder Traversal : ");
        avl.levelOrder();

        avl.deleteAVLTree();
    }
}