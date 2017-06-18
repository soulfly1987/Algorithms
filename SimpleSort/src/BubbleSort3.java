public class BubbleSort3 {

    private int[] arr;
    private int noElem;

    public BubbleSort3(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void bubbleSort() {
        int out, in;
        for (out = 0; out < arr.length - 1; out++) {
            for (in = 0; in < arr.length - 1 - out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
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
