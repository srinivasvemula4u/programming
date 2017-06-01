/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
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

}