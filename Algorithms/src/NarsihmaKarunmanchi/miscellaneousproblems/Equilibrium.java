/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.miscellaneousproblems;

import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author srivemul
 */
public class Equilibrium {
    public static int equilibrium(int[] arr) {
        int sum = 0, leftsum = 0;
        for(int i =0; i < arr.length; i++) 
            sum += arr[i];
        for(int i =0; i < arr.length;  i++) {
               sum -= arr[i];
            if(leftsum == sum)
                return i;
           
            leftsum += arr[i];
        }
        return -1;
    }
    public static void main(String args[]) throws ClassNotFoundException {
        int[] arr = {-7,1,5,2,-4,3,0};
       System.out.println(equilibrium(arr));
       String str = "NarsihmaKarunmanchi.miscellaneousproblems.CountingNumberOf1s";
       Class cls = Class.forName(str);
     //  cls.n
       // Comparator.com
      //  Collections.So
       
    }
}
