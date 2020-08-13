package com.GraphEx;

import java.util.*;

public class Node {

    private int vertexNumber;
    private Set<Integer> adjacenySet = new HashSet<>();

    public Node(int vertexNumber){
        this.vertexNumber = vertexNumber;
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public void addEdge(int vertexNumber){
        adjacenySet.add(vertexNumber);
    }

    public List<Integer> getAdjacentList(){
        List<Integer> sortedList = new ArrayList<>(adjacenySet);
        Collections.sort(sortedList);
        return sortedList;
    }
}
