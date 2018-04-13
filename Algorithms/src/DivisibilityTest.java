/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 * 

Divisibility Test
To see if a number is divisible by 3, you need to add up the digits of its decimal notation, and check if the sum is divisible by 3.

To see if a number is divisible by 11, you need to split its decimal notation into pairs of digits (starting from the right end), add up corresponding numbers and check if the sum is divisible by 11.  



For any prime p (except for 2 and 5) there exists an integer r such that a similar divisibility test exists: to check if a number is divisible by p, you need to split its decimal notation into r-tuples of digits (starting from the right end), add up these r-tuples and check whether their sum is divisible by p.  



Given a prime int p, find the minimal r for which such divisibility test is valid and output it.



The input consists of a single integer p - a prime between 3 and 999983, inclusive, not equal to 5.



Example



input



3



output



1



input



11



output



2




Test Cases
11	5
3	5
Min test 7	10
13	10
31	10
37	10
41	10
43	10
53	10
73	10
101	10
211	10
271	10
827	10
1009	10
2347	10
7307	10
8513	10
10007	10
14401	10
25457	10
99989	10
100003	10
223007	10
777743	10
999983 (max test)	10
Loading Questions... This is a sample test. Please return to the actual test after this. 13 days left - Choose your plan.

 */
public class DivisibilityTest {
    
}
