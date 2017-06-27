/**
 * Created by Djole on 26.6.2017.
 */
public class HashTable {
    private DataItem[] hashArr;
    private int arraySize;
    private DataItem nonItem;           // for deleted items

    public HashTable(int size) {
        this.arraySize = size;
        hashArr = new DataItem[size];
        nonItem = new DataItem(-1);     // deleted item is key -1
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(DataItem item) {
        int key = item.getKey();        // extract key
        int hashVal = hashFunc(key);    // hash the key

        // until empty cell or -1
        while (hashArr[hashVal] != null && hashArr[hashVal].getKey() != -1) {
            ++hashVal;                  // go to next cell
            hashVal = hashVal % arraySize;  // wraparound if necessary
        }

        hashArr[hashVal] = item;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunc(key);    // hash the key

        // until empty cell, found the key
        while (hashArr[hashVal] != null) {
            if (hashArr[hashVal].getKey() == key) {
                DataItem tmp = hashArr[hashVal];    // save item
                hashArr[hashVal] = nonItem;
                return tmp;
            }
            ++hashVal;                  // go to next cell
            hashVal = hashVal % arraySize;  // wraparound if necessary
        }
        return null;                    // can't find item
    }

    public DataItem find(int key) {     // find item with key
        int hashVal = hashFunc(key);    // hash the key

        // until empty cell, found the key
        while (hashArr[hashVal] != null) {
            if (hashArr[hashVal].getKey() == key)
                return hashArr[hashVal];
            ++hashVal;                  // go to next cell
            hashVal = hashVal % arraySize;  //wraparound if necessary
        }
        return null;                    // can't find item
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int i = 0; i < arraySize; i++) {
            if (hashArr[i] != null)
                System.out.print(hashArr[i].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }
}
