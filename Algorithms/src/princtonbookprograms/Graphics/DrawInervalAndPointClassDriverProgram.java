/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.Graphics;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author srivemul
 */
public class DrawInervalAndPointClassDriverProgram {
    public static void main(String args[]) {
        double xlo = 0.2;
        double xhi = 0.5;
        double ylo = 0.5;
        double yhi = 0.6;
        int T = 10;
        Interval1D X = new Interval1D(xlo, yhi);
        Interval1D Y = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(X, Y);
        box.draw();
        System.out.println(X.intersects(Y));
                Counter c = new Counter("hits");
        for(int i=0; i< T ; i++)
        {
            double x = Math.random();
            double y = Math.random();
            Point2D point = new  Point2D(x,y);
            
           // System.out.println();
            if(box.contains(point))
                c.increment();
            else 
                point.draw();
                
        }
        StdOut.println(c);
        StdOut.println(box.area());
        int x = 12,y=5;
        Point2D point = new  Point2D(x,y);
        System.out.println(point.x() + " "+ point.y() + " "+point.r()+ " "+point.theta()+" "+Math.atan2(y, x)+ "  "+
                                                      Math.atan(y/x));
      
    }
}
