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

    /*
    * The above solution may try all subsets of given set in worst case. Therefore time complexity of the above solution is exponential. The problem is in-fact NP-Complete (There is no known polynomial time solution for this problem).

We can solve the problem in Pseudo-polynomial time using Dynamic programming. 
    We create a boolean 2D table subset[][] and fill it in bottom up manner. The value of subset[i][j] will be true if there is a subset of set[0..j-1] with sum equal to i., 
    otherwise false. Finally, we return subset[sum][n]
     */
    public static boolean isSubSetSumMethod2(int[] set, int sum, int n) {

        boolean[][] subset = new boolean[sum + 1][n + 1];
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++) {
            subset[0][i] = true;
        }
        // If sum is not 0 and set is empty, then answer is false
        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
        }
        // Fill the subset table in botton up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1]) {
                    subset[i][j] = subset[i][j]
                            || subset[i - set[j - 1]][j - 1];
                }
            }
        }
         // uncomment this code to print table
     for (int i = 0; i <= sum; i++)
     {
       for (int j = 0; j <= n; j++)
          System.out.print(" "+subset[i][j]);
       System.out.printf("\n");
     } 
        return subset[sum][n];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubSetSum(set, sum, set.length));
        System.out.println(isSubSetSumMethod2(set, sum, set.length));
    }
}
