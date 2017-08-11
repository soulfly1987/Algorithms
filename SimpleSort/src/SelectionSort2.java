public class SelectionSort2 {
    private int[] arr;
    private int noElem;

    public SelectionSort2(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void selectionSort() {
        for (int out = 0; out < noElem; out++) {
            int min = arr[out];
            for (int in = out + 1; in < noElem; in++) {
                if (arr[in] < min) {
                    min = arr[in];
                }
            }
            swap(out, min);
        }
    }

    public void swap(int a, int b) {
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
