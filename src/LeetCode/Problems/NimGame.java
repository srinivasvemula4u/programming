/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
Theorem: The first one who got the number that is multiple of 4 (i.e. n % 4 == 0) will lost, otherwise he/she will win.
Proof:

the base case: when n = 4, as suggested by the hint from the problem, no matter which number that that first player, 
the second player would always be able to pick the remaining number.

For 1* 4 < n < 2 * 4, (n = 5, 6, 7), the first player can reduce the initial number into 4 accordingly, 
which will leave the death number 4 to the second player. i.e. The numbers 5, 6, 7 are winning numbers for any player 
who got it first.

Now to the beginning of the next cycle, n = 8, no matter which number that the first player picks, 
it would always leave the winning numbers (5, 6, 7) to the second player. Therefore, 8 % 4 == 0, again is a death number.

Following the second case, for numbers between (2*4 = 8) and (3*4=12), which are 9, 10, 11, are winning numbers 
for the first player again, because the first player can always reduce the number into the death number 8.

Following the above theorem and proof, the solution could not be simpler:
*/
public class NimGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public boolean canWinNim(int n) {
       return n % 4 != 0;
    }
    
}
