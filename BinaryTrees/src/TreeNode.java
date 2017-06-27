/**
 * Created by Djole on 25.6.2017.
 */
public class TreeNode {
    private Integer iData;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    public TreeNode(int iData) {
        this.iData = iData;
    }

    public TreeNode find(Integer data) {
        if (data == this.iData && !this.isDeleted)
            return this;
        if (data < this.iData && leftChild != null)
            return leftChild.find(data);
        if (rightChild != null)
            return rightChild.find(data);
        return null;
    }

    public Integer findMin() {
        if (this.leftChild == null) {
            return this.iData;
        } else {
            return this.leftChild.findMin();
        }
    }


    public Integer findMax() {
        if (this.rightChild == null) {
            return this.iData;
        } else {
            return this.rightChild.findMax();
        }
    }

    public void insert(Integer data) {
        TreeNode newNode = new TreeNode(data);
        if (data >= this.iData) {
            if (this.rightChild == null)
                this.rightChild = newNode;
            else
                rightChild.insert(data);
        } else {
            if (this.leftChild == null)
                this.leftChild = newNode;
            else
                leftChild.insert(data);
        }
    }

    public void softDelete() {
        this.isDeleted = true;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public int getiData() {
        return iData;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }


    public void display() {
        System.out.print(this.iData + ", ");
    }
}
