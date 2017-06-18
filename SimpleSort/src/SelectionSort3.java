public class SelectionSort3 {
    private int[] arr;
    private int noElem;

    public SelectionSort3(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void selectionSort() {
        for (int out = 0; out < arr.length; out++) {
            int minIndex = out;
            for (int in = out + 1; in < arr.length; in++) {
                if (arr[minIndex] > arr[in]) {
                    minIndex = in;
                }
            }
            swap(out, minIndex);
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
