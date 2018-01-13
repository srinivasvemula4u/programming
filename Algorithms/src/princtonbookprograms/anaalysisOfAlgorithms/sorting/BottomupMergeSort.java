/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms.sorting;

/**
 *
 * @author srivemul
 */
public class BottomupMergeSort {
    private static Comparable[] aux; // auxiliary array for merges
// See page 271 for merge() code.
    public static void merge(Comparable a[],int low, int mid,int high)
    {
        int i = low;
        int j = mid+1;
     //   Comparable[] aux = new Comparable[a.length];
        for(int k = 0; k < high; k++)
            aux[k] = a[k];
        for(int k=0; k<high; k++)
        { 
            if( i > mid) a[k] = aux[j++];
            else if(j > high)  a[k] = aux[i++];
            else if( less(aux[i], aux[j])) a[k] = aux[i++];
            else 
                a[k] = aux[j++];
        }
     }
    public static void Sort(Comparable[] a)
    {
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1; sz < N; sz = sz+sz)
        {
            for(int lo = 0; lo < N-sz; lo += sz+sz)
            {
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

    private static boolean less(Comparable comparable, Comparable comparable0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
