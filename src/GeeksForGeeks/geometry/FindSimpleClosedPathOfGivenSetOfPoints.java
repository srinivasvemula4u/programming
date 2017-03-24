/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.geometry;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author srivemul
 */
/*
The idea is to use sorting.

1) Find the bottom-most point by comparing y coordinate of all points. 
If there are two points with same y value, then the point with smaller x coordinate value is considered. 
Put the bottom-most point at first position.
2 ) Consider the remaining n-1 points and sort them by polor angle in counterclockwise order around points[0]. 
If polor angle of two points is same, then put the nearest point first.
3) Traversing the sorted array (sorted in increasing order of angle) yields simple closed path.
 */
public class FindSimpleClosedPathOfGivenSetOfPoints {

    /**
     * @param args the command line arguments
     */
    public static int findOrientation(Point p1, Point p2, Point p3) {
        int val = (p2.y - p1.y) * (p3.x - p2.x) - (p3.y - p2.y) * (p2.x - p1.x);
        if (val == 0) {
            return 0;
        } else if (val > 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int dist(Point p, Point q) {
        return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
    }

    public static void findClosedPathSetOfPoints(Point[] points) {
        int ymin = points[0].y, min = 0;
        for (int i = 1; i < points.length; i++) {
            if ((points[i].y < ymin) || ((ymin == points[i].y)&& (points[i].x < points[min].x))) {
                ymin = points[i].y;
                min = i;
            }
        }
        swap(points, 0, min);
        Point p = points[0];

        Arrays.sort(points, 1, points.length, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                int o = findOrientation(p, p1, p2);
                if (o == 0) {
                    return dist(p, p2) >= dist(p, p1) ? -1 : 1;
                }
                return (o == 2) ? -1 : 1;

            }

        });
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", "
                    + points[i].y + "), ");
        }
    }

    public static void main(String[] args) {
        Point[] points = {new Point(0, 3), new Point(1, 1),
            new Point(2, 2), new Point(4, 4), new Point(0, 0),
            new Point(1, 2), new Point(3, 1), new Point(3, 3)};
        findClosedPathSetOfPoints(points);
    }

    private static void swap(Point[] points, int x, int y) {
        Point temp = points[x];
        points[x] = points[y];
        points[y] = temp;
    }

}
