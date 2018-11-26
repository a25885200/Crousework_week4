package cousework_week4;


public class StackEmptyException extends RuntimeException{
    public StackEmptyException(){
        super("Stack is empty!");
    }    
}
