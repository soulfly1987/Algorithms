public class PriorityQueue {

    private int[] queArr;
    private int maxSize;
    private int noElem;

    // array is ordered in the following way. Min priority at index 0, and max at index maxSize-1

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queArr = new int[maxSize];
        noElem = 0;
    }

    public void insert(int key) {
        int j;
        if (noElem == 0) {
            queArr[noElem++] = key;
        } else {
            for (j = noElem - 1; j >= 0; j--) {
                if (key > queArr[j]) {
                    queArr[j + 1] = queArr[j];
                } else {
                    break;
                }
            }
            queArr[j + 1] = key;
            noElem++;
        }
    }

    public int remove() {
        return queArr[--noElem];
    }

    public int peekMin() {
        return queArr[noElem - 1];
    }

    public boolean isEmpty() {
        return noElem == 0;
    }

    public boolean isFull() {
        return noElem == maxSize;
    }
}
