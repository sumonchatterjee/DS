package tree;

/**
 * Created by sumon.chatterjee on 16/01/17.
 */
public class BinaryTreeUtil {

    public static void printAllNodesFromRootTobottom(BinaryTreeNode root) {

        int path[] = new int[1000];
        printAllNodes(root, path, 0);

    }


    static void printAllNodes(BinaryTreeNode root, int[] path, int startCount) {
        if (root == null)
            return;

        path[startCount] = (int) root.getData();
        startCount++;

        if (root.getLeftNode() == null && root.getRightNode() == null) {
            //print
            printN(path, startCount);
        } else {
            printAllNodes(root.getLeftNode(), path, startCount);
            printAllNodes(root.getRightNode(), path, startCount);
        }

    }


    static void printN(int[] path, int count) {
        int i;
        for (i = 0; i < count; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println("");
    }


    public static void FindFullNodes(NormalNode root) {
        // do the traversal and print all the nodes which has left and right
        // child
        if (root != null) {
            FindFullNodes(root.left);
            if (root.left != null && root.right != null) {
                System.out.print(root.data + " ");
            }
            FindFullNodes(root.right);
        }
    }


    // Recursive Solution
    // print leaf nodes only
    public static void printLeafNodes(NormalNode node) {

        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.printf("%d ", node.data);
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }


    //to print all nodes at a given
    public static void printAlNodesAtLevel(NormalNode node, int level) {
        if (node == null)
            return;

        if (level == 1) {
            System.out.println("data " + node.data);
        } else {
            printAlNodesAtLevel(node.left, level - 1);
            printAlNodesAtLevel(node.right, level - 1);
        }

    }

    //count all leaf nodes in a binary tree
    public static int countLeafNodes(NormalNode n){
        if(n==null)
            return 0;

        if(n.left ==null && n.right==null)
            return 1;

        else
            return countLeafNodes(n.left)+countLeafNodes(n.right);


    }






}
