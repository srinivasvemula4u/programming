/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.accumulator;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 *
 * @author srivemul
 */
public class TestVisualAccumulator {
    public static void main(String args[])
    {
        int T = 100000;
        VisualAccumulator visualAccum = new VisualAccumulator(T, 1.0);
        for(int i = 0; i < T; i++)
        {
            visualAccum.addDataValue(StdRandom.random());
        }
        StdOut.println(visualAccum);
    }
}
