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
/*
Let isSubSetSum(int set[], int n, int sum) be the function to find whether there is a subset of set[] with sum equal to sum. n is the number of elements in set[].

The isSubsetSum problem can be divided into two subproblems
…a) Include the last element, recur for n = n-1, sum = sum – set[n-1]
…b) Exclude the last element, recur for n = n-1.
If any of the above the above subproblems return true, then return true.

Following is the recursive formula for isSubsetSum() problem.

isSubsetSum(set, n, sum) = isSubsetSum(set, n-1, sum) || 
                           isSubsetSum(set, n-1, sum-set[n-1])
Base Cases:
isSubsetSum(set, n, sum) = false, if sum > 0 and n == 0
isSubsetSum(set, n, sum) = true, if sum == 0 
 */
public class SubsetSumInArray {

    /**
     * @param
     *
     */
    public static boolean isSubSetSum(int[] set, int sum, int n) {
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum > 0) {
            return false;
        }
        if (set[n - 1] > sum) {
            return isSubSetSum(set, sum, n - 1);
        }
        return isSubSetSum(set, sum - set[n - 1], n - 1) || isSubSetSum(set, sum, n - 1);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubSetSum(set, sum, set.length));
    }

}
