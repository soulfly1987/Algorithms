public class LinkStack {
    private SimpleLinkedList list;

    public LinkStack() {
        list = new SimpleLinkedList();
    }

    public void push(int key){
        list.insertFirst(key);
    }

    public SimpleNode pop(){
        return list.deleteFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void displayStack(){
        list.displayList();
    }

}
