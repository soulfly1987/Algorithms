
public class QuickSort {

    private long[] arr;
    private int nElem;

    public QuickSort(int max) {
        this.arr = new long[max];
        nElem = 0;
    }

    public void insert(long value) {
        this.arr[nElem] = value;
        nElem++;
    }

    public void display() {
        for (long e : arr) {
            System.out.print(e + ", ");
        }
    }

    public void quickSort() {
        recusriceQuickSort(0, nElem - 1);
    }

    private void recusriceQuickSort(int start, int end) {
        if (start >= end)
            return;
        else {
            int partition = doPartition(arr, start, end);
            recusriceQuickSort(start, partition - 1);
            recusriceQuickSort(partition + 1, end);
        }
    }

    private int doPartition(long[] arr, int start, int end) {
        long pivot = arr[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= pivot) {
                swap(i, j);
                i++;
            }
        }
        swap(i, end);
        return i;
    }

    private void swap(int a, int b) {
        long tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }


    public static void main(String[] args) {
        int max = 10;
        QuickSort quickSort = new QuickSort(max);

        for (int i = 0; i < max; i++) {
            quickSort.insert((long) (Math.random() * 99));
        }

        System.out.println("Before sort: ");
        quickSort.display();

        quickSort.quickSort();
        System.out.println();
        System.out.println("After sort: ");
        quickSort.display();
    }
}
