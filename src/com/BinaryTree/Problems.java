package com.BinaryTree;

public class Problems {


    public Integer minimumNode(Node<Integer> head){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(head.getLeftChild() == null){
            return head.getData();
        }
        return minimumNode(head.getLeftChild());
    }

    public int maxDepth(Node<Integer> head){
        if(head == null){
            return 0;
        }
        if(head.getLeftChild() == null && head.getRightChild()==null){
            return 0;
        }

        int leftDepth = 1 + maxDepth(head.getLeftChild());
        int rightDepth = 1 + maxDepth(head.getRightChild());

        return Math.max(leftDepth, rightDepth);
    }
}
