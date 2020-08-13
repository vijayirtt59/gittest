package com.datastructure;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
        setNext(null);
    }

    public T getData(){
        return data;
    }

    public void setNext(Node<T> next ){
        this.next = next;
    }

    public Node<T> getNext(){
        return next;
    }

    public String toString(){
        return String.valueOf(data);
    }
}
