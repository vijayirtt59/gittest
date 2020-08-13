package com.GraphAlgorithms;

import java.util.*;

public class Dijkstra {


    public static Map<Integer, DistanceTableInfo> buildDistanceTable(Graph graph, int source){


        Map<Integer, DistanceTableInfo> distanceTable = new HashMap<>();
        PriorityQueue<VertexInfo> queue = new PriorityQueue<>(new Comparator<VertexInfo>() {

            @Override
            public int compare(VertexInfo v1, VertexInfo v2) {
                return ((Integer)v1.getDistance()).compareTo(v2.getDistance());
            }
        });

        Map<Integer, VertexInfo> vertexTable = new HashMap<>();

        for(int i=0; i<graph.getNumVertices(); i++){
            distanceTable.put(i, new DistanceTableInfo());
        }

        distanceTable.get(source).setDistance(0);
        distanceTable.get(source).setLastVertex(source);

        VertexInfo sourceVertex = new VertexInfo(source, 0);
        queue.add(sourceVertex);
        vertexTable.put(source, sourceVertex);

        while(!queue.isEmpty()){
            VertexInfo vertexInfo = queue.poll();
            int currentVertex = vertexInfo.getVertexId();

            for(int neighbours: graph.getAdjacentEdges(currentVertex)) {
                int distance = distanceTable.get(currentVertex).getDistance() + graph.getWeightEdge(currentVertex, neighbours);

                if(distanceTable.get(neighbours).getDistance() > distance){
                    distanceTable.get(neighbours).setDistance(distance);
                    distanceTable.get(neighbours).setLastVertex(currentVertex);
                }

            }
        }
        return distanceTable;
    }


}
