package com.Advanced.BFS;

public class App {


    public static void main(String[] args) {
        BFS bfs = new BFS();
        Vertex ver1 = new Vertex(1);
        Vertex ver2 = new Vertex(2);
        Vertex ver3 = new Vertex(3);
        Vertex ver4 = new Vertex(4);
        Vertex ver5 = new Vertex(5);

        ver1.addNeighbourVerted(ver2);
        ver1.addNeighbourVerted(ver4);
        ver4.addNeighbourVerted(ver5);
        ver2.addNeighbourVerted(ver3);

        bfs.breathFirstSearch(ver1);
    }



}
