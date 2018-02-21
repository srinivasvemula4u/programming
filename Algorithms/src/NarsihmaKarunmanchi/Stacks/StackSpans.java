/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
public class StackSpans {

    public int[] getSpanMatrixTraditional(int[] data) {
        int[] spans = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            int span = 1;
            int j = i - 1;
            while (j >= 0 && data[j] <= data[j + 1]) {
                span++;
                j--;
            }
            spans[i] = span;
        }
        return spans;
    }

    public int[] getSpanMatrixOptimized(int[] data) {
        int[] spans = new int[data.length];
        LinkedListStack stack = new LinkedListStack();
        int span = 0;
        for (int i = 0; i < data.length; i++) {
            while (!stack.isEmpty() && (data[i] > data[stack.getTop().getData()])) {
                try {
                    stack.pop();
                } catch (Exception ex) {
                    Logger.getLogger(StackSpans.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //   System.out.println(stack);
            if (stack.isEmpty()) {
                span = -1;
            } else {
                span = stack.getTop().getData();
            }
            spans[i] = i - span;
            stack.push(i);
        }
        return spans;
    }

    public static void main(String args[]) {
        StackSpans stackSpans = new StackSpans();
        int[] result = stackSpans.getSpanMatrixOptimized(new int[]{6, 3, 4, 5, 2});
        for (int val : result) {
            System.out.print(" " + val + " ");
        }
    }

}
