public class StackWordReverseMain {
    public static void main(String[] args) {

        String input = "proba";
        ReverseApp reverseApp = new ReverseApp(input);
        System.out.println("Word to reverse: " + input);

        System.out.println("Word after reverse: " + reverseApp.doReverse());
    }
}
