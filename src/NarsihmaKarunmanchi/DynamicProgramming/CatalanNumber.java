/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class CatalanNumber {
    public static int catalanNumber(int n) {
        if(n == 0)
            return 1;
       int count = 0;
       for(int i = 1; i <= n; i++) {
           count += (catalanNumber(i-1)*catalanNumber(n-i));
       }
       return count;
    }
    static int[] table;
    public static int catalaNumberDP(int n) {
        table = new int[n+1];
        return catalaNumberDP1(n);
    }
    public static void main(String agrs[]) {
        System.out.println(catalanNumber(13));
       System.err.println(catalaNumberDP(13));
    }

    private static int catalaNumberDP1(int n) {
       if(table[n] != 0)
           return table[n];
       if(n == 0) {
           table[n] = 1;
           return table[n];
       }
       table[n] = 0;
        for(int i = 1; i <= n; i++) {
           table[n] += (catalaNumberDP1((i-1))*catalaNumberDP1((n-i)));
       }
        return table[n];
    }
}
