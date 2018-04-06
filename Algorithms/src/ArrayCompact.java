/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
public class ArrayCompact {

    static String solution(int[] array) {
        // Collections.sort(array);
        /*  if (array.length == 0) {
            return null;
        }
        StringBuffer buff = new StringBuffer();
        buff.append(array[0]);
        int startVal = array[0];
        int counter = 0;
        int i;
        for (i = 1; i < array.length; i++) {
            if ((array[i] - array[i - 1]) == 1) {
                counter++;
            } else if (counter >= 2) {
                if (startVal != array[0]) {
                    buff.append("," + startVal);
                }
                buff.append("-");
                buff.append(array[i - 1]);
                counter = 0;
                startVal = array[i];
            } else {
                buff.append("," + startVal);
                counter = 0;
                startVal = array[i];
            }
        }
        if (counter >= 2) {
            if (startVal != array[0]) {
                buff.append(startVal);
            }
            buff.append("-");
            buff.append(array[i - 1]);
        } else if (counter == 1) {
            buff.append("," + startVal);
            buff.append("," + array[i - 1]);
        } else {
            buff.append("," + array[i - 1]);
        }
        return buff.toString();*/
        if (array.length == 1) {
            return new String(array[0] + "");
        } else if (array.length == 2) {
            return new String(array[0] + "," + array[1]);
        } else {
            StringBuffer buff = new StringBuffer();
            buff.append(array[0]);
            int counter = 0;
            int i;
            for (i = 1; i < array.length; i++) {
                if ((array[i] - array[i - 1]) == 1) {
                    counter++;
                } else if (counter >= 2) {
                    buff.append("-");
                    buff.append(array[i - 1]);
                    buff.append("," + array[i]);
                    counter = 0;
                } else if (counter == 1) {
                    //buff.append("," + startVal);
                    buff.append("," + array[i - 1]);
                    counter = 0;
                    buff.append("," + array[i]);
                } else {
                    buff.append("," + array[i]);
                }
            }
            if (counter >= 2) {
                buff.append("-");
                buff.append(array[i - 1]);
            } else if (counter == 1) {
                buff.append("," + array[i - 1]);
            }
            return buff.toString();
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3,
            -2,
            -1,
            5,
            6,
            7,
            9,
            11,
            12,
            13,
            15,
            16}));
    }

}
