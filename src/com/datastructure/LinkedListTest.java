package com.datastructure;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addNode(10);
        linkedList.addNode(20);

        linkedList.printNodes();
        System.out.println(linkedList.count());
        System.out.println(linkedList.getFirstElement());
        System.out.println(linkedList.popElement());
        System.out.println("After PoP-------");
        linkedList.printNodes();
        linkedList.deleteAll();

        System.out.println("New List----------");
        linkedList.addNode(10);
        linkedList.addNode(20);
        linkedList.addNode(40);
        linkedList.addNode(50);

        linkedList.insertNth(30, 3);
        linkedList.printNodes();
    }
}
