public class DoubleLinkedNode {
    int iData;
    DoubleLinkedNode next;
    DoubleLinkedNode previous;

    public DoubleLinkedNode(int iData) {
        this.iData = iData;
        next = null;
        previous = null;
    }

    public void displayNode() {
        System.out.println("iData: " + iData);
    }
}
