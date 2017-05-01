public class SimpleLinkedList {

    public SimpleNode first;

    public SimpleLinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iData) {
        SimpleNode newNode = new SimpleNode(iData);
        newNode.next = first;
        first = newNode;
    }

    public SimpleNode find(int key) {
        SimpleNode current = this.first;

        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public SimpleNode delete(int key) {
        SimpleNode current = first;
        SimpleNode previous;

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

    public SimpleNode deleteFirst() {
        SimpleNode temp = this.first;
        this.first = first.next;
        return temp;
    }

    public void displayList() {
        SimpleNode current = this.first;
        System.out.println("List: ");
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}