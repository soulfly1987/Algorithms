/**
 * Created by Djole on 26.6.2017.
 */
public class HeapSortMainApp {
    public static void main(String[] args) {
        int size = 10;
        Heap heap = new Heap(size);
        int[] newArr = new int[size];

        System.out.println("Random numbers: ");
        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random() * 99);
            System.out.print(random + ", ");
            Node newNode = new Node(random);
            heap.insert(newNode.getKey());
        }

        System.out.println();
        System.out.println("Heap: ");
        heap.displayHeap();

        System.out.println();
        System.out.println("Ordered: ");
        for (int i = 0; i < size; i++) {
            int number = heap.remove().getKey();
            newArr[size-1-i] = number;
            System.out.print(number + ", ");
        }

        System.out.println();
        System.out.println("Ordered ascending: ");
        for (int e : newArr) {
            System.out.print(e + ", ");
        }
    }
}
