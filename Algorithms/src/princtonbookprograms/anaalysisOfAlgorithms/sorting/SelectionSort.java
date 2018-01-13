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
public class SelectionSort {
    
    public static void sort(Comparable[] a)
    {
        int min = 0;
        int N = a.length;
        for(int i=0; i < a.length; i++)
        {
            min = i;
            for(int j = i+1; j < N; j++)
            {
             if(less(a[j],a[min])) min = j; 
            }
            exchange(a,i,min);
        }
    }

    private static boolean less(Comparable comparable, Comparable comparable0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void exchange(Comparable[] a, int i, int min) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
