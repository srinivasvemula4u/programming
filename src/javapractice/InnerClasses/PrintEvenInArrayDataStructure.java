/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.InnerClasses;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class PrintEvenInArrayDataStructure {
    private int[] arrOfInts;
    //private int 
    public PrintEvenInArrayDataStructure(int size) {
        arrOfInts = new int[size];
        for(int i =0; i < size; i++) {
            arrOfInts[i] = i;
        }
    }
    void printEvent() {
        DataStructureIterator itr = new EventIterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    } 
    interface DataStructureIterator extends java.util.Iterator<Integer> {
        
    }
    private class EventIterator implements DataStructureIterator {
         private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return (nextIndex <= arrOfInts.length-1); 
        }

        @Override
        public Integer next() {
          Integer retValue = arrOfInts[nextIndex];
           nextIndex += 2;
           return retValue;
        }
        
    }
    public static void main(String[] args) {
        PrintEvenInArrayDataStructure obj = new PrintEvenInArrayDataStructure((new Scanner(System.in)).nextInt());
        obj.printEvent();
    }
}
