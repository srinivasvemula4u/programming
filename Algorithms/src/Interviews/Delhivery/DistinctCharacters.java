/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interviews.Delhivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sv186040
 *
 * You are given a string S of length N and there are Q queries. In each query,
 * you are provided with 2 integers L and R. You need to find the number of
 * distinct characters present in the range L to R.
 *
 * Input format
 *
 * First line of Input contains N, length of string S. Second line of input
 * contains string S containing lowercase alphabets only. Third line of Input
 * contains Q, number of queries Each following Q lines contains 2 integers , L
 * and R . Output format
 *
 * For each query, output number of distinct characters in a new line.
 *
 * Constraints
 *
 *
 *
 *
 *
 * Sample Input 6 nikunj 2 1 6 1 4 Sample Output 5 4 Explanation In the First
 * Query , there are 5 distinct characters from substring 'nikunj ' .
 *
 * In the Second Query , 4 there are 4 distinct characters from substring
 * 'niku'.
 *
 */
public class DistinctCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int len = Integer.parseInt(br.readLine().trim());
        String S = br.readLine();
        int Q = Integer.parseInt(br.readLine().trim());
        int N = 2;
        int[][] arr = new int[Q][N];
        for (int i_arr = 0; i_arr < Q; i_arr++) {
            String[] arr_arr = br.readLine().split(" ");
            for (int j_arr = 0; j_arr < arr_arr.length; j_arr++) {
                arr[i_arr][j_arr] = Integer.parseInt(arr_arr[j_arr]);
            }
        }

        int[] out_ = distinctCharacter(S, arr, len);
        // System.out.print(out_[0]);
        for (int i_out_ = 0; i_out_ < out_.length; i_out_++) {
            System.out.println(out_[i_out_]);
        }

        wr.close();
        br.close();
    }

    static int[] distinctCharacter(String S, int[][] arr, int len) {
        // write your code here
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Map<Character, Boolean> map = new HashMap<>();
            int count = 0;
            for (int j = arr[i][0]; j < arr[i][1]; j++) {
                if (map.containsKey(S.charAt(j))) {
                    continue;
                } else {
                    map.put(S.charAt(j), true);
                    count++;
                }
            }
            res[i] = count;
        }

        return res;
    }
}
