package com.Avanced.DFS;

import java.util.*;

public class App {


    public static void main(String[] args) {
        DFS bfs = new DFS();
        Vertex ver1 = new Vertex(1);
        Vertex ver2 = new Vertex(2);
        Vertex ver3 = new Vertex(3);
        Vertex ver4 = new Vertex(4);
        Vertex ver5 = new Vertex(5);

        ver1.addNeighbour(ver2);
        ver1.addNeighbour(ver4);
        ver4.addNeighbour(ver5);
        ver2.addNeighbour(ver3);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(ver1);
        vertexList.add(ver2);
        vertexList.add(ver3);
        vertexList.add(ver4);
        vertexList.add(ver5);

        bfs.DFS(vertexList);
    }
}
