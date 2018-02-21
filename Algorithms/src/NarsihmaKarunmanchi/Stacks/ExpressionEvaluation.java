/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

import java.util.Stack;

/**
 *
 * @author sv186040
 */
public class ExpressionEvaluation {
    public static int expressionEvaluation(String str) {
         //return 0;
         Stack<Integer> stack = new Stack<>();
         for(int i = 0; i < str.length(); i++) {
             if(str.charAt(i) == '+') {
                 if(stack.isEmpty())
                     return -1;
                 int op2 = stack.pop();
                 int op1 = stack.pop();
                 stack.push(op1+op2);
             } else if(str.charAt(i) == '-') {
                 if(stack.isEmpty())
                     return -1;
                 int op2 = stack.pop();
                 int op1 = stack.pop();
                 stack.push(op1-op2);
             }
             else if(str.charAt(i) == '*') {
                 if(stack.isEmpty())
                     return -1;
                 int op2 = stack.pop();
                 int op1 = stack.pop();
                 stack.push(op1*op2);
             }
             else if(str.charAt(i) == '/') {
                 if(stack.isEmpty())
                     return -1;
                 int op2 = stack.pop();
                 int op1 = stack.pop();
                 stack.push(op1/op2);
             }
             else if(str.charAt(i) == '%') {
                 if(stack.isEmpty())
                     return -1;
                 int op2 = stack.pop();
                 int op1 = stack.pop();
                 stack.push(op1%op2);
             }
             else {
                 stack.push(new Integer(Character.toString(str.charAt(i))));
             }
         }
         return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(expressionEvaluation("123*+5-"));
    }
}
