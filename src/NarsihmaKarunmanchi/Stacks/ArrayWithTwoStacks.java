/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

import java.util.EmptyStackException;

/**
 *
 * @author srivemul
 */
public class ArrayWithTwoStacks {

    private int[] dataArray;

    public int[] getDataArray() {
        return dataArray;
    }
    private int size;
    private int topOne;
    private int topTwo;

    public ArrayWithTwoStacks(int size) {
        if (size < 2) {
            throw new IllegalStateException("Size < 2 is no permissible");
        }
        dataArray = new int[size];
        this.size = size;
        topOne = -1;
        topTwo = size;
    }

    public void push(int stackId, int data) {
        if (topTwo == topOne + 1) {
            throw new StackOverflowError("Stack One is full");
        }
        if (stackId == 1) {
            dataArray[++topOne] = data;

        } else if (stackId == 2) {
            dataArray[--topTwo] = data;
        } else {
            return;
        }
    }
    public int pop(int stackId)
    {
        if(stackId == 1)
        {
            if(topOne == -1)
                throw new EmptyStackException();
            int toPop = dataArray[topOne];
            dataArray[topOne--] = -1;
            return toPop;
        }
        else  if(stackId == 2)
        {
            if(topOne == size)
                throw new EmptyStackException();
            int toPop = dataArray[topTwo];
            dataArray[topTwo++] = -1;
            return toPop;
        }
        else return -1;
    }
    public boolean isEmpty(int stackId)
    {
        if(stackId == 1)
        {
            return topOne == -1;
        }
        else if(stackId == 2)
        {
            return topTwo == this.size;
        }
        else return false;
    }
    public int getTopValue(int stackId)
    {
          if(stackId == 1)
          {
              if(topOne == -1)
                  throw new EmptyStackException();
              return dataArray[topOne];
          }
          else if(stackId == 2)
          {
              if(topTwo == this.size)
                  throw new EmptyStackException();
              return dataArray[topTwo];
              
          }
          else return -1;
    }
    public static void main(String args[]) {
        ArrayWithTwoStacks arrayWithTwoStacks = new ArrayWithTwoStacks(10);
        arrayWithTwoStacks.push(1, 1);
        arrayWithTwoStacks.push(2, 2);
        arrayWithTwoStacks.push(1, 3);
        arrayWithTwoStacks.push(2, 4);
        arrayWithTwoStacks.push(2, 5);
          for(int val : arrayWithTwoStacks.getDataArray())
        System.out.print (" "+val);
          System.out.println (" ");
        arrayWithTwoStacks.pop(2);
        for(int val : arrayWithTwoStacks.getDataArray())
        System.out.print (" "+val);
    }
    
}
