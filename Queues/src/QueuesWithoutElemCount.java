public class QueuesWithoutElemCount {

    private int[] queueArr;
    private int maxSize;
    private int front;
    private int rear;

    public QueuesWithoutElemCount(int maxSize) {
        this.maxSize = maxSize;
        this.queueArr = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(int key) {
        if (rear == maxSize - 1)
            rear = -1;
        queueArr[++rear] = key;
    }

    public int remove() {
        int temp = queueArr[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public int peek() {
        return queueArr[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front && (front + maxSize - 1 == rear) && queueArr[front]==0);
    }

    public boolean isFull() {
        return (rear + 2 == front && (front + maxSize - 2 == rear));
    }

    public int size() {
        if (rear > front) {
            return rear - front + 1;
        } else
            return maxSize - front + rear + 1;
    }
}

