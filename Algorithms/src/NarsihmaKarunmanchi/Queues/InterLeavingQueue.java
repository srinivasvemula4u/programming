/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 *  Given a queue of integers,rearrange the elements by interleaving the first 
 *  half of the list with second half of the list.
 */
public class InterLeavingQueue {

    public static void interLeavingQueue(Queue<Integer> queue) throws Exception {
        Stack<Integer> stack = new Stack<>();
        if (queue.size() % 2 != 0) {
            throw new Exception("Queue size is odd. It should be Even!");
        }
        int halfSize = queue.size()/2;
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.remove());
        }
         //  System.out.println(queue);
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < halfSize; i++) {
            queue.add(queue.remove());
        }
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
            queue.add(queue.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=11; i<= 20; i++)
            queue.add(i);
        System.out.println(queue);
        try {
            interLeavingQueue(queue);
        } catch (Exception ex) {
            Logger.getLogger(InterLeavingQueue.class.getName()).log(Level.SEVERE, null, ex);
        }
          System.out.println(queue);
    }
}
