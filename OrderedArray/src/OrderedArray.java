public class OrderedArray {
    private int[] arr;
    private int nElem;

    public OrderedArray(int max) {
        arr = new int[max];
        nElem = 0;
    }

    public boolean find(int searchKey) {
        int lowerBound = 0;
        int upperBound = nElem;
        int middle;

        while (true) {
            middle = (lowerBound + upperBound) / 2;
            if (arr[middle] == searchKey)
                return true;
            else if (searchKey > arr[middle])
                lowerBound = middle + 1;
            else if (searchKey < arr[middle])
                upperBound = middle - 1;
            else if (upperBound < middle)
                return false;
        }
    }

    public void insert(int key) {
        int j;
        for (j = 0; j < nElem; j++)
            if (arr[j] > key)
                break;
        if (j == nElem) {
            arr[nElem] = key;
            nElem++;
        } else {
            for (int k = nElem; k >= j; k--)
                arr[k + 1] = arr[k];
            arr[j] = key;
            nElem++;
        }
    }

    public boolean delete(int key) {
        int j;
        for (j = 0; j < nElem; j++)
            if (arr[j] == key)
                break;

        if (j == nElem)
            return false;
        else {
            for (int k = j; k < nElem; k++)
                arr[k] = arr[k + 1];
            nElem--;
            return true;
        }
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }

}
