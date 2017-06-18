public class InsertionSort3 {

    private int[] arr;
    private int noElem;

    public InsertionSort3(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void insertionSort() {
        for (int out = 1; out < arr.length; out++) {
            int current = arr[out];
            int in = out - 1;
            while (in >= 0 && arr[in] > current) {
                arr[in + 1] = arr[in];
                in--;
            }
            arr[in + 1] = current;
        }
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
