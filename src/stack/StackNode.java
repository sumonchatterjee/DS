package stack;

/**
 * Created by sumon.chatterjee on 17/01/17.
 */
public class StackNode {

    private int data;
    private StackNode nextNode;

    public StackNode(int data, StackNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public StackNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(StackNode nextNode) {
        this.nextNode = nextNode;
    }






}
