
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srivemul
 */
public class ZemoSoTest2 {

    /**
     * @param args the command line arguments
     */
    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int maxLen = Integer.MIN_VALUE;
        int curLen = 0;
        int cummulativeDiff = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] < 2) {
                curLen++;
                cummulativeDiff += (A[i + 1] - A[i]);
                if (cummulativeDiff < 2) {
                    maxLen = curLen;
                }
            } else {
                curLen = 0;
                cummulativeDiff = 0;
            }
        }
        return maxLen + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 3, 2, 4};
        System.out.println(solution(arr));
    }

}
