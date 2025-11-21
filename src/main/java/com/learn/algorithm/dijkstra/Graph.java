package com.learn.algorithm.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int V; //số đỉnh
    private List<List<Node>> adj;

    public Graph(int v) {
        this.V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Node(v, weight));
        adj.get(v).add(new Node(u, weight));
    }

    public List<List<Node>> getAdj() {
        return adj;
    }

    public int getV() {
        return V;
    }
}
