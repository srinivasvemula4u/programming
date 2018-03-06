/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author srivemul
 */
public class OneStackWithTwoQueues {

    private Queue<Integer> Q1 = new LinkedList<Integer>();
    private Queue<Integer> Q2 = new LinkedList<Integer>();

    public void push(int data) {
        if (Q1.isEmpty()) {
            Q2.offer(data);
        } else {
            Q1.offer(data);
        }
    }

    public int pop() {
        int i = 0, size;
        if (Q2.isEmpty()) {
            size = Q1.size();
            while (i < size - 1) {
                Q2.offer(Q1.poll());
                i++;
            }
            return Q1.poll();
        } else {
            size = Q2.size();
            while (i < size - 1) {
                Q1.offer(Q2.poll());
                i++;
            }
            return Q2.poll();
        }
    }

    public static void main(String args[]) {
        OneStackWithTwoQueues obj = new OneStackWithTwoQueues();
        obj.push(10);
        obj.push(6);
          System.out.println(obj.pop());
        obj.push(4);
        obj.push(2);
        //System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
