/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

import java.util.Stack;

/**
 *
 * @author srivemul
 */
public class StackApplications {

    public boolean isValidSymbolPattern(String str) {
        Stack<Character> stack = new Stack<>();
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            } else if (str.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
            } else if (str.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
            } else {
                stack.push(str.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public int expressionEvaluation(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if("+".equals(token)){
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push((op1+op2));
            }
            else if("-".equals(token)) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push((op1-op2));
            }
            else if("*".equals(token)) {
               int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push((op1*op2));
                
            } else if("/".equals(token)) {
               int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push((op1/op2));  
            }
            else 
            {
                stack.push(Integer.parseInt(token));
            }
            
        
        }
           return stack.pop();
    }

    public static void main(String[] args) {
        StackApplications obj = new StackApplications();
        System.out.println(obj.isValidSymbolPattern("()(()[(){])"));
        String[] expression = {"1","2","3","*","+","5","-"};
        System.out.println(obj.expressionEvaluation(expression));
    }
    
}
