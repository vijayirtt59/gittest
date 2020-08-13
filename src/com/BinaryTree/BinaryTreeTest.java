package com.BinaryTree;


import com.datastructure.*;

public class BinaryTreeTest {

    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException {

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);
        BinaryTree binaryTree = new BinaryTree();

        Node<Integer> head = binaryTree.insert(null, five);

        binaryTree.insert(head, one);
        binaryTree.insert(head, seven);
        binaryTree.insert(head, nine);
        binaryTree.insert(head, six);
        binaryTree.insert(head, four);
        binaryTree.insert(head, three);
        binaryTree.insert(head, eight);
        binaryTree.insert(head, two);

        binaryTree.print(binaryTree.lookup(head, 7));
        binaryTree.print(binaryTree.lookup(head, 12));

    }
}
