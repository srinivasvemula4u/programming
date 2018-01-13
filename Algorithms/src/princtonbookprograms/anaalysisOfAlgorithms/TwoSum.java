/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.anaalysisOfAlgorithms;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import princtonbookprograms.stopwatch.StopWatch;

/**
 *
 * @author srivemul
 */
public class TwoSum {
    public static int count(int arr[])
    {
       // Arrays.sort(arr);
        int count = 0;
        for(int i=0; i < arr.length; i++)
        {
            for(int j = i+1; j< arr.length; j++) {
            if( arr[i]+arr[j] == 0)
            {
               count++; 
            }
        }
        }
        return count;
    }
      public static void main(String args[])
    {
      //  System.out.println("Enter array length");
        int N = Integer.parseInt("1000000");
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++)
            arr[i] = StdRandom.uniform(-10000, 10000);
        StopWatch watch = new StopWatch();
        StdOut.println(TwoSum.count(arr));
        StdOut.println(watch.elapsedTime() + "seconds");
            
    }
}
