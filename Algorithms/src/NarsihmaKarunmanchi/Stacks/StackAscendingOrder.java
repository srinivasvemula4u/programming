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
public class StackAscendingOrder {

    public static Stack<Integer> sortAscending(Stack<Integer> stk) {
        Stack<Integer> rstk = new Stack<>();
        while (!stk.isEmpty()) {
            int temp = stk.pop();
            while (!rstk.isEmpty() && rstk.peek() > temp) {
                stk.push(rstk.pop());
            }
            rstk.push(temp);
        }
        return rstk;
    }
    public static Stack<Integer> sortDscending(Stack<Integer> stk) {
        Stack<Integer> rstk = new Stack<>();
        while (!stk.isEmpty()) {
            int temp = stk.pop();
            while (!rstk.isEmpty() && rstk.peek() < temp) {
                stk.push(rstk.pop());
            }
            rstk.push(temp);
        }
        return rstk;
    }

    public static void main(String args[]) {
        Stack<Integer> sourceStack = new Stack<>();
        sourceStack.push(3);
        sourceStack.push(2);
        sourceStack.push(5);
        sourceStack.push(6);
        sourceStack.push(1);
        sourceStack.push(4);
        //sourceStack.push(4);
       System.out.println(sourceStack);
        System.out.println(sortDscending(sourceStack));
    }

}
