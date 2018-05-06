/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.ThoughtWorks;

/**
 *
 * @author sv186040 ou have been given two strings, A and B (of length N each)
 * and Q queries. The strings contain only 0s and/or 1s.
 *
 * For every query, you are given an index i. You have to update the value at
 * index i to 1 in string B and check if B is lexicographically equal to or
 * larger than A or not. If yes, then print "" and if not, print "" (without
 * quotes).
 *
 * Input format
 *
 * First line contains two space-separated integers N and Q. Next line contains
 * the string A. Next line contains the string B. Next Q lines contains an
 * integer i (1 - based indexing) Output Format
 *
 * For each query, print the desired output in a new line.
 *
 * Input Constraints ,  *
 * Sample Input 5 5 11111 00010 1 2 3 4 5 Sample Output NO NO NO NO YES
 * Explanation After 1st query: B = 10010. B < A. (NO) After 2nd query: B =
 * 11010. B < A. (NO) After 3rd query: B = 11110. B < A. (NO) After 4th query: B
 * = 11110. B < A. (NO) After 5th query: B = 11111. B = A. (YES)
 */
public class CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        s.nextLine();
        String A = s.nextLine();
        String B = s.nextLine();
        //System.out.println(A);
        //System.out.println(B);
        for (int i = 0; i < Q; i++) {
            int idx = s.nextInt();
            //   System.out.println(idx);
            //  System.out.println(B);
            B = B.replaceFirst(Character.toString(B.charAt(idx - 1)), "1");
            //  System.out.println(B);
            if (A.compareTo(B) <= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}

