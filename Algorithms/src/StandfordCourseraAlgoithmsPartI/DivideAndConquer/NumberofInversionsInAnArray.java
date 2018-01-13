/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandfordCourseraAlgoithmsPartI.DivideAndConquer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author srivemul
 */
public class NumberofInversionsInAnArray {

    private static Comparable[] aux;
    private static int count;

    public static void merge(Comparable a[], int low, int mid, int high) {
        // copy to aux[]
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        // merge back to a[]
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                 count++;
                a[k] = aux[j++];
                // for Finding the multiple inversions coverage by single digit.
              //  Ex: 1,3,5,2,4,6 here when 2 is sorted it will cover both (3,2) and (5,2)
              
                for(int l = i+1; l <= mid; l++)
                {
                    if(a[k].compareTo(aux[l]) < 0)
                        count++;
                }
                // count= count + (mid-(i))
            } else {
                a[k] = aux[i++];
               
            }
        }

    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void sort(Comparable a[]) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable a[], int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static void count() {
        System.out.println(count);
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
//        Integer[] arr = {1, 3, 5, 2, 4, 8,7,6};
//        sort(arr);
//        for(int a :arr)
//        System.out.println(a);
//        count();
//        InputStream is = new FileInputStream("input.txt");
//        int size = is.available();
//          File file = new File("input.txt");
//          FileReader fileReader = new FileReader(file);
//          BufferedReader bufferReader = new BufferedReader(fileReader);
//          String line;
//        
             Scanner scanner = new  Scanner(new File("D:\\Course Era\\Algorithms\\src\\StandfordCourseraAlgoithmsPartI\\DivideAndConquer\\input.txt")).useDelimiter("\\n");
             List<Integer> temps = new ArrayList<>();
             while(scanner.hasNext())
             {
                 temps.add(Integer.parseInt(scanner.next()));
             }
             Integer[] arr  = temps.toArray(new Integer[0]);
              sort(arr);
              count();
        
    }
}
