package stack;


import java.util.Stack;

/**
 * Created by sumon.chatterjee on 17/01/17.
 */
public class StackUtil {

    static StackNode head;

    public static void push(int data){
         StackNode val=new StackNode (data,null);
         val.setNextNode(head);
         head=val;

    }


    public static void pop(){
        StackNode val=head;
        if(val==null)
            return;

        if(val.getNextNode()!=null) {
            head = val.getNextNode();
            System.out.println("element popped is "+val.getData());
            val=null;
        }

    }



    public static void printStack(){
        System.out.println("printing list");
        StackNode ds= head;
        if(head==null)
            return;

        while(ds!=null){
            System.out.println(""+ds.getData());
            ds=ds.getNextNode();
        }
    }




    public static int getmin(Stack<Integer> hold_min){
        if(hold_min.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else{
            return hold_min.peek();
        }
    }


    public static void pushItem(int newItem,Stack<Integer> hold_min,Stack<Integer> basic){
        if(newItem<=getmin(hold_min)){
            hold_min.push(newItem);
        }
        basic.push(newItem);
    }




    }





