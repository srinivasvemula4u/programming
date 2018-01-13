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
public class TestAccumulator {

    public static void main(String args[]) {
        int T = 1000;
        Accumulator accum = new Accumulator();
        for (int i = 0; i < T; i++) {
            accum.addDataValue(StdRandom.random());

        }
        StdOut.println(accum);
    }

}
