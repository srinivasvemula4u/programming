
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
/*
List of tuples, need to determine if union of the tuples covers the tuple K.

[{8, 14}, {1, 3}, {4, 10}, {1, 6}], {1, 9} => true = (1,3) (1,6) (1,9) (4,10) (8,14)  => (1,6)(1,9) =>( 1,9)(4,10),(8,14) => (1,10),
[{8, 14}, {1, 2}, {4, 10}], {1, 9} => false

[{1, 10}, {3, 7}, {11, 15}, { 13, 20}], {1, 18} = true

temp = 1,10
i=1 3,7

temp 1,10 
i= 2 (11,15

temp = 1,15
i = 3 (13, 20)
temp 1,20

 */
public class SamsungTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    int findLargestNeighbourElem(int[] arr) {
        int start = 0, end = arr.length - 1, n = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if ((mid - 1 > 0 && arr[mid] > arr[mid - 1]) && (mid + 1 < n && arr[mid] > arr[mid + 1])) {
                return arr[mid];
            } else if (mid - 1 > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else if (mid + 1 < n && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;

    }

    Node getShrinkList(Node head) {
        Node start = head, cur = head;
        while (cur.next != null && cur.next.next != null) {
            if ((cur.next.y == start.y) && start.y == cur.next.next.y) {
                cur = cur.next.next;
            } else if (cur.next.y == start.y && start.y != cur.next.next.y) {
                cur = cur.next;
                start.next = cur;
                start = cur.next;
                cur = start;
                //start = start.next;   
            } else {
                start.next = cur;
                start = cur;
            }
        }

        return head;
    }

    private static class Node {

        int x, y;
        Node next;

        public Node() {

        }
    }

    boolean isEnclosed(List<Tuple> list, Tuple t) {
        if (list.size() == 0) {
            return false;
        }
        Tuple temp = list.get(0);
        if (isEnclosedHelper(temp, t)) {
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if (temp.end > list.get(i).start) {
                if (temp.end < list.get(i).end) {
                    temp.end = list.get(i).end;
                }
            } else if (temp.end < list.get(i).start && (temp.end == list.get(i).start - 1)) {
                if (temp.end < list.get(i).end) {
                    temp.end = list.get(i).end;
                }
            } else {
                temp = list.get(i);
            }
            if (isEnclosedHelper(temp, t)) {
                return true;
            }
        }

        return false;
    }

    boolean isEnclosedHelper(Tuple temp, Tuple t) {
        if (temp.start >= t.start && temp.end >= t.end) {
            return true;
        } else {
            return false;
        }
    }

    private class Tuple {

        public int start;
        public int end;
    }

}
