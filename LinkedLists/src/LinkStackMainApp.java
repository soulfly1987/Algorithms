import javax.xml.bind.SchemaOutputResolver;

public class LinkStackMainApp {
    public static void main(String[] args) {
        LinkStack stack = new LinkStack();
        stack.push(20);
        stack.push(40);

        System.out.println("Stack after 2 pushes: ");
        stack.displayStack();

        stack.push(60);
        stack.push(80);

        System.out.println("Stack after another 2 pushes: ");
        stack.displayStack();

        stack.pop();
        stack.pop();

        System.out.println("Stack after 2 pops: ");
        stack.displayStack();
    }

}
