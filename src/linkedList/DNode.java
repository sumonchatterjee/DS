package linkedList;

/**
 * Created by sumon.chatterjee on 12/01/17.
 */
public class DNode<T> extends Node<T> {

    private Node<T> preNode;

    private DNode(T data, Node<T> nextNode) {
        super(data, nextNode);
    }

    private DNode(T data, Node<T> nextNode, Node<T> preNode) {
        super(data, nextNode);
        this.preNode = preNode;
    }

    public Node<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(Node<T> preNode) {
        this.preNode = preNode;
    }
}
