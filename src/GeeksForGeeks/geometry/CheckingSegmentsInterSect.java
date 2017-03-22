/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.geometry;

/**
 *
 * @author srivemul
 */
/*
Given two line segments (p1, q1) and (p2, q2), find if the given line segments intersect with each other.
Orientation of an ordered triplet of points in the plane can be
–counterclockwise
–clockwise
–colinear

How is Orientation useful here?
Two segments (p1,q1) and (p2,q2) intersect if and only if one of the following two conditions is verified

1. General Case:
– (p1, q1, p2) and (p1, q1, q2) have different orientations and
– (p2, q2, p1) and (p2, q2, q1) have different orientations.


*/


public class CheckingSegmentsInterSect {

    /**
     * @param args the command line arguments
     */
    public static int findOrientation(Point p1, Point p2, Point p3) {
        int val = (p2.y - p1.y) * (p3.x - p2.x) - (p3.y - p2.y) * (p2.x - p1.x);
        if (val == 0) {
            return 0;
        } else if (val < 0) {
            return 1;
        } else {
           return 2;
        }
    }
    public static boolean onSegment(Point p,Point q,Point r) {
        if((q.x <= Math.max(p.x, r.x)) && (q.x >= Math.max(p.x, r.x)) &&
                (q.y <= Math.max(p.y, r.y)) && (q.y>= Math.min(p.y, q.y)))
            return true;
        return false;
    }
    public static boolean doInterSect(Point p1,Point q1, Point p2, Point q2) {
        int o1 = findOrientation(p1, q1, p2);
        int o2 = findOrientation(p1, q1, q2);
        int o3 = findOrientation(p2, q2, p1);
        int o4 = findOrientation(p2, q2, q1);
        
        // general case 
        if( (o1 != o2) && (o3 != o4)) 
            return true;
        // p1, q1 and p2 are colinear and p2 lies on segment p1q1
        if( (o1 == 0) && onSegment(p1, p2, q1)) return true;
         // p1, q1 and p2 are colinear and q2 lies on segment p1q1
        if( (o2 == 0) && onSegment(p1, q2, q1)) return true;
        // p2, q2 and p1 are colinear and p1 lies on segment p2q2
        if((o3 == 0) && onSegment(p2, p1, q2)) return true;
        // p2, q2 and q1 are colinear and q1 lies on segment p2q2
        if (o4 == 0 && onSegment(p2, q1, q2)) return true;
       return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(doInterSect(new Point(1,1), new Point(10, 1), new Point(1,2), new Point(10,2)));
         System.out.println(doInterSect(new Point(10,0), new Point(0, 10), new Point(0,0), new Point(10,10)));
    }
    
}
