package graph;

/**
 * Created by sumon.chatterjee on 02/11/17.
 */
public class Vertex {
    private char label;



    private boolean isVisited;

    public Vertex(char mLabel){
        label=mLabel;
        isVisited=false;
    }

    public char getLabel() {
        return label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
