import java.util.Stack;

public class BracketsApp {

    private String input;
    private StackChar stack;

    public BracketsApp(String input) {
        this.input = input;
        stack = new StackChar(input.length());
    }

    public boolean doCheck() {

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')': {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        System.out.println("Error at char with index: " + i);
                        return false;
                    } else
                        break;
                }
                case ']': {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        System.out.println("Error at char with index: " + i);
                        return false;
                    } else
                        break;
                }
                case '}': {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        System.out.println("Error at char with index: " + i);
                        return false;
                    } else break;
                }
                default:
                    ;
            }
        }
        if (!stack.isEmpty())
            return false;
        else
            return true;

    }
}
