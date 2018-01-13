/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

/**
 *
 * @author srivemul
 */
public class QucikSort {
    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a, int low, int high)
    {
        if(high <= low) 
            return;
        int j = partition(a,low,high);
        sort(a,low,j-1);
        sort(a,j+1,high);    
        
    }
    private static int partition(Comparable[] a,int low, int high)
    {
        int i = low;
        int j = high+1;
        Comparable piviot = a[low];
        while(true) {
        while(less(a[++i],piviot))
            if(i == high) break; 
        while( less(piviot,a[--j]))
            if( j == low) break;
        if(i >= j)
               break;
        exchange(a,i,j);
        }
        exchange(a,low,j);
        return j;
    }
    private static  boolean less(Comparable a, Comparable b)
    {
        //return a < b;
        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void print(Comparable a[])
    {
        for (Comparable a1 : a) {
            System.out.print(" " + a1);
        }
    }
    public static void main(String args[])
    {
        Comparable[] a = {8,9,1,3,4,6,5,2,7};
        print(a);
        sort(a);
        System.out.println();
         print(a);
    }
       
}
