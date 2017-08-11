public class OrderedArray2 {

    private int[] arr;
    private int noElem;

    public OrderedArray2(int max) {
        arr = new int[max];
        noElem = 0;
    }

    public boolean find(int key) {
        for (int e : arr) {
            if (e == key)
                return true;
        }
        return false;
    }

    public boolean findUsingBinarySearch(int key) {
        int first = 0;
        int middle;
        int last = noElem;
        while (true) {
            middle = (first + last) / 2;
            if (arr[middle] == key)
                return true;
            else if (arr[middle] > key)
                last = middle - 1;
            else if (arr[middle] < key)
                first = middle + 1;
            if (last < first)
                return false;
        }
    }

    public void insert(int key) {
        int i;
        for (i = 0; i < noElem; i++) {
            if (key <= arr[i])
                break;
        }

        for (int k = noElem; k > i; k--) {
            arr[k] = arr[k - 1];
        }
        arr[i] = key;
        noElem++;
    }

    public boolean delete(int key) {
        if (findUsingBinarySearch(key)) {
            int i;
            for (i = 0; i < noElem; i++) {
                if (arr[i] == key)
                    break;
            }

            for (int j = i; j < noElem; j++) {
                arr[j] = arr[j + 1];
            }

            noElem--;
            return true;
        } else
            return false;
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }

}
