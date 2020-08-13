package com.GraphEx;

import com.datastructure.*;

import com.datastructure.Queue;

import java.util.*;
import java.util.List;

public class TopologicalSort {

    public static List<Integer> sort(Graph graph) throws QueueOverflowException, QueueUnderflowException {
        Queue<Integer> queue = new Queue(Integer.class);
        Map<Integer, Integer> indegreeMap = new HashMap<>();

        for(int i=0; i<graph.getNumVertices(); i++){
               int indegree = graph.getIndegree(i);
               indegreeMap.put(i, indegree);
               if(indegree == 0){
                   queue.enQueue(i);
               }
        }

        List<Integer> sortedList = new ArrayList<>();
        while(!queue.isEmpty()){

           int vertex =  queue.deQueue();
           sortedList.add(vertex);

           List<Integer> adjacentList = graph.getAdjacentVertices(vertex);
           for(int a: adjacentList){
               int updatedDegree = graph.getIndegree(vertex) - 1;
               indegreeMap.remove(a);
               indegreeMap.put(a, updatedDegree);
               if(updatedDegree == 0){
                   queue.enQueue(updatedDegree);
               }
           }
        }

        System.out.println(sortedList);
        if(sortedList.size() != graph.getNumVertices()){
            throw new RuntimeException("The Graph had a cycle");
        }

        return sortedList;
    }

    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException {
        Graph graph1 = new AdjacentMatrix(8, Graph.GraphType.DIRECTED);
        graph1.addEdge(2, 7);
        graph1.addEdge(0, 3);
        graph1.addEdge(0, 4);
        graph1.addEdge(0, 1);
        graph1.addEdge(2, 1);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 5);
        graph1.addEdge(3, 6);
        graph1.addEdge(4, 7);

        printList(sort(graph1));
    }

    public static void printList(List<Integer> list) {
        for (int v : list) {
            System.out.println(v + ", ");
        }
    }
}
