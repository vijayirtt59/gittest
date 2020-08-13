package com.GraphAlgorithms;

public class DistanceTableInfo {

    private int lastVertex;
    private int distance;

    public DistanceTableInfo(){
        distance = Integer.MAX_VALUE;
        lastVertex = -1;
    }

    public int getLastVertex() {
        return lastVertex;
    }

    public void setLastVertex(int lastVertex) {
        this.lastVertex = lastVertex;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
