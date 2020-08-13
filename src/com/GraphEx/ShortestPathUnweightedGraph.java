package com.GraphEx;

import java.util.*;

public class ShortestPathUnweightedGraph {

    public static void main(String[] args) {
        Graph graph1 = new AdjacentMatrix(8, Graph.GraphType.DIRECTED);
        graph1.addEdge(2, 7);
        graph1.addEdge(3, 0);
        graph1.addEdge(0, 4);
        graph1.addEdge(0, 1);
        graph1.addEdge(2, 1);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 5);
        graph1.addEdge(6, 3);
        graph1.addEdge(4, 7);

        shortestPath(graph1, 0, 5);
    }
    public static Map<Integer, DistanceTable> buildDistanceTeble(Graph graph, int source){

        Map<Integer, DistanceTable> distanceTableMap = new HashMap<>();

        for(int i=0; i < graph.getNumVertices(); i++){
            distanceTableMap.put(i, new DistanceTable());
        }

        distanceTableMap.get(source).setDistance(0);
        distanceTableMap.get(source).setLastVertex(source);

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()){
            int currentVertex = queue.pollFirst();

            for(int i: graph.getAdjacentVertices(currentVertex)){
                int currentDistance = distanceTableMap.get(i).getDistance();
                if(currentVertex == -1){
                    int distance = distanceTableMap.get(currentVertex).getDistance() + 1;
                    distanceTableMap.get(i).setDistance(distance);
                    distanceTableMap.get(i).setLastVertex(currentVertex);
                }
                if(!graph.getAdjacentVertices(i).isEmpty()){
                    queue.add(i);
                }

            }
        }
        return distanceTableMap;

    }

    public static void shortestPath(Graph graph, int source, int destination){
        Map<Integer, DistanceTable> distanceTableMap = buildDistanceTeble(graph, source);

        Stack<Integer> stack = new Stack<>();
        stack.push(destination);

        int previousIndex = distanceTableMap.get(destination).getLastVertex();

        if(previousIndex != -1 && previousIndex !=source){
            stack.push(previousIndex);
            previousIndex = distanceTableMap.get(previousIndex).getLastVertex();
        }

        if(previousIndex == -1){
            System.out.println("No path exists");
        }else{
            System.out.println("Smallest Path is---");
            while (!stack.isEmpty()){
                System.out.print("-> " + stack.pop());
            }
            System.out.println("DONE!!!!");
        }

    }
}
