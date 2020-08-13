package com.GraphAlgorithms;

import java.util.*;

public class AdjacencyMatrixGraph implements Graph {

    private int[][] adjacencyMatrix;
    private int numOfVertices = 0;
    private GraphType graphType = GraphType.DIRECTED;

    public AdjacencyMatrixGraph(int numOfVertices, GraphType graphType){
        this.numOfVertices = numOfVertices;
        this.graphType = graphType;
        adjacencyMatrix = new int[numOfVertices][numOfVertices];
        for(int i=0; i<numOfVertices; i++){
            for(int j=0; j<numOfVertices; j++){
                adjacencyMatrix[i][j] = 0;
            }
        }
    }


    @Override
    public GraphType typeOfGraph() {
        return graphType;
    }

    @Override
    public void addEdge(int v1, int v2) {
        if(v1<0 || v1>=numOfVertices || v2<0 || v2>=numOfVertices){
            throw new IllegalArgumentException("Vertex number is not valid");
        }
        adjacencyMatrix[v1][v2] = 1;
        if(graphType == GraphType.UNDIRECTED){
            adjacencyMatrix[v2][v1] = 1;
        }
    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        if(v1<0 || v1>=numOfVertices || v2<0 || v2>=numOfVertices){
            throw new IllegalArgumentException("Vertex number is not valid");
        }
        adjacencyMatrix[v1][v2] = weight;
        if(graphType == GraphType.UNDIRECTED){
            adjacencyMatrix[v2][v1] = weight;
        }
    }

    @Override
    public List<Integer> getAdjacentEdges(int v) {
        if(v<0 || v>=numOfVertices){
            throw new IllegalArgumentException("Vertex Number is not valid");
        }
        List<Integer> adjacentEdges = new ArrayList<>();
        for(int i=0; i<numOfVertices; i++){
            if(adjacencyMatrix[v][i] !=0){
                adjacentEdges.add(i);
            }
        }
        return adjacentEdges;
    }

    @Override
    public int getWeightEdge(int v1, int v2) {
        return adjacencyMatrix[v1][v2];
    }

    @Override
    public int getNumVertices() {
        return numOfVertices;
    }

    @Override
    public int getIndegree(int v) {
        if(v<0 || v>=numOfVertices){
            throw new IllegalArgumentException("Vertex Number is not valid");
        }
        int indegree = 0;
        for(int i=0; i<numOfVertices; i++){
            if(adjacencyMatrix[i][v] !=0){
                indegree++;
            }
        }
        return indegree;
    }
}
