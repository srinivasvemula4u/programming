/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class ReverseQueueWithFirstKElements {

    public static void revereseQueueWithFirstKElements(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
             queue.add(stack.pop());
        }
        for(int i = 0; i < queue.size()-k; i++)
        {
            queue.add(queue.remove());
        }
        
    }
     public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=11; i<= 20; i++)
            queue.add(i);
        System.out.println(queue);
       revereseQueueWithFirstKElements(queue,4);
        System.out.println(queue);
    }
}
