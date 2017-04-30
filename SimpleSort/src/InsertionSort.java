public class InsertionSort {

    private int[] arr;
    private int noElem;

    public InsertionSort(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public void insertionSort() {
        int temp;
        for (int out = 1; out < noElem; out++) {
            temp = arr[out];
//            int in = out;
//            while (in > 0 && arr[in - 1] > temp) {
//                arr[in] = arr[in - 1];
//                --in;
//            }
//            arr[in] = temp;
            int in;
            for (in = out; in > 0; in--) {
                if (arr[in - 1] > temp) {
                    arr[in] = arr[in - 1];
                } else break;
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
