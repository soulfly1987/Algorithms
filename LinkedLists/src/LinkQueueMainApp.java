public class LinkQueueMainApp {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();

        queue.inset(20);
        queue.inset(40);

        System.out.println("Queue after two inserts: ");
        queue.displayQueue();

        queue.inset(60);
        queue.inset(80);

        System.out.println("Queue after another two inserts: ");
        queue.displayQueue();

        queue.remove();
        queue.remove();


        System.out.println("Queue after two removes: ");
        queue.displayQueue();

    }

}
