package com.antonbas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//[[0, 1], [0, 2], [1, 3], [2, 3], [2, 5], [5, 6], [3, 4]]
public class Graph {
    private int numberOfVertices;
    private LinkedList<Integer> adj[];
    private final int NIL = -1;
    private int time = 0;

    public Graph( int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.adj = new LinkedList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void createVertice(int x, int y) {
        adj[x].add(y);
        adj[y].add(x);
    }

    public int[] getListAP() {
        boolean visited[] = new boolean[numberOfVertices];
        int disc[] = new int[numberOfVertices];
        int low[] = new int[numberOfVertices];
        int parent[] = new int[numberOfVertices];
        boolean ap[] = new boolean[numberOfVertices];
        List<Integer>  points = new ArrayList<>();
        for (int i = 0; i < numberOfVertices; i++)
        {
            parent[i] = NIL;
        }
        for (int i = 0; i < numberOfVertices; i++)
            if (!visited[i])
                APUtil(i, visited, disc, low, parent, ap);
        for (int i = 0; i < numberOfVertices; i++)
            if (ap[i])
                points.add(i);

        return points.stream().mapToInt(i->i).toArray();
    }

    private void APUtil(int u, boolean visited[], int disc[],
                int low[], int parent[], boolean ap[])
    {

        // Count of children in DFS Tree
        int children = 0;

        // Mark the current node as visited
        visited[u] = true;

        // Initialize discovery time and low value
        disc[u] = low[u] = ++time;

        // Go through all vertices aadjacent to this

        for(Integer v: adj[u])
        {
            // If v is not visited yet, then make it a child of u
            // in DFS tree and recur for it
            if (!visited[v])
            {
                children++;
                parent[v] = u;
                APUtil(v, visited, disc, low, parent, ap);

                // Check if the subtree rooted with v has a connection to
                // one of the ancestors of u
                low[u]  = Math.min(low[u], low[v]);

                // u is an articulation point in following cases

                // (1) u is root of DFS tree and has two or more chilren.
                if (parent[u] == NIL && children > 1)
                    ap[u] = true;

                // (2) If u is not root and low value of one of its child
                // is more than discovery value of u.
                if (parent[u] != NIL && low[v] >= disc[u])
                    ap[u] = true;
            }

            // Update low value of u for parent function calls.
            else if (v != parent[u])
                low[u]  = Math.min(low[u], disc[v]);
        }
    }
}
