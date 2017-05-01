public class DoubleEndedLinkedList {
    Node first;
    Node last;

    public DoubleEndedLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iData, double dData) {
        Node newNode = new Node(iData, dData);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void insertLast(int iData, double dData) {
        Node newNode = new Node(iData, dData);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Node temp = first;
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
        Node current = this.first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
