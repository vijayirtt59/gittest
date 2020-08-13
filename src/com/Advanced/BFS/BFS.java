package com.Advanced.BFS;


import java.util.*;

public class BFS {

    public void breathFirstSearch(Vertex root){

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        root.setVisited(true);

        while(!queue.isEmpty()){
            Vertex currentVertex = queue.remove();
            System.out.println(currentVertex);

            for (Vertex v: currentVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }

    }
}
