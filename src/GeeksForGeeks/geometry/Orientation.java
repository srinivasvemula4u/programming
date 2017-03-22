/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.geometry;

/**
 *
 * @author srivemul
 *
 *
 * Orientation of an ordered triplet of points in the plane can be
 * counterclockwise clockwise colinear If orientation of (p1, p2, p3) is
 * collinear, then orientation of (p3, p2, p1) is also collinear. If orientation
 * of (p1, p2, p3) is clockwise, then orientation of (p3, p2, p1) is
 * counterclockwise and vice versa is also true. Slope of line segment (p1, p2):
 * σ = (y2 - y1)/(x2 - x1) Slope of line segment (p2, p3): τ = (y3 - y2)/(x3 -
 * x2)
 *
 * If σ < τ, the orientation is counterclockwise (left turn)
 * If  σ = τ, the orientation is collinear
 * If  σ > τ, the orientation is clockwise (right turn)
 *
 * Using above values of σ and τ, we can conclude that, the orientation depends
 * on sign of below expression: * (y2 - y1)*(x3 - x2) - (y3 - y2)*(x2 - x1)
 *
 * Above expression is negative when σ < τ, i.e., counterclockwise
 * Above expression is 0 when σ = τ, i.e., collinear
 * Above expression is positive when σ > τ, i.e., clockwise
 */
class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Orientation {

    /**
     * @param args the command line arguments
     */
    public static void findOrientation(Point p1, Point p2, Point p3) {
        int val = (p2.y - p1.y) * (p3.x - p2.x) - (p3.y - p2.y) * (p2.x - p1.x);
        if (val == 0) {
            System.out.println("Points are in colinear");
        } else if (val < 0) {
            System.out.println("Points are in counter clockwise");
        } else {
            System.out.println("Points are in  clockwise");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        findOrientation(new Point(0, 0), new Point(4, 4), new Point(1, 2));

    }

}
