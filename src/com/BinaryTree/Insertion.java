package com.BinaryTree;

public class Insertion<T> {

    private Node<Integer> root;

    private Node<Integer> insert(Node<Integer> head,  Node<Integer> node){
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

    private boolean lookup(Node<Integer> head, int data){
        if(head == null){
            return false;
        }
        if(head.getData() == data){
            return true;
        }

        if(data <= head.getData()){
            return lookup(head.getLeftChild(), data);
        }else{
            return lookup(head.getRightChild(), data);
        }
    }

    public boolean lookup(int data){
        return lookup(root, data);
    }

    public Node<Integer> insert(Node<Integer> node){
        return insert(root, node);
    }


    public void insert123a(){
        root = new Node(2);
        root.setRightChild(new Node(3));
        root.setLeftChild(new Node(1));
    }

    public void insert123b(){
        root = null;
        root = insert(new Node(2));
        root = insert(new Node(1));
        root = insert(new Node(3));
    }

    public int size(Node node){
        if(node == null){
            return 0;
        }else{
            return (size(node.getLeftChild()) + 1 + size(node.getRightChild()));
        }
    }

    public int size(){
        return size(root);
    }

    public int maxDepth(Node head){
        if(head ==null){
            return 0;
        }else{
            int left = maxDepth(head.getLeftChild());
            int right = maxDepth(head.getRightChild());

            return Math.max(left, right);
        }
    }

    public int maxDepth(){
        return maxDepth(root);
    }

    public int minValue(Node<Integer> head){
        if(head == null){
            return -1;
        }
        Node<Integer> current = head;
        while(head.getLeftChild() != null){
            current = head.getLeftChild();
        }
        return current.getData();
    }

    public int minValue(){
        return minValue(root);
    }

    public void printTree(Node root){
        if(root == null){
            System.out.println("Empty Binary Tree...");
        }

        printTree(root.getLeftChild());
        System.out.println(root.getData() + " ");
        printTree(root.getRightChild());
    }

    public void printTree(){
        printTree(root);
    }

    public boolean hasPathSum(int sum){
        return hasPathSum(root, sum);
    }

    public boolean hasPathSum(Node<Integer> root, int sum){
        if(root == null){
            return false;
        }

        int subsum = sum - root.getData();
        return (hasPathSum(root, subsum) || hasPathSum(root, subsum));
    }


    public void printpaths( Node<Integer> root, int[] path, int pathLen){
        if(root == null){
            return;
        }
        path[pathLen] = root.getData();
        pathLen++;

        if(root.getLeftChild() == null && root.getRightChild() == null){
            printTree(path, pathLen);
        }else{
            printpaths(root, path, pathLen);
            printpaths(root, path, pathLen);
        }
    }

    private void printTree(int[] path, int pathLen) {
        for(int p: path){
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public void mirror(Node node){
        if(node != null){
            mirror(node.getLeftChild());
            mirror(node.getRightChild());

            Node temp = node.getLeftChild();
            node.setLeftChild(node.getRightChild());
            node.setRightChild(temp);
        }
    }


}
