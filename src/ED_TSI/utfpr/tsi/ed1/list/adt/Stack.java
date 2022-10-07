package ED_TSI.utfpr.tsi.ed1.list.adt;

public interface Stack<T> {

    public void push(T e);
    public T peek();
    public T pop();
    public boolean isEmpty();
    public int size();
}
