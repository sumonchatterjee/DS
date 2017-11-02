package tree;

import java.util.*;

/**
 * Created by sumon.chatterjee on 13/01/17.
 */
public class BinaryTreeProblems {
    static BinaryTreeNode<Integer> bt;
    

    public static void main(String[] args) {
       /* bt = new BinaryTreeNode<Integer>(10);
        bt.setLeftNode(new BinaryTreeNode<Integer>(20));
        bt.setRightNode(new BinaryTreeNode<Integer>(30));

        bt.getLeftNode().setLeftNode(new BinaryTreeNode<Integer>(15));
        bt.getLeftNode().setRightNode(new BinaryTreeNode<Integer>(40));



                BinaryTreeUtil.printAllNodesFromRootTobottom(bt);*/

                NormalNode n=new NormalNode(1);
                n.left=new NormalNode(2);
                n.right=new NormalNode(3);
                n.left.left=new NormalNode(4);
                n.left.right=new NormalNode(5);


                //BinaryTreeUtil.FindFullNodes(n);
       // BinaryTreeUtil.printAlNodesAtLevel(n,2);
        BinaryTreeUtil.printLeafNodes(n);
        int count=BinaryTreeUtil.countLeafNodes(n);
        System.out.println("leaf node count is " + count);


    }
}
