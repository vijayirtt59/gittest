package com.GraphEx;

import java.util.*;

public class AdjacencySet implements Graph {

    private int numVertices;
    private GraphType graphType = GraphType.DIRECTED;
    private List<Node> vertexList = new ArrayList<>();

    public AdjacencySet(int numVertices, GraphType graphType){
        this.numVertices = numVertices;
        this.graphType = graphType;

        for(int i=0; i<numVertices; i++){
            vertexList.add(new Node(i));
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if(v1<0 || v1 >=numVertices || v2 <0 ||v2 >=numVertices){
            throw new IllegalArgumentException("Vertex index is invalid");
        }

        vertexList.get(v1).addEdge(v2);
        if(graphType == GraphType.UNDIRECTED){
            vertexList.get(v2).addEdge(v1);
        }
    }
    @Override
    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if(v <0 || v >=numVertices){
            throw new IllegalArgumentException("Vertex Index is invalid");
        }
        return vertexList.get(v).getAdjacentList();
    }

    @Override
    public int getIndegree(int v){
        if(v<0 || v>=numVertices){
            throw new IllegalArgumentException("Vertex Index is invalid");
        }
        int indegree = 0;
        for(int i=0; i<numVertices; i++){
            if(getAdjacentVertices(i).contains(v)){
                indegree++;
            }
        }
        return indegree;
    }

}
