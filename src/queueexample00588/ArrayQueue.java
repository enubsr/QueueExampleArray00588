/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample00588;

/**
 *
 * @author Enubs
 */
public class ArrayQueue<E> implements Queue<E> {

    private E[] element;
    private int front = 0;
    private int size = 0;
    private int capacity;
    
    public ArrayQueue(){
        element = (E[]) new Object[10];
    }
    
    public ArrayQueue(int capacity){
        element = (E[]) new Object[capacity];
    }
    
    
    @Override
    public E first() {
        if(isEmpty()){
            return null;
        }
        
        return element[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E element) throws IllegalStateException{
        if(size >= capacity){
            throw new IllegalStateException("Queue is full.");
        }
        
        int avail = (front + size) % capacity;
        this.element[avail] = element;
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            return null;
        }
        
        E answer = element[front];
        element[front] = null;
        front = (front + 1) % capacity;
        size--;
        return answer;
    }
    
}
