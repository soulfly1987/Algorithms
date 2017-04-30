public class InsertionSort2 {

    private int[] arr;
    int noElem;

    public InsertionSort2(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void insertionSort() {

        for (int out = 1; out < noElem; out++) {
            int temp = arr[out];
            int in;
            for (in = out; in > 0; in--) {
                if (arr[in - 1] > temp) {
                    arr[in] = arr[in - 1];
                } else {
                    break;
                }
            }
            arr[in] = temp;
        }
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
