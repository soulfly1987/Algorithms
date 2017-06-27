import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Djole on 25.6.2017.
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(52);
        tree.insert(33);
        tree.insert(65);
        tree.insert(60);
        tree.insert(78);
        tree.insert(25);
        tree.insert(39);
        tree.insert(12);
        tree.insert(27);
        tree.insert(34);
        tree.insert(48);
        tree.insert(72);
        tree.insert(70);
        tree.insert(90);

        System.out.println("Tree root: " + tree.getRoot().getiData());
        System.out.println("In order traversal: ");
        tree.inOrderTraversal(tree.getRoot());

        System.out.println();
        System.out.println("Pre order traversal: ");
        tree.preOrderTraversal(tree.getRoot());

        System.out.println();
        System.out.println("Post order traversal: ");
        tree.postOrderTaversal(tree.getRoot());


        tree.insert(1000);
        System.out.println();
        System.out.println("Insert 1000: ");
        tree.inOrderTraversal(tree.getRoot());

        tree.insert(0);
        System.out.println();
        System.out.println("Insert 0: ");
        tree.inOrderTraversal(tree.getRoot());

        System.out.println();
        System.out.println("Maximum: " + tree.findMax());
        System.out.println("Minimum: " + tree.findMin());

        tree.delete(0);
        System.out.println("Find 0 (deleted): " + tree.find(0));
        System.out.println("Find minimum (0 is deleted): " + tree.findMin());




    }
}