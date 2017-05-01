public class SimpleNode {
    public int iData;
    public SimpleNode next;

    public SimpleNode(int iData) {
        this.iData = iData;
    }

    public void displayNode() {
        System.out.println("(" + iData + ")");
    }
}