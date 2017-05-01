public class LinkQueue {
    private DoubleEndedLinkedList list;

    public LinkQueue() {
        this.list = new DoubleEndedLinkedList();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void inset(int key){
        list.insertLast(key);
    }

    public void remove(){
        list.deleteFirst();
    }

    public void displayQueue(){
        list.displayList();
    }
}
