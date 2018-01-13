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
public class ReverseStack {

    public void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }
//    public void reverseNonRecursive()
//    {
//        for(int i= 0; i < stack.size())
//    }

    public void insertAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }

    public static void main(String args[]) {
        ReverseStack obj = new ReverseStack();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("Stack data before reverse : " + stack);
        obj.reverseStack(stack);
        System.out.println("Stack data after reverse : " + stack);
        obj.insertAtBottom(stack, 6);
        System.out.println("Stack data after insert at bottom : " + stack);
       
    }
}
