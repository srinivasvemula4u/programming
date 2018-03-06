/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Queues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class ReverseofQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }

    public static void main(String args[]) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(8);
        queue.add(6);
        queue.add(4);
        queue.add(2);
        Queue<Integer> result = reverseQueue(queue);
        System.out.println(result);
    }
}
