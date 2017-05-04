public class SortedList {

    private SimpleNode first;

    public SortedList() {
        first = null;
    }

    public SortedList(SimpleNode[] array) {
        for (SimpleNode simpleNode : array) {
            insert(simpleNode.iData);
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int key) {

        SimpleNode node = new SimpleNode(key);
        SimpleNode previous = null;
        SimpleNode current = first;

        while (current != null && node.iData> current.iData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = node;
        } else {
            previous.next = node;
        }
        node.next = current;
    }

    public SimpleNode remove() {
        SimpleNode temp = first;
        first = first.next;
        return temp;
    }

    public void displyList() {
        SimpleNode current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }

    }
}
