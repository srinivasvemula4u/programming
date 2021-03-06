/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class MinStack {

    private Stack<Integer> elemStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int data) {
        elemStack.push(data);
        if (minStack.isEmpty() || minStack.peek() >= data) {
            minStack.push(data);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public int pop() {
        if (elemStack.isEmpty()) {
            return -1;
        }
        minStack.pop();
        return elemStack.pop();

    }
    // Optimized versions of push and pop

    public void push2(int data) {
        elemStack.push(data);
        if (minStack.isEmpty() || minStack.peek() > data) {
            minStack.push(data);
        }
        //System.out.println(minStack.size());
    }

    public int pop2() {
        if (elemStack.isEmpty()) {
            return -1;
        }
        if (elemStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        return elemStack.pop();
    }
    //public int ()

    public int getMinimum() {
        return minStack.peek();
    }

    public int getTop() {
        return elemStack.peek();
    }

    public void print() {
        System.out.println("Element Stack data : " + elemStack);
        System.out.println("miniStack data : " + minStack);
    }

    public static void main(String args[]) {
        MinStack stack = new MinStack();
//        stack.push(2);
//        stack.push(6);
//        stack.push(4);
//        stack.push(1);
//        stack.push(5);
        stack.push2(2);
        stack.push2(2);
        stack.push2(6);
        stack.push2(4);
        stack.push2(1);
        stack.push2(5);
        stack.print();

    }
}
