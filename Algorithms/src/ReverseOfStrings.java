
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040 You are given an integer N, followed by N lines of input (1
 * <= N <= 100). Each line of input contains one or several words separated with
 * single spaces. Each word is a sequence of letters of English alphabet
 * containing between 1 and 10 characters, inclusive. The total number of words
 * in the input is between 1 and 100, inclusive.
 *
 * Your task is to reverse the order of words in each line of input, while
 * preserving the words themselves. The lines of your output should not have any
 * trailing or leading spaces.
 *
 * Example
 *
 * input 3 Hello World Bye World Useless World
 *
 * output World Hello World Bye World Useless
 *
 */
public class ReverseOfStrings {

    public static void main(String[] args) throws java.lang.Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();abstract
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        String[] str = new String[T];
        for (int i = 0; i < T; i++) {
            str[i] = new String(scan.nextLine());
        }
        for (int i = 0; i < T; i++) {
            String[] split = str[i].split(" ");
            for (int j = split.length - 1; j > 0; j--) {
                System.out.print(split[j] + " ");
            }
            System.out.println(split[0]);
        }
    }
}
