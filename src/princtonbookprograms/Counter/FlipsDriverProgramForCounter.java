/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.Counter;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 *
 * @author srivemul
 */
public class FlipsDriverProgramForCounter {
     public static void main(String[] args) {
        
        Counter heads = new Counter("head");
        Counter tails = new Counter("tails");
        int T = Integer.parseInt("10000000");
        for(int i=0; i < T; i++) {
            if(StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tails.increment();
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        if( d!= 0) {
            StdOut.println("Delta = " +Math.abs(d));
        }
      
    }
}
