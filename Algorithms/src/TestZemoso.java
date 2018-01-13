
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srivemul
 */
public class TestZemoso {

    /**
     * @param args the command line arguments
     */
    //   public static int solution(int[] A) {
    // write your code in Java SE 8
//        if (A.length == 0) {
//            return 0;
//        }
//        Arrays.sort(A);
//        int[] diffArray = new int[A.length - 1];
//        for (int i = 0; i < A.length - 1; i++) {
//            diffArray[i] = A[i + 1] - A[i];
//        }
//        int maxLen = Integer.MIN_VALUE;
//        int curLen = 0;
//        int cummulativeDiff = 0;
//        for (int i = 0; i < diffArray.length; i++) {
//            if (diffArray[i] < 2) {
//                curLen++;
//                cummulativeDiff += diffArray[i];
//                if (cummulativeDiff < 2) {
//                    maxLen = curLen;
//                }
//            } else {
//                curLen = 0;
//                cummulativeDiff = 0;
//            }
//        }
//        return maxLen + 1;
    //  }
    public static  int solution(Point2D[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int ymin = A[0].y, min = 0;
        for (int i = 1; i < n; i++) {
            int y = A[i].y;
            if ((y < ymin) || (ymin == y && A[i].x < A[min].x)) {
                ymin = A[i].y;
                min = i;
            }
        }
        swap(A, 0, min);
        Point2D pStart = A[0];
        Arrays.sort(A, 1, n, new Comparator<Point2D>() {
            @Override
            public int compare(Point2D p1, Point2D p2) {
                int o = orientation(pStart, p1, p2);
                if (o == 0) {
                    return (distSq(pStart, p2) >= distSq(pStart, p1)) ? -1 : 1;
                }
                return (o == 2) ? -1 : 1;
            }

        });
        int m = 1;
        for (int i = 1; i < n; i++) {
            while (i < n - 1 && orientation(pStart, A[i],
                    A[i + 1]) == 0) {
                i++;
            }

            A[m] = A[i];
            m++;
        }
        if (m < 3) {
            return -1;
        }
        Stack<Point2D> stack = new Stack();
        stack.push(A[0]);
        stack.push(A[1]);
        stack.push(A[2]);
        for (int i = 3; i < m; i++) {
            // Keep removing top while the angle formed by
            // points next-to-top, top, and points[i] makes
            // a non-left turn
            while (orientation(nextToTop(stack), stack.peek(), A[i]) != 2) {
                stack.pop();
            }
            stack.push(A[i]);
        }
    while (!stack.isEmpty())
   {
       Point2D p = stack.peek();
      System.out.println(p.x + " " + p.y);
       stack.pop();
   }
        return stack.size();
    }

    static Point2D nextToTop(Stack<Point2D> stack) {
        Point2D p = stack.peek();
        stack.pop();
        Point2D res = stack.peek();
        stack.push(p);
        return res;
    }

    public static int orientation(Point2D p, Point2D q, Point2D r) {
        int val = (q.y - p.y) * (r.x - q.x)
                - (q.x - p.x) * (r.y - q.y);

        if (val == 0) {
            return 0;  // colinear
        }
        return (val > 0) ? 1 : 2; // clock or counterclock wise
    }

    public static int distSq(Point2D p1, Point2D p2) {
        return (p1.x - p2.x) * (p1.x - p2.x)
                + (p1.y - p2.y) * (p1.y - p2.y);
    }

    public static void swap(Point2D[] A, int start, int min) {
        Point2D temp = A[0];
        A[0] = A[min];
        A[min] = temp;
    }

    private static class Point2D {

        int x;
        int y;

        public Point2D(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
       Point2D[] points = {new Point2D(0, 3), new Point2D(1, 1), new Point2D(2, 2), new Point2D(4, 4),
                      new Point2D(0, 0), new Point2D(1, 2), new Point2D(3, 1), new Point2D(3, 3)};
       System.out.println(solution(points));
    }

}
