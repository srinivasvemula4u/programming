/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerEarth.Practice;

import java.util.Scanner;

/**
 *
 * @author srivemul
 */
/*
Fredo is assigned a new task today. He is given an array 
A
A containing 
N
N integers. His task is to update all elements of array to some minimum value 
x
x , that is, 
A
[
i
]
=
x
A[i]=x ; 
1
≤
i
≤
N
1≤i≤N such that sum of this new array is strictly greater than the sum of the initial array. Note that 
x
x should be as minimum as possible such that sum of the new array is greater than the sum of the initial array.

Input Format:
First line of input consists of an integer 
N
N denoting the number of elements in the array 
A
A.
Second line consists of 
N
N space separated integers denoting the array elements.

Output Format:
The only line of output consists of the value of 
x
x.

Input Constraints:
 1
≤
N
≤
10
5
1≤N≤105
 1
≤
A
[
i
]
≤
1000
 */
 /*
Explanation
Initial sum of array 
=
1
+
2
+
3
+
4
+
5
=
15
=1+2+3+4+5=15
When we update all elements to 
4
4, sum of array 
=
4
+
4
+
4
+
4
+
4
=
20
=4+4+4+4+4=20 which is greater than 
15
15.
Note that if we had updated the array elements to 
3
3, 
s
u
m
=
15
sum=15 which is not greater than 
15
15. So, 
4
4 is the minimum value to which array elements need to be updated.
 */
public class FredoAndArrayUpdate {
 public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
    */
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
          arr[i] = s.nextInt();  
          sum += arr[i];
        }
        System.out.println( sum / N + 1);
    }
}
