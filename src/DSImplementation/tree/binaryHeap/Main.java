package DSImplementation.tree.binaryHeap;

public class Main {

    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(9);

        bh.insert(10, "Min");
        bh.insert(5, "Min");
        bh.insert(1, "Min");
        bh.insert(20, "Min");
        bh.insert(2, "Min");
        bh.insert(30, "Min");

        System.out.println("Peeked value : " + bh.peek());
        System.out.println("Size of Heap : " + bh.sizeOfBH());

        System.out.print("PreOrder Traversal : ");
        bh.preOrder(1);

        System.out.println();

        System.out.print("InOrder Traversal : ");
        bh.inOrder(1);

        System.out.println();

        System.out.print("PostOrder Traversal : ");
        bh.postOrder(1);

        System.out.println();

        System.out.print("LevelOrder Traversal : ");
        bh.levelOrder();

        System.out.println("Head of Binary Heap : " + bh.extractHeadOfBH("Min"));

//        bh.insert("N10");

//        bh.levelOrder();

//        bh.delete("N5");

        System.out.print("LevelOrder Traversal : ");
        bh.levelOrder();

        bh.deleteBH();

    }

}
