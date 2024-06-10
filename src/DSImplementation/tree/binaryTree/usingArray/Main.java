package DSImplementation.tree.binaryTree.usingArray;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(9);

        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");

        System.out.print("PreOrder Traversal : ");
        bt.preOrder(1);

        System.out.println();

        System.out.print("InOrder Traversal : ");
        bt.inOrder(1);

        System.out.println();

        System.out.print("PostOrder Traversal : ");
        bt.postOrder(1);

        System.out.println();

        System.out.print("LevelOrder Traversal : ");
        bt.levelOrder();

        bt.search("N5");
        bt.search("N10");

        bt.insert("N10");

        bt.levelOrder();

        bt.delete("N5");

        bt.levelOrder();

        bt.deleteBinaryTree();

    }

}
