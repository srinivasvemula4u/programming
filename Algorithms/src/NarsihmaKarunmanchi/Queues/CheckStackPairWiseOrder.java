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
public class CheckStackPairWiseOrder {

    public static boolean checkStackPairWiseOrder(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        boolean pairWiseOrdered = true;
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        // System.out.println(stack);
        while (!stack.isEmpty()) {
            int m = stack.pop();
            queue.add(m);
            if (!stack.isEmpty()) {
                int n = stack.pop();
                queue.add(n);
                if (Math.abs(m - n) != 1) {
                    pairWiseOrdered = false;
                }
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        return pairWiseOrdered;
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(-2);
        stack.push(-3);
        stack.push(11);
        stack.push(10);
        stack.push(5);
        stack.push(6);
        stack.push(20);
        System.out.println(checkStackPairWiseOrder(stack));
    }
}
