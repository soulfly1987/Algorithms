public class StackBracketsAppMain {
    public static void main(String[] args) {
        
        String input = "(a{[b])";

        System.out.println("Statement to test: " + input);

        BracketsApp bracketsApp = new BracketsApp(input);

        System.out.println("The statement is OK: " + bracketsApp.doCheck());
    }

}
