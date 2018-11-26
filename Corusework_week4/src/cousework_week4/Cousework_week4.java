/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cousework_week4;

/**
 *
 * @author leung
 */
public class Cousework_week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new LinkedQueue();
        Stack s = new LinkedStack();
        //test Queue
        System.out.println("TEST QUEUE");
        for (int i = 1; i <= 10; i++) {
            System.out.println("test enqueue: "+i);
            q.enqueue(i);
        }
        System.out.println(q.isEmpty());
        for (int i = 1; i <= 10; i++) {
            System.out.println("test dequeue: "+q.dequeue());
        }
        System.out.println("test empty: "+q.isEmpty());
        
        //test Stack
        //test push
        System.out.println("TEST STACK");
        System.out.println("test empty: "+s.isEmpty());
        for(int i = 1; i<=10 ; i++){
            System.out.println("test push: " +i*10);
            s.push(i*10);
        }
        //test  empty
        System.out.println("test empty: "+s.isEmpty());
        //test search
        int j = s.size();
        System.out.println("test search = 30 position "+(j-s.isEqual((Object) 30)));
        System.out.println("test peek: "+s.top());
        //test pop
        for (int i = 0; i < j; i++) {
            System.out.println("test pop "+s.pop());
        }
        //test empty
        System.out.println("Test empty "+ s.isEmpty());
    }
    
}
