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
public class ArrayWithThreeStacks {

    private int[] dataArray;

    public int[] getDataArray() {
        return dataArray;
    }
    private int size;
    private int topOne;
    private int topTwo;
    private int baseThree;
    private int topThree;

    public ArrayWithThreeStacks(int size) {
        if (size < 3) {
            throw new IllegalStateException("Size can not be < 3");
        }
        dataArray = new int[size];
        this.size = size;
        topOne = -1;
        topTwo = size;
        baseThree = size / 2;
        topThree = baseThree;
    }

    public void push(int stackId, int data) {
        if (stackId == 1) {
            if (topOne + 1 == baseThree) {
                if (stack3IsRightShiftable()) {
                    shiftStack3ToRight();
                    dataArray[++topOne] = data;
                } else {
                    throw new StackOverflowError("Stack1 is full");
                }
            } else {
                dataArray[++topOne] = data;
            }
        } else if (stackId == 2) {
            if (topTwo - 1 == topThree) {
                if (stack3IsLeftShiftable()) {
                    shiftStack3ToLeft();
                    dataArray[--topTwo] = data;
                } else {
                    throw new StackOverflowError("Stack2 is full");
                }
            } else {
                dataArray[--topTwo] = data;
            }
        } else if (stackId == 3) {
            if (topThree + 1 == topTwo) {
                if (stack3IsLeftShiftable()) {
                    shiftStack3ToLeft();
                    dataArray[++topThree] = data;
                } else {
                    throw new StackOverflowError("Stack3 is full");
                }
            } else {
                dataArray[++topThree] = data;
            }
        } else {
            return;
        }
    }

    private boolean stack3IsRightShiftable() {
        if (topThree + 1 < topTwo) {
            return true;
        }
        return false;
    }

    private void shiftStack3ToRight() {
        for (int i = topThree + 1; i >= baseThree + 1; i--) {
            dataArray[i] = dataArray[i - 1];
        }
        dataArray[baseThree++] = -1;
        topThree++;
    }

    private boolean stack3IsLeftShiftable() {
        if (topOne + 1 < baseThree) {
            return true;
        }
        return false;
    }

    private void shiftStack3ToLeft() {
        for (int i = baseThree - 1; i < topThree; i++) {
            dataArray[i] = dataArray[i + 1];
        }
        dataArray[topThree--] = -1;
        baseThree--;
    }

    public int pop(int stackId) {
        if (stackId == 1) {
            if (topOne == -1) {
                throw new EmptyStackException();
            }
            int val = dataArray[topOne];
            dataArray[topOne--] = -1;
            return val;
        } else if (stackId == 2) {
            if (topTwo == this.size) {
                throw new EmptyStackException();
            }
            int val = dataArray[topTwo];
            dataArray[topTwo++] = -1;
            return val;
        } else if (stackId == 3) {
            if (topThree == baseThree) {
                throw new EmptyStackException();
            }
            int val = dataArray[topThree];
            dataArray[topThree--] = -1;
            return val;
        }
        return -1;

    }

    public boolean isEmpty(int stackId) {
        if (stackId == 1) {
            if (topOne == -1) {
                return true;
            }
            return false;
        } else if (stackId == 2) {
            if (topTwo == this.size) {
                return true;
            }
            return false;
        } else if (stackId == 3) {
            if (baseThree == topThree) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public int peek(int stackId) {
        if (stackId == 1) {
            return dataArray[topOne];
        } else if (stackId == 2) {
            return dataArray[topTwo];
        } else if (stackId == 3) {
            return dataArray[topThree];
        } else {
            return -1;
        }
    }
}
