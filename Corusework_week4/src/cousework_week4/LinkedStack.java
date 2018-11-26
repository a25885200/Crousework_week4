package cousework_week4;

public class LinkedStack implements Stack{
    
    private DoublyList sll;
    
    public LinkedStack(){
        sll = new DoublyList();
    }
    
    @Override
    public int size() {
        return sll.getCount(); 
    }
    
    @Override
    public boolean isEmpty() {
        return sll.getCount() == 0; 
    }

    @Override
    public void push(Object item) throws StackFullException {
            sll.addToHead(item);
        
    }

    @Override
    public Object pop() throws StackEmptyException {
        try{
        Object item = sll.removeFromHead();
        return item;}
        catch(EmptyListException e){
            throw new StackEmptyException();
        }
    }

    @Override
    public Object top() throws StackEmptyException {
         return sll.getHead();
    }
    
    @Override
    public String toString(){
        return sll.toString();
    }

    @Override
    public Object Bottom() throws StackEmptyException {
        if(isEmpty())return 0;
        Object item = sll.removeFromTail();
        sll.addToTail(item);
        return item;
    }

    @Override
    public int isEqual(Object item) {
        return sll.isEqual(item);
    }
}
