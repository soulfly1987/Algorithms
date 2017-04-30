

public class Array {
    private int[] arr;
    private int nElem;

    public Array(int max) {
        arr = new int[max];
        nElem = 0;
    }

    public boolean find(int searchKey) {
        int j;
        for (j = 0; j < nElem; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        if (j == nElem)
            return false;
        else
            return true;
    }

    public void insert(int searchKey) {
        arr[nElem] = searchKey;
        nElem++;
    }

    public boolean delete(int searchKey) {
        int j;
        for (j = 0; j < nElem; j++) {
            if (arr[j] == searchKey)
                break;
        }
        if (j == nElem)
            return false;
        else {
            for (int k = j; k < nElem; k++) {
                arr[k] = arr[k + 1];
            }
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
