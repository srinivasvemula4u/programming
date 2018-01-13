/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.stopwatch;

/**
 *
 * @author srivemul
 */
public class StopWatch {
    private final long start;

    public StopWatch() {;
        this.start = System.currentTimeMillis();
    }
    public double elapsedTime()
    {
        long now = System.currentTimeMillis();
        double timeElapsed = (now - start)/1000.0;
        return timeElapsed;
    }
    
}
