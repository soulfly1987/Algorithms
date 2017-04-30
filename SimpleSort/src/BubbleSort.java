public class BubbleSort {

    private int[] arr;
    private int noElem;

    public BubbleSort(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void bubbleSort() {
        int in, out;
        for (out = noElem - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1])
                    swap(in, (in + 1));
            }
        }
    }

    private void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
