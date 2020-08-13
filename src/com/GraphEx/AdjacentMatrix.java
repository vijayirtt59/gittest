package com.GraphEx;

import java.util.*;

public class AdjacentMatrix implements Graph {

    private int[][] adjacencyMatrix;
    private int numVerticces;
    private GraphType graphType = GraphType.DIRECTED;


    @Override
    public int getNumVertices() {
        return numVerticces;
    }

    public void setNumVerticces(int numVerticces) {
        this.numVerticces = numVerticces;
    }

    public AdjacentMatrix(int numVerticces, GraphType graphType){
        this.graphType = graphType;
        this.numVerticces = numVerticces;
        adjacencyMatrix = new int[numVerticces][numVerticces];

        for(int i=0; i<numVerticces; i++){
            for (int j=0; j<numVerticces; j++){
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if(v1 <0 || v1 >= numVerticces || v2 <0 || v2 >= numVerticces){
            throw new IllegalArgumentException("Vertex index is invalid");
        }
        adjacencyMatrix[v1][v2] = 1;
        if(graphType == GraphType.UNDIRECTED){
            adjacencyMatrix[v2][v1] = 1;
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if(v <0 || v>=numVerticces){
            throw new IllegalArgumentException("Vertex index is invalid");
        }

        List<Integer> adjacentList = new ArrayList<>();
        for(int i=0; i<numVerticces; i++){
            if(adjacencyMatrix[v][i] == 1){
                adjacentList.add(i);
            }
        }
        Collections.sort(adjacentList);
        return adjacentList;
    }


    @Override
    public int getIndegree(int v){
        if(v<0 || v>=numVerticces){
            throw new IllegalArgumentException("Vertex index is invalid");
        }

        int degree =0;
        for(int i=0; i<numVerticces; i++){
            if(adjacencyMatrix[i][v] == 1){
                degree++;
            }
        }
        return degree;
    }
}
