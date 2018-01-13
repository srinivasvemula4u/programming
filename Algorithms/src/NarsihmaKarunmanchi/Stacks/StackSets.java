/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

import java.util.ArrayList;

/**
 *
 * @author srivemul
 */
class StackForStackSets {

    private int top = -1;
    private int capacity;
    private int[] dataArray;

    public StackForStackSets(int capacity) {
        this.capacity = capacity;
        dataArray = new int[this.capacity];
    }

    public void push(int value) {
        dataArray[++top] = value;
    }

    public int pop() {
        int val = dataArray[top];
        dataArray[top--] = -1;
        return val;
    }

    public int size() {
        return top + 1;
    }

    public boolean isAtCapacity() {
        return capacity == top + 1;
    }

    @Override
    public String toString() {
        String str = "";
        str += "[";
        int index = top;
        while (index >= 0) {
            str += " " + dataArray[index--];
        }
        str += " ]";
        return str;
    }
}

public class StackSets {

    private int threshold;
    private ArrayList<StackForStackSets> listofstackSets = new ArrayList<StackForStackSets>();

    public StackSets(int threshold) {
        this.threshold = threshold;
    }

    public StackForStackSets getLastStack() {
        int size = listofstackSets.size();
        if (size <= 0) {
            return null;
        }
        return listofstackSets.get(size - 1);
    }

    public StackForStackSets getNthStack(int n) {
        int size = listofstackSets.size();
        if (size < n) {
            return null;
        }
        return listofstackSets.get(n - 1);
    }

    public void push(int value) {
        StackForStackSets lastStack = this.getLastStack();
        if (lastStack == null) {
            lastStack = new StackForStackSets(threshold);
            lastStack.push(value);
            listofstackSets.add(lastStack);
        } else if (!lastStack.isAtCapacity()) {
            lastStack.push(value);
        } else {
            StackForStackSets newLastStack = new StackForStackSets(threshold);
            newLastStack.push(value);
            listofstackSets.add(newLastStack);
        }
    }

    public int pop() {
        StackForStackSets lastStack = getLastStack();
        int value = 0;
        if (lastStack != null && lastStack.size() != 0) {
            value = lastStack.pop();
        }
        if (lastStack != null && lastStack.size() == 0) {
            listofstackSets.remove(listofstackSets.size() - 1);
        }
        return value;
    }

    public int pop(int nth) {
        StackForStackSets nThStack = getNthStack(nth);
        int value = 0;
        if (nThStack != null && nThStack.size() != 0) {
            value = nThStack.pop();
            if (nThStack.size() == 0) {
                listofstackSets.remove(nth - 1);
            }
        }
        return value;
    }
    public String toString()
    {
        String str="";
        StackForStackSets stack = null;
        for(int i = 0; i < listofstackSets.size(); i++)
        {
            stack = listofstackSets.get(i);
            str += "Stack "+(i+1) +" has "+ stack.toString() + "\n";
        }
        return str;
    }
    public static void main(String args[])
    {
        StackSets stacks = new  StackSets(3);
        stacks.push(10); stacks.push(9); stacks.push(8); stacks.push(7);
         stacks.push(6); stacks.push(5); stacks.push(4); stacks.push(3);
          stacks.push(2);
          System.out.println(stacks);
         
    }

}
