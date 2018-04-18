
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
public class FindingMinimumElementInStack {

    Stack<Integer> stack;
    Integer minElement;

    // Constructor
    public FindingMinimumElementInStack() {
        stack = new Stack<>();
    }

    public int getMinimum() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return minElement;
        }
    }

    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        Integer temp = stack.peek();

        if (temp < minElement) {
            return minElement;
        } else {
            return temp;
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        Integer temp = stack.pop();
        int temp2 = minElement;
        if (temp < minElement) {
            minElement = 2 * minElement - temp;
        }
        return temp2;
    }

    // Insert new number into MyStack
    void push(Integer num) {
        if (stack.isEmpty()) {
            minElement = num;
            stack.push(num);
            return;
        }
        if (num < minElement) {
            stack.push(2 * num - minElement);
            minElement = num;
        } else {
            stack.push(num);
        }
    }

    public static void main(String[] args) {
        FindingMinimumElementInStack stack = new FindingMinimumElementInStack();
        stack.push(5);
        stack.push(6);
        stack.push(4);
        System.out.println(stack.getMinimum());
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.getMinimum());
        System.out.println(stack.pop());
        System.out.println(stack.getMinimum());
        System.out.println(stack.pop());
        System.out.println(stack.getMinimum());
        System.out.println(stack.peek());
    }
}
