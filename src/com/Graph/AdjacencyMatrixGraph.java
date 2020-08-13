package com.Graph;

import java.util.*;

public class AdjacencyMatrixGraph implements Graph {

    private int[][] adjecencyMatrix;
    private GraphType graphType = GraphType.DIRECTED;
    private int numVertices;

    public AdjacencyMatrixGraph(int numVertices, GraphType graphType){
        this.graphType = graphType;
        this.numVertices = numVertices;

        adjecencyMatrix = new int[numVertices][numVertices];

        for(int i=0; i<numVertices; i++){
            for(int j=0; j<numVertices; j++){
                adjecencyMatrix[i][j] = 0;
            }
        }
    }
    @Override
    public void addEdge(int v1, int v2) {
        if(v1 <0 || v2<0 || v1 >=numVertices || v2 >=numVertices){
            throw new IllegalArgumentException("vertex number is not valid");
        }
        adjecencyMatrix[v1][v2] = 1;
        if(graphType == GraphType.UNDIRECTED){
            adjecencyMatrix[v2][v1] = 1;
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if(v <0 || v>=numVertices){
            throw new IllegalArgumentException("Vertex number is not valid");
        }

        List<Integer> adjacencyList = new ArrayList<>();
        for(int i=0; i<numVertices; i++){
            if(adjecencyMatrix[v][i] == 1){
                adjacencyList.add(i);
            }
        }

        Collections.sort(adjacencyList);

        return adjacencyList;
    }
}
