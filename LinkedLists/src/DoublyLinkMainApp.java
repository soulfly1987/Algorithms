public class DoublyLinkMainApp {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        System.out.println("List after three inserts from the front: ");
        list.displayForeward();

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        System.out.println("List after three inserts from the back: ");
        list.displayForeward();

        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(11);

        System.out.println("List after one delete from front, one from the end and one with key 11: ");
        list.displayForeward();

        list.insertAfter(22, 77);
        list.insertAfter(33, 88);

        System.out.println("List after two adds at keys 22 and 33: ");
        list.displayForeward();

        System.out.println("List printed backward: ");
        list.displayForeward();
    }
}
