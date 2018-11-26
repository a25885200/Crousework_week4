package cousework_week4;

public interface Stack {
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract int isEqual(Object item);
    public abstract void push(Object item)throws StackFullException;
    public abstract Object pop() throws StackEmptyException;
    public abstract Object top() throws StackEmptyException;
    public abstract Object Bottom() throws StackEmptyException;        
}
