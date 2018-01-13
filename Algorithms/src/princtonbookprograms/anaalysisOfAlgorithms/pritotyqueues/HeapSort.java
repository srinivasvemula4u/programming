/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms.pritotyqueues;

/**
 *
 * @author srivemul
 */
public class HeapSort {
    public static void sort(Comparable[] a)
    {
        int N = a.length;  
        Comparable[] A = new Comparable[N+1];
        for( int i = 0; i < a.length; i++)
        {
            A[i+1] = a[i];
        }
       // int templen = N;
        for(int k = N/2; k >=1; k--)
        {
            sink(A,k,N);
        }
      // print(A);
        while( N > 1)
        {
            exchange(A, 1, N--);
            sink(A, 1, N);
             print(A);
        }
    }
    public static void sink(Comparable[] a, int k, int N)
    {
        while( 2*k <= N )
        {
            int j = 2*k;
         //  j--;
            if( j < N  && less(a,j,j+1))
            {
                j++;
            }
            if( !less(a,k,j))
                break;
            exchange(a,j,k);
            k =j;
        }
    }

    private static boolean less(Comparable[] a,int i, int j) {
       return a[i].compareTo(a[j]) < 0;
    }

    private static void exchange(Comparable[] a,int i, int j) {
       Comparable temp = a[j];
       a[j] = a[i];
       a[i] = temp;
    }
    public static void print(Comparable[] a)
    {
         for (Comparable k : a) {
            System.out.print(k + " ");
        }
         System.out.println();
    }
    public static void main(String args[])
    {
      //  Comparable[] a  = {"S","O","R","T","E","X", "A", "M", "P", "L", "E"}; 
           Comparable[] a = {0, 5, 1, 3, 4, 6, 8, 2, 7};
        sort(a);
      //  print(a);
    }
}
