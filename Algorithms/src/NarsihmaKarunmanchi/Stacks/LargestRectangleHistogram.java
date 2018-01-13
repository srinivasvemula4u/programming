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
public class LargestRectangleHistogram {
    public int getMaxArea(int[] dataArray)
    {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while(i < dataArray.length)
        { 
            if(stack.isEmpty() || dataArray[stack.peek()] <= dataArray[i])
            {
                stack.push(i++);
            }
            else 
            {
                int top = stack.pop();
                maxArea = Math.max(maxArea, dataArray[top]*(stack.isEmpty() ? i : i - stack.peek() -1));
            }
            while(!stack.isEmpty())
            {
                int top = stack.pop();
                maxArea = Math.max(maxArea, dataArray[top]*(stack.isEmpty() ? i : i - stack.peek() -1));
            }
        }
        return maxArea;
    }
    public static void main(String args[]) {
        LargestRectangleHistogram largestRectangleHistogram = new LargestRectangleHistogram();
        int result = largestRectangleHistogram.getMaxArea(new int[]{3, 2, 5, 6, 1,4,4});
        
            System.out.print(" " + result +" ");
        
    }
}
