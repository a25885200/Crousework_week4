package cousework_week4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class QueueFullException extends RuntimeException{
    public QueueFullException(){
        super("Queue List is full.");
    }
}
