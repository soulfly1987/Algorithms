public class LinkedListMainApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertFirst(1, 22.9);
        linkedList.insertFirst(45, 26.4);
        linkedList.insertFirst(3, 12.2);

        System.out.println("Display list: ");
        linkedList.displayList();

        System.out.println("Delete all nodes one by one: ");
        while (!linkedList.isEmpty()) {
            Node current = linkedList.first;
            current.displayNode();
            linkedList.deleteFirst();
        }

        System.out.println("List should be empty: ");
        linkedList.displayList();
    }
}
