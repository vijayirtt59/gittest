package com.BinaryTree;

import com.datastructure.*;

public class BinaryTree {

    public static void main(String[] args) {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);

        Node<Integer> head = insert(null, five);

        insert(head, one);
        insert(head, seven);
        insert(head, nine);
        insert(head, six);
        insert(head, four);
        insert(head, three);
        insert(head, eight);
        insert(head, two);

        print(lookup(head, 7));
        print(lookup(head, 12));
    }

    public void breadFirst(Node root) throws QueueOverflowException, QueueUnderflowException{
        if(root == null){
            return;
        }

        Queue<Node> queue = new Queue<>(Node.class);
        queue.enQueue(root);

        while (!queue.isEmpty()){

            Node node = queue.deQueue();
            //System.out.println(node);
            print(node);

            if(node.getLeftChild() != null){
                queue.enQueue(node.getLeftChild());
            }

            if(node.getRightChild()!=null){
                queue.enQueue(node.getRightChild());
            }

        }

    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }
        print(root);
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    public static void print(Node node){
        if(node == null){
            System.out.println("Not Found");
            return;
        }else{
            System.out.println(node.getData() + " Found");
        }

    }

    public static Node<Integer> insert(Node<Integer> head, Node<Integer> node){
        if(head == null){
            return node;
        }

        if(node.getData() <= head.getData()){
            head.setLeftChild(insert(head.getLeftChild(), node));
        }else{
            head.setRightChild(insert(head.getRightChild(), node));
        }
        return head;
    }

    public static Node<Integer> lookup(Node<Integer> head, int data){
        if(head == null){
            return null;
        }
        if(data == head.getData()){
            return head;
        }
        if(data <= head.getData()){
            return lookup(head.getLeftChild(), data);
        }else{
            return lookup(head.getRightChild(), data);
        }
    }

}
