
/**
 * Created by Djole on 25.6.2017.
 */
public class BinarySearchTree {
    private TreeNode root;

    public void insert(Integer data) {
        if (root == null)
            root = new TreeNode(data);
        else
            root.insert(data);
    }

    public TreeNode find(Integer data) {
        if (root != null)
            return root.find(data);
        return null;
    }

    public void delete(Integer data) {
        TreeNode nodeToDelete = find(data);
        nodeToDelete.softDelete();
    }

    public Integer findMin() {
        if (this.root != null)
            return this.root.findMin();
        else
            return null;
    }

    public Integer findMax() {
        if (this.root != null)
            return this.root.findMax();
        else
            return null;
    }

    public void inOrderTraversal(TreeNode localRoot) {
        if (localRoot != null) {
            inOrderTraversal(localRoot.getLeftChild());
            localRoot.display();
            inOrderTraversal(localRoot.getRightChild());
        }
    }

    public void preOrderTraversal(TreeNode localRoot) {
        if (localRoot != null) {
            localRoot.display();
            preOrderTraversal(localRoot.getLeftChild());
            preOrderTraversal(localRoot.getRightChild());
        }
    }

    public void postOrderTaversal(TreeNode localRoot) {
        if (localRoot != null) {
            postOrderTaversal(localRoot.getLeftChild());
            postOrderTaversal(localRoot.getRightChild());
            localRoot.display();
        }
    }

    public TreeNode getRoot(){
        return this.root;
    }

//    public void delete(Integer data) {
//        TreeNode parent = this.root;
//        TreeNode current = this.root;
//        boolean isLeftChild = false;
//
//        if (root == null)
//            return;
//
//        while (current != null && current.getiData() != data) {
//            if (data < current.getiData()) {
//                parent = current;
//                current = current.getLeftChild();
//                isLeftChild = true;
//            } else {
//                parent = current;
//                current = current.getRightChild();
//                isLeftChild = false;
//            }
//        }
//
//        if (current == null)
//            return;
//
//        if (current.getLeftChild() == null && current.getRightChild() == null) { //Node is leaf node
//            if (current == root)
//                root = null;
//            else {
//                if (isLeftChild)
//                    parent.setLeftChild(null);
//                else
//                    parent.setRightChild(null);
//            }
//        } else if (current.getLeftChild() == null) { //Node has only right child
//            if (current == root) {
//                root = current.getRightChild();
//            } else if (isLeftChild) {
//                parent.setLeftChild(current.getRightChild());
//            } else {
//                parent.setRightChild(current.getRightChild());
//            }
//        } else if (current.getRightChild() == null) { //Node has only left child
//            if (current == root) {
//                root = current.getLeftChild();
//            } else if (isLeftChild) {
//                parent.setLeftChild(current.getLeftChild());
//            } else {
//                parent.setRightChild(current.getLeftChild());
//            }
//        }
//    }
}
