/**
 * Created by Djole on 26.6.2017.
 */
public class HeapMainApp {
    public static void main(String[] args) {
        Heap heap = new Heap(31);

        heap.insert(70);
        heap.insert(40);
        heap.insert(50);
        heap.insert(20);
        heap.insert(60);
        heap.insert(100);
        heap.insert(80);
        heap.insert(30);
        heap.insert(10);
        heap.insert(90);

        System.out.println("Heap: ");
        heap.displayHeap();

        heap.insert(53);
        System.out.println();
        System.out.println("Heap after insertion: ");
        heap.displayHeap();

        heap.remove();
        System.out.println();
        System.out.println("Heap after removal: ");
        heap.displayHeap();


    }
}
