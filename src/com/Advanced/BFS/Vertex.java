package com.Advanced.BFS;

import java.util.*;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbourList;

    Vertex(int data){
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +"}";
    }

    public void addNeighbourVerted(Vertex vertex){
        neighbourList.add(vertex);
    }
}
