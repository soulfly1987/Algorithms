import java.util.Hashtable;

/**
 * Created by Djole on 26.6.2017.
 */
public class HashTableApp {
    public static void main(String[] args) {
        DataItem aDataItem;
        int aKey;
        int size = 12;
        int n = 8;      //initialSizeOfItems
        int keyPerCell = 10;

        HashTable hashTable = new HashTable(size);

        for (int i = 0; i < n; i++) {
            aKey = (int) (Math.random() * keyPerCell * size);
            aDataItem = new DataItem(aKey);
            hashTable.insert(aDataItem);
        }

        // display table
        hashTable.displayTable();

        // insert into table
        aKey = 100;
        aDataItem = new DataItem(aKey);
        hashTable.insert(aDataItem);
        System.out.println("Table after inserting " + aKey);
        hashTable.displayTable();

        // find into table
        System.out.println("Find " + aKey + " in table: " + hashTable.find(aKey).getKey());

        // delete from table
        System.out.println("Delete " + aKey + " from table: " + hashTable.delete(aKey).getKey());

        // display table after deletition
        hashTable.displayTable();

        Hashtable
    }
}
