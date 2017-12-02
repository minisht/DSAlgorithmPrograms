package com.linkedlist;

/**
 * Created by minishtera on 11/27/17.
 */
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        setNext(null);
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public T getData(){
        return data;
    }

    @Override
    public String toString(){
        return String.valueOf(data);
    }

}
