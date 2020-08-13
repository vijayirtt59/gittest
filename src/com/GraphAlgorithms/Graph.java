package com.GraphAlgorithms;

import java.util.*;

public interface Graph {

    enum GraphType{
        DIRECTED,
        UNDIRECTED
    }

    GraphType typeOfGraph();
    void addEdge(int v1, int v2);
    void addEdge(int v1, int v2, int weight);
    List<Integer> getAdjacentEdges(int v);
    int getWeightEdge(int v1, int v2);
    int getNumVertices();
    int getIndegree(int v);
}
