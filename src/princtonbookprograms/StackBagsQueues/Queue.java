/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.StackBagsQueues;

import java.util.Iterator;

/**
 *
 * @author srivemul
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldlast = null;
        if (last != null) {
            oldlast = last;
        }
        last = new Node(item);
        if (isEmpty()) {
            first = last;
        }
        oldlast.next = last;
        N++;
    }

    public Item dequeue() { // Remove item from the beginning of the list.
       
           Item item = null; 
  if(first != null) {
         item = first.item;
        first = first.next;
        }
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
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
        Queue<String> queue = new Queue<>();
        queue.dequeue();
//        stack.push("10");
//        stack.push("20");
//        stack.push("25");
//        stack.push("30");
//        StdOut.println(stack.size());
//        stack.printStack();
//      //  Stdout.
//       StdOut.println();
//        StdOut.println("Poped Element is ="+stack.pop());
//            stack.printStack();
//            StdOut.println();
//        StdOut.println("Poped Element is ="+stack.pop());
//             stack.printStack();
         
           }
      private class ListIterator implements Iterator<Item>
{
private Node current = first;
public boolean hasNext()
{ return current != null; }
public void remove() { }
public Item next()
{
Item item = current.item;
current = current.next;
return item;
}
}


}
