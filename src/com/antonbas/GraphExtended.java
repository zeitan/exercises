package com.antonbas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GraphExtended {
    private Map<Integer, LinkedList<Integer>> graph ;
    private Map<Integer, Boolean> visted;

    public GraphExtended(int vertices) {
        graph = new HashMap<>();
        visted = new HashMap<>();
    }

    public void addEdge(int src, int dest) {
        LinkedList<Integer> elems = graph.getOrDefault(src, new LinkedList<>());
        elems.add(src);
        graph.put(src, elems);
    }

    public void printTransversal(int vertex) {


    }
}
