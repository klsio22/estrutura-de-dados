package ED_TSI.utfpr.tsi.ed1.list.adt;

public interface Queue<T> {

    public void enqueue(T e);
    public T dequeue();
    public boolean isEmpty();
    public int size();
}
