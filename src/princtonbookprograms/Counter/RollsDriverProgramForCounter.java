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
public class RollsDriverProgramForCounter {
    public static void main(String args[])
    {
        int T = 1000;
        int SIDES = 6;
        Counter[] rolls;
        rolls = new Counter[SIDES+1];
        for(int i=1; i<= SIDES; i++)
        {
            System.out.println(i);
            rolls[i] = new Counter(i +"'s");
            
        }
        for(int i = 0; i < T; i++)
        {
            int result = StdRandom.uniform(1, SIDES+1); 
            rolls[result].increment();
        }
        for (int i = 1; i <= SIDES; i++)
                    StdOut.println(rolls[i]);
    }
}
