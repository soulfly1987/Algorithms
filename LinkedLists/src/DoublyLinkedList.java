public class DoublyLinkedList {
    private DoubleLinkedNode first;
    private DoubleLinkedNode last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iData) {
        DoubleLinkedNode node = new DoubleLinkedNode(iData);

        if (isEmpty()) {
            last = node;
        } else {
            first.previous = node;
        }
        node.next = first;
        first = node;
    }

    public void insertLast(int iData) {
        DoubleLinkedNode node = new DoubleLinkedNode(iData);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
            node.previous = last;
        }
        last = node;
    }

    public DoubleLinkedNode deleteFirst() {
        DoubleLinkedNode temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public DoubleLinkedNode deleteLast() {
        DoubleLinkedNode temp = last;

        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int iData) {
        DoubleLinkedNode current = first;
        while (current.iData != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        DoubleLinkedNode node = new DoubleLinkedNode(iData);

        if (current == last) {
            node.next = null;
            last = node;
        } else {
            node.next = current.next;
            current.next.previous = node;
        }
        node.previous = current;
        current.next = node;
        return true;
    }

    public DoubleLinkedNode deleteKey(int key) {
        DoubleLinkedNode current = first;
        while (current.iData != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForeward() {
        System.out.println("First -> Last: ");
        DoubleLinkedNode current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public void displayBackward() {
        System.out.println("Last -> First: ");
        DoubleLinkedNode current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
    }
}

