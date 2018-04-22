package Interviews.DEShawInterview;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
/*
The Travelling Ant
There is an Ant that lives in Baskerville and loves to travel. As Baskerville is a small place, it consists of only 5 cities placed one next to each other.

There is a train between each successive cities ie between City 1 - City 2, City 2 - City 3, ... City 5 - City 1. Note that our Ant loves to travel and gets happy after making exactly N train trips and returning back to home.
Ant lives in the city 1 from where she begins her journey. She asks you to find the number of ways she can make N train trips and come back to home.

Since the number of ways can be huge, print that number modulo 10^9 + 7.

Input
First line contains T, the number of test cases.
Then T lines follow.
Each line contains a single integer n, representing the number of train trips the ant needs to make.

Output
For each test case, print a single line containing the answer to the problem.

Constraints
1 <= T <= 1000
0 <= n <= 10^18

Sample Input
3
0
3
4
Sample Output
1
0
6
Explanation
In first case, ant has to make 0 trips. So the ant stays at city 1 and has only 1 option.
In second case, ant has to make 3 trips. No matter what combination we try, we can never reach back to city 1 back after 3 trips. So answer is 0.
In third case, ant makes 4 trips. There are 6 ways in which it can reach back to city 1.
Way 1: 1-->2-->1-->2-->1
Way 2: 1-->2-->3-->2-->1
Way 3: 1-->5-->1-->5-->1
Way 4: 1-->5-->4-->5-->1
Way 5: 1-->5-->1-->2-->1
Way 6: 1-->2-->1-->5-->1

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
Time Limit: 1.0 sec(s) for each input file
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes
Allowed Languages: Java, Java 8
*/
public class TravellingAnt {
    
}
