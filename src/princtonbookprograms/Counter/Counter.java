package princtonbookprograms.Counter;


import princtonbookprograms.CounterInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
public class Counter implements CounterInterface {
    private final String name;
    private int count;
    public Counter(String Id) {
        name = Id;
        count = 0;
    }
    @Override
    public void increment() {
        count++;
    }

    @Override
    public int tally() {
        return count;
    }
  
    @Override
    public String toString() {
        return count + "  " + name;
    }  
}

