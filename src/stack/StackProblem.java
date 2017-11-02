package stack;

import java.util.Stack;

/**
 * Created by sumon.chatterjee on 17/01/17.
 */
public class StackProblem {

     static Stack<Integer> basic;
     static  Stack<Integer> hold_min;

    public static void main(String[] args) {
//        StackUtil.push(10);
//        StackUtil.push(20);
//        StackUtil.push(30);
//        StackUtil.printStack();
//        StackUtil.pop();


        basic=new Stack<Integer>();
        hold_min=new Stack<Integer>();

        StackUtil.pushItem(20,hold_min,basic);
        StackUtil.pushItem(15,hold_min,basic);
        StackUtil.pushItem(5,hold_min,basic);
        StackUtil.pushItem(10,hold_min,basic);
        StackUtil.pushItem(25,hold_min,basic);
    }



}
