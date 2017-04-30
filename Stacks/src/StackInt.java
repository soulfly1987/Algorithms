public class StackInt {

    private int maxElem;
    private int[] stackArray;
    private int top;

    public StackInt(int maxElem) {
        this.maxElem = maxElem;
        stackArray = new int[maxElem];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxElem - 1;
    }

    public void push(int key) {
        stackArray[++top] = key;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }
}
