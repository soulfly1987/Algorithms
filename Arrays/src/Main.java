public class Main {

    public static void main(String[] args) {
        Array a = new Array(6);
        a.insert(5);
        a.insert(4);
        a.insert(4);
        a.insert(989);

        System.out.println("Array:");
        a.display();

        a.insert(1000);

        System.out.println("Array after insertion:");
        a.display();

        a.delete(989);
        a.delete(4);

        System.out.println("Array after deletition:");
        a.display();
    }
}
