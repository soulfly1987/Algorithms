public class DoubleEndedLinkedList {
    SimpleNode first;
    SimpleNode last;

    public DoubleEndedLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iData) {
        SimpleNode newNode = new SimpleNode(iData);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void insertLast(int iData) {
        SimpleNode newNode = new SimpleNode(iData);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public SimpleNode deleteFirst() {
        if (isEmpty()) {
            return null;
        } else {
            SimpleNode temp = first;
            if (first.next == null) {
                first = null;
                last = null;
                return temp;
            } else {
                first = first.next;
                return temp;
            }
        }
    }

    public void displayList() {
        SimpleNode current = this.first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
