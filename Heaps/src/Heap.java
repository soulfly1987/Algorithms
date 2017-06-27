/**
 * Created by Djole on 26.6.2017.
 */
public class Heap {
    private Node[] heapArr;
    private int maxSize;
    private int currentSize;

    public Heap(int max) {
        this.maxSize = max;
        this.heapArr = new Node[maxSize];
        this.currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean insert(int key) {
        if (currentSize == maxSize)
            return false;
        Node newNode = new Node(key);
        heapArr[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    private void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = heapArr[index];

        while (index > 0 && heapArr[parent].getKey() < bottom.getKey()) {
            //Move it down
            heapArr[index] = heapArr[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArr[index] = bottom;
    }

    public Node remove() {
        Node root = heapArr[0];
        heapArr[0] = heapArr[--currentSize];
        trickleDown(0);
        return root;
    }

    private void trickleDown(int index) {
        int largerChild;

        //Save root
        Node top = heapArr[index];

        //While node has at least one child
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rifhtChild = 2 * index + 2;

            //Find larger child
            if (rifhtChild < currentSize && heapArr[leftChild].getKey() < heapArr[rifhtChild].getKey()) {
                largerChild = rifhtChild;
            } else {
                largerChild = leftChild;
            }

            //top>= largerChild?
            if (top.getKey() >= heapArr[largerChild].getKey())
                break;

            //Shift child up
            heapArr[index] = heapArr[largerChild];

            //Go down
            index = largerChild;
        }
        //Root to index
        heapArr[index] = top;
    }

    public boolean change(int index, int newValue) {

        if (index < 0 || index >= currentSize)
            return false;

        //Remember old
        int oldValue = heapArr[index].getKey();

        //Change to newValue
        heapArr[index].setKey(newValue);

        //If bigger trickle up, if not trickle down
        if (newValue > oldValue) {
            trickleUp(index);
        } else {
            trickleDown(index);
        }
        return true;
    }

    public void displayHeap() {

        for (int i = 0; i < currentSize; i++) {
            System.out.print(heapArr[i].getKey() + ", ");
        }
    }
}
