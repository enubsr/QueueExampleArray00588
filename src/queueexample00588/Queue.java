/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample00588;

/**
 *
 * @author Enubs
 * @param <E>
 */
public interface Queue<E> {
    E first();
    int size();
    boolean isEmpty();
    
    void enqueue(E element) throws IllegalStateException;
    E dequeue();
}
