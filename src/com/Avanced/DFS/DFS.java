package com.Avanced.DFS;

import java.util.*;

public class DFS {


    private Stack<Vertex> stack;
    public DFS(){
        this.stack = new Stack();
    }

    public void DFS(List<Vertex> vertexList){
        for(Vertex v: vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsRecrusive(v);
            }
        }
    }

    public void dfsRecrusive(Vertex root){
        System.out.println(root);
        for(Vertex v: root.getNeighbourList()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsRecrusive(v);
            }
        }
    }

    public void dfsStack(Vertex root){

        stack.add(root);
        root.setVisited(true);
        while (!stack.isEmpty()){
            Vertex currentVertex = stack.pop();
            System.out.println(currentVertex);

            for(Vertex v: currentVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }
}
