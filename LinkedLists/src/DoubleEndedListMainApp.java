public class DoubleEndedListMainApp {
    public static void main(String[] args) {
        DoubleEndedLinkedList list = new DoubleEndedLinkedList();

        list.insertFirst(22, 1.1);
        list.insertFirst(44, 1.2);
        list.insertFirst(66, 1.3);

        list.insertLast(11, 1.4);
        list.insertLast(33, 1.5);
        list.insertLast(55, 1.6);

        System.out.println("Double ended list: ");
        list.displayList();

        System.out.println("Double ended list with deleted first node: ");
        list.deleteFirst();
        list.deleteFirst();
        list.displayList();
    }
}
