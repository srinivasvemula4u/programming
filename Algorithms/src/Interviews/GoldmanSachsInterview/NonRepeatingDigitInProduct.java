package Interviews.GoldmanSachsInterview;


import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040
 */
public class NonRepeatingDigitInProduct {

    static int nonRepeatingDigitProductCount(int x, int y, int z) {
        /*
         * Write your code here.
         */
        if (x == 1) {
            return 0;
        }
        if (y > z) {
            if (validNonRepatingDigitProductCount(x, y)) {
                return 1;
            }
        }
        int index = y;
        int counter = 0;
        while (index <= z) {
            if (validNonRepatingDigitProductCount(x, index)) {
                counter++;
            }
            index++;
        }
        return counter;

    }

    static boolean validNonRepatingDigitProductCount(int x, int index) {
        Set<Integer> set = new HashSet<>();
        int temp = index;
        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            set.add(rem);
        }
        long product = x * index;
        while (product > 0) {
            int rem = (int) product % 10;
            product = product / 10;
            if (set.contains(rem)) {
                return false;
            }
        }
        return true;
    }

}
