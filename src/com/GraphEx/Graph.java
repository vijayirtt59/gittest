package com.GraphEx;

import java.util.*;

public interface Graph {

    public enum GraphType {
        DIRECTED,
        UNDIRECTED
    }

    public void addEdge(int v1, int v2);
    public List<Integer> getAdjacentVertices(int v);
    public int getNumVertices();
    public int getIndegree(int v);
}
