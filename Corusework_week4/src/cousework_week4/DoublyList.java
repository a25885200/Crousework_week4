package cousework_week4;


public class DoublyList {

    private DoublyNode head;
    private DoublyNode tail;
    private int count;

    public DoublyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int isEqual(Object item1) {
        DoublyNode current = head;
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i < getCount(); i++) {
            if ((item1).equals(current.data)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int addition() {
        DoublyNode current = head;
        int add = 0;
        for (int i = 0; i < count; i++) {
            add += (int) current.data;
            current = current.next;
        }
        return add;
    }

    public int getCount() {
        return count;
    }

    public void addToHead(Object item) {
        if (isEmpty()) {
            head = tail = new DoublyNode(item);
        } else {
            head.previous = new DoublyNode(item, null, head);
            head = head.previous;
        }
        count += 1;
    }

    public void addToTail(Object item) {
        if (isEmpty()) {
            head = tail = new DoublyNode(item);
        } else {
            tail.next = new DoublyNode(item, tail, null);
            tail = tail.next;
        }
        count++;
    }

    public Object removeFromHead() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        Object item = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        count--;
        return item;
    }

    public Object removeFromTail() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        Object item = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        count--;
        return item;
    }

    public Object getHead() throws EmptyListException {
        if (isEmpty()) {
            return 0;
        } else {
            return head.data;
        }
    }

    public String toString() {
        String s = "[ ";
        DoublyNode current = head;
        while (current != null) {
            s += current.data + " ";
            current = current.next;
        }
        return s + "]";
    }

    public String forward() {
        return toString();
    }

    public String backward() {
        String s = "[ ";
        DoublyNode current = tail;
        while (current != null) {
            s += current.data + " ";
            current = current.previous;
        }
        return s + "]";
    }
}

class EmptyListException extends RuntimeException {

    public EmptyListException() {
        super("List is empty");
    }
}
