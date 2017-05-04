import java.util.Random;

public class SortedListMainApp {

    public static void main(String[] args) {
        SortedList list = new SortedList();

        list.insert(20);
        list.insert(40);

        System.out.println("List after two inserts: ");
        list.displyList();

        list.insert(10);
        list.insert(30);
        list.insert(50);

        System.out.println("List after another two inserts: ");
        list.displyList();

        list.remove();

        System.out.println("List after one remove action: ");
        list.displyList();


        System.out.println("=========================================");

        System.out.println("Random list: ");
        SimpleNode[] nodeList = new SimpleNode[15];
        for (int i = 0; i < 15; i++) {
            int key = (int) (Math.random()*99);
            System.out.print(key + ", ");
            SimpleNode node = new SimpleNode(key);
            nodeList[i] = node;
        }

        SortedList list1 = new SortedList(nodeList);

        System.out.println("\nSorted list: ");
        list1.displyList();
    }
}
