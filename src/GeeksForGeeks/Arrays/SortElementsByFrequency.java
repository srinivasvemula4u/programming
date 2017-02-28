/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.Arrays;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author srivemul
 */
class Element {

    int val;
    int index;
    int frequency;

    @Override
    public String toString() {
        return new Integer(val).toString() + " " + new Integer(index).toString() + " " + new Integer(frequency).toString();
    }
}

class ElementValueComparator implements Comparator<Element> {

    @Override
    public int compare(Element e1, Element e2) {
        return (e1.val == e2.val) ? 0 : ((e1.val > e2.val) ? 1 : -1);
    }

}

class ElemenValueAndFrequencyComparator implements Comparator<Element> {

    @Override
    public int compare(Element e1, Element e2) {
        if (e1.frequency != e2.frequency) {
            return e1.frequency == e2.frequency ? 0 : (e1.frequency < e2.frequency ? 1 : -1);
        }
        return e1.index == e2.index ? 0 : (e1.index > e2.index ? 1 : -1);

    }
}

public class SortElementsByFrequency {

    public static void sortElementsByFrequency(int[] arr) {
        int n = arr.length;
        List<Element> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Element obj = new Element();
            obj.val = arr[i];
            obj.index = i;
            obj.frequency = 0;
            arrList.add(obj);
        }
        ElementValueComparator valueCompartor = new ElementValueComparator();
        Collections.sort(arrList, valueCompartor);
        arrList.get(0).frequency = 1;
        //   Iterator<Element> itr = arrList.iterator();
        System.out.println(arrList);
        for (int i = 1; i < n; i++) {
            if (arrList.get(i).val == arrList.get(i - 1).val) {
                Element obj1 = arrList.get(i), obj2 = arrList.get(i - 1);
                obj1.frequency += (obj2.frequency + 1);
                /* Set count of previous element as -1 , we are
               doing this because we'll again sort on the
               basis of counts (if counts are equal than on
               the basis of index)*/
                obj1.index = obj2.index;
                // arrList.get(i).frequency += arrList.get(i-1).frequency + 1;
                arrList.set(i, obj1);

                arrList.get(i - 1).frequency = -1;
                arrList.set(i - 1, obj2);
            } else {
                Element obj1 = arrList.get(i);
                obj1.frequency = 1;
                arrList.set(i, obj1);
            }
        }
        ElemenValueAndFrequencyComparator valueAndFrequencyComparator = new ElemenValueAndFrequencyComparator();
        Collections.sort(arrList, valueAndFrequencyComparator);
        //  System.out.println(arrList);
        int index = 0;
        for (int i = 0; i < n; i++) {
            int frequency = arrList.get(i).frequency;
            if (frequency != -1) {
               for(int j =0; j < frequency; j++) {
                   arr[index++] = arrList.get(i).val;
               }
            }
        }
    }

    public static void main(String agrs[]) {

        int[] arr = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        sortElementsByFrequency(arr);
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
