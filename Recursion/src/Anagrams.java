public class Anagrams {
    private static int size;
    private static int count;
    private static char[] arrChar;

    public static void main(String[] args) {
        String word = "cat";
        size = word.length();
        arrChar = new char[size];
        for (int i = 0; i < size; i++) {
            arrChar[i] = word.charAt(i);
        }
        doAnagram(size);
    }

    private static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            displayWord();
            rotate(newSize);
        }
    }

    private static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char tmp = arrChar[position];
        for (j = position + 1; j < size; j++) {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = tmp;
    }

    private static void displayWord() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(arrChar[i]);
        }
    }
}
