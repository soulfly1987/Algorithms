public class Queue {

    private int[] queArray;
    private int maxSize;
    private int noElem;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        noElem = 0;
        front = 0;
        rear = -1;
    }

    public void insert(int key) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = key;
        noElem++;
    }

    public int remove() {
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        noElem--;
        return temp;
    }

    public int peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return noElem == 0;
    }

    public boolean isFull() {
        return noElem == maxSize;
    }

    public int size() {
        return noElem;
    }
}
