/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.StackBagsQueues;

import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

/**
 *
 * @author srivemul
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item>{

    private Node first;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node(item);
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        Node node = first;
        first = first.next;
        Item item = node.item;
        node = null;
        N--;
        return item;
    }
    public void printStack()
    {
        for(Node temp = first; temp!= null; temp = temp.next)
        {
            StdOut.print(temp.item + " ");
        }
    }

    @Override
    public Iterator<Item> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Node {

        Item item;
        Node next;

        public Node(Item item) {
            this.item = item;
            next = null;
        }
      
    }
    
    public static void main(String args[])
    {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(25);
//        stack.push(30);
//        StdOut.println(stack.size());
//        stack.printStack();
//      //  Stdout.
//       StdOut.println();
//        StdOut.println("Poped Element is ="+stack.pop());
//            stack.printStack();
//            StdOut.println();
//        StdOut.println("Poped Element is ="+stack.pop());
//             stack.printStack();
        Stack<String> stack = new Stack<>();
        stack.push("10");
        stack.push("20");
        stack.push("25");
        stack.push("30");
        StdOut.println(stack.size());
        stack.printStack();
      //  Stdout.
       StdOut.println();
        StdOut.println("Poped Element is ="+stack.pop());
            stack.printStack();
            StdOut.println();
        StdOut.println("Poped Element is ="+stack.pop());
             stack.printStack();
         
           }

}
