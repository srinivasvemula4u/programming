/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.vector;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author srivemul
 */
public class Vector {

    private final double[] coords;

    public Vector(double[] a) {
        coords = new double[a.length];
        //coords = a;
        System.arraycopy(a, 0, coords, 0, a.length);
    }

    @Override
    public String toString() {
        return "Point is " + coords[0] + " " + coords[1];
    }

    public static void main(String args[]) {
        double[] a = {3.0, 4.0};
        Vector vectorObj = new Vector(a);
        StdOut.println(vectorObj);
        a[0] = 1.0;
        StdOut.println(vectorObj);
    }

}
