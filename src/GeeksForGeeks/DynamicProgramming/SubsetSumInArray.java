/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.DynamicProgramming;

/**
 *
 * @author srivemul
 */
public class SubsetSumInArray {

    /**
     * @param
     **/
    public static boolean isSubSetSum(int[] set,int sum, int n) {
        if( sum == 0)
            return true;
        if( n == 0 && sum > 0)
            return false;
        if(set[n-1] > sum)
            return isSubSetSum(set, sum, n-1);
        return isSubSetSum(set, sum-set[n-1], n-1) || isSubSetSum(set, sum, n-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubSetSum(set,sum,set.length));
    }
    
}
