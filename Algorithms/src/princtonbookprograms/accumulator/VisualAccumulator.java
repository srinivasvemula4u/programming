/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.accumulator;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;

/**
 *
 * @author srivemul
 */
public class VisualAccumulator {

    private double Total;
    private int N;

    public VisualAccumulator(int trials, double Max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, Max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double num) {
        N++;
        Total += num;
        StdDraw.setPenColor(Color.GRAY);
        StdDraw.point(N, num);
        StdDraw.setPenColor(Color.RED);
        StdDraw.point(N, Total / N);
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
