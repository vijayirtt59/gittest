package com.GraphEx;

import java.util.*;



public class LengthFirstTraversal {

    public static void main(String[] args) {
        Graph graph = new AdjacentMatrix(8, Graph.GraphType.DIRECTED);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 7);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 4);

        int[] visited = new int[] {0, 0, 0, 0, 0, 0, 0, 0};

        // This for-loop ensures that all nodes are covered even for an unconnected
        // graph.
        for (int i = 0; i < 8; i++) {
            depthFirst(graph, visited, i);
        }
    }

    public static void depthFirst(Graph graph, int[] visited, int currentVertex){
        if(visited[currentVertex] == 1){
            return;
        }
        visited[currentVertex] = 1;
        List<Integer> vertexList = graph.getAdjacentVertices(currentVertex);
        for(int a: vertexList){
            depthFirst(graph, visited, a);
        }
        System.out.print(currentVertex + " -> " );
    }

}


