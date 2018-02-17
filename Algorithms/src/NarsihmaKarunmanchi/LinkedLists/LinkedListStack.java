/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
public class LinkedListStack {

    private int length;
    private LinkedListNode top;

    public LinkedListNode getTop() {
        return top;
    }

    public LinkedListStack() {
        length = 0;
        top = null;
    }

    public synchronized void push(int data) {
        LinkedListNode node = new LinkedListNode(data);
        node.setNext(top);
        top = node;
        length++;
    }

    public synchronized int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        LinkedListNode node = top;
        top = top.getNext();
        length--;
        return node.getData();
    }

    public synchronized boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return top.getData();
    }

    public String toString() {
        String result = "";
        LinkedListNode current = top;
        while (current != null) {
            result = result + current.getData() + "\n";
            current = current.getNext();
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        try {
            stack.pop();
            stack.pop();
        } catch (Exception ex) {
            Logger.getLogger(LinkedListStack.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(stack);
    }
}
