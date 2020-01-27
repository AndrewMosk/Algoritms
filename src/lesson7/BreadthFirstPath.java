package lesson7;

import java.util.LinkedList;

public class BreadthFirstPath {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public BreadthFirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

    public int pathLengthRecursion(int dist) {
        LinkedList<Integer> path = pathTo(dist);
        return countLengthRecursion(path);
    }

    private int countLengthRecursion(LinkedList<Integer> path) {
        if (path.isEmpty()){
            return 0;
        }
        if (path.size() == 1) {
            return path.getLast() - source;
        }

        int edgeLength = Math.abs(path.getLast() - path.get(path.size()-2));
        path.removeLast();
        return edgeLength + Math.abs(countLengthRecursion(path));
    }

    public int pathLength(int dist) {
        LinkedList<Integer> path = pathTo(dist);
        int length = 0;
        int start = source;

        for (Integer edge : path) {
            length += Math.abs(start - edge);
            start = edge;
        }
        return length;
    }

}
