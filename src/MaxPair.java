
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author srivemul
 */
public class MaxPair {

    public static void main(String[] args) {
         FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
       /* // Test Generator
        while (true) {
            Random rGenerator = new Random();
            int randomInt = rGenerator.nextInt(100000) + 2;
            int[] numbers = new int[randomInt];
            for (int i = 0; i < randomInt; i++) {
                numbers[i] = rGenerator.nextInt(100000);
            }
            System.out.println("the array is ");
            for (int i = 0; i < randomInt; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("");
            long res1 = getMaxPairwiseProduct(numbers);
            long res2 = getMaxPairwiseProductFast(numbers);
            if (res1 != res2) {
                System.out.println("Wrong answer: " + res1 + " " + res2);
                break;
            } else {
                System.out.println("Ok");
            }
        }*/
         System.out.println(getMaxPairwiseProductFast(numbers));
    }

    private static long getMaxPairwiseProductFast(int[] numbers) {
        long firsthighest = 0;
        long secondhighest = 0;
        //   firsthighest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firsthighest) {
                secondhighest = firsthighest;
                firsthighest = numbers[i];
            } else if (numbers[i] > secondhighest && numbers[i] <= firsthighest) {
                secondhighest = numbers[i];
            }
        }
        return (long) firsthighest * secondhighest;
        //To change body of generated methods, choose Tools | Templates.
    }

    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((long) numbers[i] * numbers[j] > result) {
                    result = (long) numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    static class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException ex) {
                    Logger.getLogger(MaxPair.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
