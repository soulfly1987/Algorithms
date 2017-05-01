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

    public Node find(int key) {
        Node current = this.first;

        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Node delete(int key) {
        Node current = first;
        Node previous;

        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous = current.next;
        }
        return current;
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
