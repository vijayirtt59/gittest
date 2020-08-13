package com.GraphAlgorithms;

public class VertexInfo {

    private int distance;
    private int vertexId;

    public VertexInfo(int vertexId, int distance) {
        this.distance = distance;
        this.vertexId = vertexId;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVertexId() {
        return vertexId;
    }

    public void setVertexId(int vertexId) {
        this.vertexId = vertexId;
    }
}
