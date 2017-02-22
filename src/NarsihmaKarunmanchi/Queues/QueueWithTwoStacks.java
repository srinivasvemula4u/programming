/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Queues;

import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class QueueWithTwoStacks {

    private Stack<Integer> A = new Stack<Integer>();
    private Stack<Integer> B = new Stack<Integer>();

    public void enQueue(int data) {
        A.push(data);
    }

    public int deQueue() {
        if (B.isEmpty()) {
            while (!A.isEmpty()) {
                B.push(A.pop());
            }
        }
        return B.pop();

    }

    public static void main(String args[])
    {
        QueueWithTwoStacks obj = new QueueWithTwoStacks();
        obj.enQueue(10);
         obj.enQueue(6);
          obj.enQueue(4);
           obj.enQueue(2);
           System.out.println(obj.deQueue());
           System.out.println(obj.deQueue());
           System.out.println(obj.deQueue());
           System.out.println(obj.deQueue());
    }
}
