/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Stacks;

/**
 *
 * This solution runs with the concept of in-place stack. When element on stack
 * doesn't match to the current number, we add it to stack. when it matches to
 * stack top,we skip numbers until the element match the top of stack and remove
 * the element from stack
 */
public class RemoveAdjancentDuplicates {

    public int removeAdjacentDuplicates(int[] dataArray) {
        int stkPtr = -1;
        int i = 0;
        while (i < dataArray.length) {
            if (stkPtr == -1 || dataArray[i] != dataArray[stkPtr]) {
                stkPtr++;
                dataArray[stkPtr] = dataArray[i];
                i++;
            } else {
                while (i < dataArray.length && dataArray[i] == dataArray[stkPtr]) {
                    i++;
                }
                stkPtr--;
            }
        }
        return stkPtr;
    }

    public static void main(String args[]) {
        RemoveAdjancentDuplicates obj = new RemoveAdjancentDuplicates();
        //int[] A = new int[]{1, 9, 6, 8, 8, 8, 0, 1, 1, 0, 6, 5};
        int[] A = new int[]{1, 5, 6, 8, 8, 8, 0, 1, 1, 0, 6, 5};
        int index = obj.removeAdjacentDuplicates(A);
        for (int i = 0; i <= index; i++) {
            System.out.print(" " + A[i] + " ");
        }
    }
}
