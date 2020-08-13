package com.GraphEx;

import com.datastructure.*;
import com.datastructure.Queue;

import java.util.*;

public class BreadhFirstTraversal {

    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException {
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
            breadFirst(graph, visited, i);
        }
    }

    public static void breadFirst(Graph graph, int[] visited, int currentVertex) throws QueueOverflowException, QueueUnderflowException {
        Queue<Integer> queue = new Queue(Integer.class);
        queue.enQueue(currentVertex);

        while (!queue.isEmpty()){
            int vertex = queue.deQueue();

            if(visited[vertex] == 1){
                continue;
            }
            System.out.println("Vertex  -> " + vertex);
            visited[vertex] =1;

            List<Integer> adjacentList = graph.getAdjacentVertices(vertex);

            for(int a : adjacentList){
                if(visited[a] != 1){
                    queue.enQueue(a);
                }
            }
        }

    }
}
