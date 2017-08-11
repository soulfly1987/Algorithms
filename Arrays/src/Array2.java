public class Array2 {

    int[] arr;
    int noElem;

    public Array2(int max) {
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

    public void insert(int key) {
        arr[noElem] = key;
        noElem++;
    }

    public boolean delete(int key) {
        int i;
        for (i = 0; i < noElem; i++) {
            if (arr[i] == key)
                break;
        }

        if (i == noElem) {
            return false;
        } else {
            for (int j = i; j < noElem; j++) {
                arr[j] = arr[j + 1];
            }
            noElem--;
            return true;
        }
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
