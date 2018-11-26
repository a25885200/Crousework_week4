package cousework_week4;

public interface Queue{
    public abstract void enqueue(Object item) throws QueueFullException;
    public abstract Object dequeue()throws QueueEmptyException;
    public abstract boolean isEmpty();
    public abstract int isEqual(Object item);
    public abstract int addition();
    public abstract Object front()throws QueueEmptyException;
    public abstract int size();
}
