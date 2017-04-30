public class MainApp {

    public static void main(String[] args) {

//        String flag = "BUBBLE";
//        String flag = "SELECTION";
        String flag = "INSERTION";

        switch (flag) {

            case "BUBBLE": {
                //Bubble sort
                BubbleSort bubbleSort = new BubbleSort(5);

                bubbleSort.insert(22);
                bubbleSort.insert(4);
                bubbleSort.insert(1);
                bubbleSort.insert(5);

                System.out.println("Pre " + flag + " sortiranja: ");
                bubbleSort.display();

                System.out.println("Posle " + flag + " sortiranja: ");
                bubbleSort.bubbleSort();
                bubbleSort.display();
                break;
            }

            case "SELECTION": {
                //Selection sort
                SelectionSort selectionSort = new SelectionSort(5);

                selectionSort.insert(22);
                selectionSort.insert(4);
                selectionSort.insert(1);
                selectionSort.insert(5);

                System.out.println("Pre " + flag + " sortiranja: ");
                selectionSort.display();

                System.out.println("Posle " + flag + " sortiranja: ");
                selectionSort.selectionSort();
                selectionSort.display();
                break;
            }

            case "INSERTION": {
                //Insertion sort
                InsertionSort insertionSort = new InsertionSort(5);

                insertionSort.insert(22);
                insertionSort.insert(4);
                insertionSort.insert(1);
                insertionSort.insert(5);

                System.out.println("Pre " + flag + " sortiranja: ");
                insertionSort.display();

                System.out.println("Posle " + flag + " sortiranja: ");
                insertionSort.insertionSort();
                insertionSort.display();
                break;
            }
        }
    }
}
