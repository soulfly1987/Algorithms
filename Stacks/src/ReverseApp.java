public class ReverseApp {

    private String input, output;
    private StackChar stack;

    public ReverseApp(String input) {
        this.input = input;
        stack = new StackChar(input.length());

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
        }

        output = "";
    }

    public String doReverse() {
        while (!stack.isEmpty()) {
            output += stack.pop();
        }
        return output;
    }
}