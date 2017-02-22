/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.Searching;

/**
 *
 * @author srivemul
 */
public class NumberOfTrailingZeroesInFactorialOfNumber {
    public static int NumberOfTrailingZeroesInNumber(int n) {
        int i,count = 0;
        if(n < 0)
            return -1;
        for(i = 5; n/i > 0; i*= 5) {
            count += n/i;
        }
        return count;
    }
    public static void main(String args[]) {
      //  int[] Arr = {0,1,1,0,1,2,1,2,0,0,0,1};
     //   print(Arr);
      // dutchNationalFlagProblemWithThreeColors(Arr);
      //   print(Arr);
        

        System.out.println(NumberOfTrailingZeroesInNumber(10));
    }
}
