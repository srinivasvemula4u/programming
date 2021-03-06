/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

import java.util.Stack;

/**
 *
 * @author sv186040 Sorting stack in ascending order
 */
public class SortingStack {

    public static Stack<Integer> sortingStack(Stack<Integer> stk) {
        // return null;
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

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(4);
        System.out.println("before sort" + stack.toString());
        System.out.println("After sort " + sortingStack(stack).toString());
    }
}
