/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.LinkedLists;

/**
 *
 * @author sv186040
 */
public class FindInterSectingNodeInList {

    public int findInterSectingNodeInList(LinkedListNode head1, LinkedListNode head2) {
        int L1 = 0, L2 = 0;
        int diff = 0;
        LinkedListNode list1 = head1, list2 = head2;
        while (list1 != null) {
            L1++;
            list1 = list1.getNext();
        }
        while (list2 != null) {
            L2++;
            list2 = list2.getNext();
        }
        if (L1 < L2) {
            list1 = head2;
            list2 = head1;
            diff = L2 - L1;
        } else {
            list1 = head1;
            list2 = head2;
            diff = L2 - L1;
        }
        for (int i = 0; i < diff; i++) {
            list1 = list1.getNext();
        }
        while (list1 != null && list2 != null) {
            if (list1 == list2) {
                return list1.getData();
            }
            list1 = list1.getNext();
            list2 = list2.getNext();

        }
        return -1;
    }
}
