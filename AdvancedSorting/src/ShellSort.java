
public class ShellSort {
    private long[] arr;
    private int nElem;

    public ShellSort(int maxNumOfElem) {
        arr = new long[maxNumOfElem];
        nElem = 0;
    }

    public void insert(long value) {
        arr[nElem] = value;
        nElem++;
    }

    public void display() {
        for (long element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public void shellSort() {
        int inner, outer;
        long temp;

        //find initial value of h
        int h = 1;
        while (h <= nElem / 3)
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)

        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < nElem; outer++) {
                temp = arr[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner = inner - h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3; // decrease h
        }
    }


    public static void main(String[] args) {
        int max = 10;
        ShellSort shellSort = new ShellSort(max);

        for (int i = 0; i < max; i++) {
            shellSort.insert((long) (Math.random() * 99));
        }

        System.out.println("Before sort: ");
        shellSort.display();

        shellSort.shellSort();
        System.out.println("After sort: ");
        shellSort.display();

    }

}
