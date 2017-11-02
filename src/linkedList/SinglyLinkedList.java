package linkedList;

import linkedList.Node;

/**
 * Created by sumon.chatterjee on 12/01/17.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(T[] collection) {
        if (collection != null && collection.length > 0) {
            size = collection.length;
            Node<T> currentNode = null;
            for (T t : collection) {
                if (currentNode == null) {
                    head = new Node<T>(t, null);
                    currentNode = head;
                } else {
                    Node<T> newNode = new Node<T>(t, null);
                    currentNode.setNextNode(newNode);
                    currentNode = newNode;
                }
            }
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public T remove(int index) {
        if (!isEmpty() && index >= 0) {
            Node<T> nextNode = head;
            Node<T> prevNode = null;
            int count = 0;
            while (nextNode != null) {
                if (count == index) {
                    remove(prevNode, nextNode);
                    return nextNode.getData();
                }
                prevNode = nextNode;
                nextNode = nextNode.getNextNode();
                count++;
            }
        }
        throw new RuntimeException("Index Out Of Bound");
    }

    public void remove(T item) {
        if (!isEmpty() && item != null) {
            Node<T> nextNode = head;
            Node<T> prevNode = null;
            while (nextNode != null) {
                if (item == nextNode.getData()) {
                    remove(prevNode, nextNode);
                    return;
                }
                prevNode = nextNode;
                nextNode = nextNode.getNextNode();
            }
        }
        throw new RuntimeException("Item not found");
    }

    public void add(T item) {

        if (isEmpty()) {
            head = new Node<T>(item, null);
        } else {
            Node<T> nextNode = head;
            while (nextNode != null) {
                if (nextNode.getNextNode() == null) {
                    add(nextNode, new Node<T>(item, null));
                }
                nextNode = nextNode.getNextNode();
            }
        }
    }

    public void add(int index, T item) {

        if (index > size) {
            throw new RuntimeException("index out of bound");
        }
        //head
        if (index==0) {
            head = new Node<>(item,head);
        } else {
            Node<T> ptr = head;
            int count = 0;
            while (true) {
                if (count == index) {
                    //add
                    add(ptr, new Node<T>(item, null));
                    break;
                }
                count++;
                ptr = ptr.getNextNode();
            }
        }
    }

    private void add(Node<T> prevNode, Node<T> node) {
        if (prevNode == null) {
            head = node;
        } else {
            node.setNextNode(prevNode.getNextNode());
            prevNode.setNextNode(node);
        }
    }

    private void remove(Node<T> preNode, Node<T> remove) {
        size--;
        if (preNode == null) {
            head = remove.getNextNode();
        } else {
            preNode.setNextNode(remove.getNextNode());
        }
        remove.setNextNode(null);
    }


    /**
     * O(n)
     **/
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
