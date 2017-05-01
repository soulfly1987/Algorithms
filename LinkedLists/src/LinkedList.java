public class LinkedList {

    public Node first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iData, double dData) {
        Node newNode = new Node(iData, dData);
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst() {
        Node temp = this.first;
        this.first = first.next;
        return temp;
    }

    public void displayList() {
        Node current = this.first;
        System.out.println("List: ");
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
