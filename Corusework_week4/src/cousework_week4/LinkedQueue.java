package cousework_week4;


public class LinkedQueue implements Queue {

    private DoublyList qll;

    public LinkedQueue() {
        qll = new DoublyList();
    }

    @Override
    public boolean isEmpty() {
        return qll.isEmpty();
    }
    
    @Override
    public int isEqual(Object item){
        return qll.isEqual(item);
    }
    
    @Override
    public void enqueue(Object item) throws QueueFullException {
        qll.addToTail(item);
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        try {         
            Object item =  qll.removeFromHead();
            return item;
        }
        catch(QueueEmptyException e){
            throw new QueueEmptyException();
    }  
    }

    @Override
    public Object front() throws QueueEmptyException {
        try{
            Object item = qll.removeFromHead();
            qll.addToHead(item);
            return item;
        }catch (EmptyListException e){
            throw new QueueEmptyException();
        }
    }

    @Override
    public int size() {
        return qll.getCount();
    }

    @Override
    public String toString() {
        return qll.toString();
    }

    @Override
    public int addition() {
        return qll.addition();
    }

}
