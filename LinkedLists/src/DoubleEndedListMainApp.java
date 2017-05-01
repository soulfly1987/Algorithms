public class DoubleEndedListMainApp {
    public static void main(String[] args) {
        DoubleEndedLinkedList list = new DoubleEndedLinkedList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        System.out.println("Double ended list: ");
        list.displayList();

        System.out.println("Double ended list with deleted first node: ");
        list.deleteFirst();
        list.deleteFirst();
        list.displayList();
    }
}
