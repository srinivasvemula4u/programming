/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.accumulator;

/**
 *
 * @author srivemul
 */
public class Accumulator {
    
    private double Total;
    private int  N;
    public Accumulator()
    {
        
    }
    public void addDataValue(double num)
    {
        Total += num;
        N++;
    }
    public double mean() {
        return Total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): "
                + String.format("%7.5f", mean());
    }
    
}
