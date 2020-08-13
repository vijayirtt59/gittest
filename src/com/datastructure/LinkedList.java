package com.datastructure;

public class LinkedList<T extends Comparable<T>> {

    private Node<T> head = null;

    public LinkedList(){

    }

    //Add node to the end
    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        }else{
            Node<T> curr = head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    //Print all the nodes
    public void printNodes(){
        if(head == null){
            System.out.println("The List is empty");
        }
        Node<T> curr = head;
        int i = 1;
        while(curr != null){
            System.out.println("Node<T> number " + i + " data stored is " + curr.toString());
            i++;
            curr = curr.getNext();
        }
    }


    //Count the number of elements in the list
    public int count(){
        if(head == null){
            return 0;
        }
        int count = 0;
        Node<T> curr = head;
        while(curr != null){
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    //Get the first element
    public T getFirstElement(){
        if(head == null){
            System.out.println("List is empty");
            return null;
        }else{
            return head.getData();
        }
    }

    //Delete all elements
    public void deleteAll(){
        head = null;
    }

    //Pop up the first element
    public T popElement(){
        if(head != null){
            Node<T> curr = head;
            head = head.getNext();
            return curr.getData();
        }
        return null;
    }

    public void insertNth(T data, int n){
        if(n > count()){
            System.out.println("n is greater than the number of nodes");
            return;
        }
        if(n ==0){
            Node<T> curr = head;
            head = new Node<T>(data);
            head.setNext(curr);
        }else{
            int i = 1;
            Node<T> curr = head;
            while(i < n-1){
                curr = curr.getNext();
                i++;
            }
            Node<T> nextNode = curr.getNext();
            curr.setNext(new Node<T>(data));
            curr.getNext().setNext(nextNode);
        }
    }
}
