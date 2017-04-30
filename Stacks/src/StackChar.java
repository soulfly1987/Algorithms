public class StackChar {

    private int maxElem;
    private char[] stackArray;
    private int top;

    public StackChar(int maxElem) {
        this.maxElem = maxElem;
        stackArray = new char[maxElem];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxElem - 1;
    }

    public void push(char key) {
        stackArray[++top] = key;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
       return stackArray[top];
    }

}
