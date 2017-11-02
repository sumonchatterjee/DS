package tree;

/**
 * Created by sumon.chatterjee on 12/01/17.
 */
public class BinaryTreeNode<T> {

    private T data;
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rightNode;

    public BinaryTreeNode(T data) {
        this(data,null,null);
    }

    public BinaryTreeNode(T data, BinaryTreeNode<T> leftNode, BinaryTreeNode<T> rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

}
