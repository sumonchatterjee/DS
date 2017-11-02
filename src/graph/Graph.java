package graph;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by sumon.chatterjee on 02/11/17.
 */
public class Graph {

    private final int maxVertices = 20;
    private Vertex vertexList[];
    private int adjMatrix[][]; //for determining edges between two vertices
    private int vertexCount; //stores not of vertex in a graph
    private Stack theStack;
    private Queue theQueue;

    public Graph() {
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        vertexCount = 0;
        for (int y = 0; y < maxVertices; y++)
            for (int x = 0; x < maxVertices; x++)
                adjMatrix[x][y] = 0;

        theStack = new Stack();
        theQueue = new Queue() {
            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    //for adding a new vertex in the graph
    public void addVertex(char lab) {
        vertexList[vertexCount++] = new Vertex(lab);
    }


    //add new path or edge between two vertex
    public void addNewEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }


    //print the vertex
    public void displayVertex(int v) {
        System.out.println(vertexList[v].getLabel());
    }


    // dfs algorithm with stack
    public void dfs() {
        vertexList[0].setVisited(true);
        displayVertex(0);
        theStack.push(0);
        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex((int) theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].setVisited(true);
                displayVertex(v);
                theStack.push(v);
            }
        }
    }


    //breadth first serach algo with queue
    public void bfs() {
        vertexList[0].setVisited(true);
        displayVertex(0);
        theQueue.add(0);

        while (!theQueue.isEmpty()) {
            int v1 = (int) theQueue.remove();
            int v = getAdjUnvisitedVertex(v1);
            if (v != -1) {
                vertexList[v].setVisited(true);
                displayVertex(v);
                theQueue.add(v);
            }
        }
    }


    //get the unvisited vertex corresponding to the vertex given
    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < vertexCount; j++) {
            if (adjMatrix[v][j] == 1 && vertexList[v].isVisited() == false)
                return j;
        }
        return -1;

    }


}
