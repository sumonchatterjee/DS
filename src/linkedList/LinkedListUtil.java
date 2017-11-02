package linkedList;

/**
 * Created by sumon.chatterjee on 12/01/17.
 */
public class LinkedListUtil {


    public static int addOne(Node<Integer> node) {

        if (node != null) {
            int carryForward = addOne(node.getNextNode());
            if (carryForward > 0) {
                carryForward += node.getData();
                if (carryForward == 10) {
                    node.setData(0);
                    carryForward = 1;
                } else {
                    node.setData(carryForward);
                    return 0;
                }
            }
            return carryForward;
        } else {
            return 1;
        }
    }


    //itereate the node if node has value less then9 then store that in @param oneWillBeAddedNode and
    public static Node<Integer> addOneEfficient(Node<Integer> node) {
        Node<Integer> tempNode = node;
        Node<Integer> oneWillBeAddedNode = null;

        while (tempNode != null) {
            if (tempNode.getData() < 9) {
                oneWillBeAddedNode = tempNode;
            }
            tempNode = tempNode.getNextNode();
        }

        ///once we got the node where we will add one and in remaining node from this we will simply putt zeros
        Node<Integer> rootNode = null;
        if (oneWillBeAddedNode == null) {
            ///whole list contain 9s insert new node at front and putt zeros in all
            rootNode = new Node<>(1,node);
            tempNode = node;
        } else {
            oneWillBeAddedNode.setData(oneWillBeAddedNode.getData()+1);
            tempNode = oneWillBeAddedNode.getNextNode();
        }

        while (tempNode!=null) {
            tempNode.setData(0);
            tempNode = tempNode.getNextNode();
        }

        return rootNode;
    }


}
