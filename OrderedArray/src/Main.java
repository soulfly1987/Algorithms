public class Main {

    public static void main(String[] args) {
        OrderedArray oa = new OrderedArray(6);

        System.out.println("Empty ordered array:");
        oa.display();

        System.out.println("Ordered array with inserted elements:");
        oa.insert(6);
        oa.insert(4);
        oa.insert(46);
        oa.insert(1);
        oa.display();

        System.out.println("Ordered array after deleted element:");
        oa.delete(4);
        oa.display();
    }
}
