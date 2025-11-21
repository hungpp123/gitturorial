package com.learn.algorithm.dijkstra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {

    public static void dijkstra(int src, Graph graph) {

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));
        int[] dist = new int[graph.getV()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            for (Node neighbor : graph.getAdj().get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Khoang cach tu dinh " + src + " toi cac dinh: ");
        for (int i = 0; i < graph.getV(); i++) {
            System.out.println("Dinh " + i + " la: " + dist[i]);
        }

    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 4, 3);
        g.addEdge(1, 2, 2);
        g.addEdge(1, 4, 4);
        g.addEdge(2, 3, 9);
        g.addEdge(3, 4, 7);
        dijkstra(0, g);
    }
}
