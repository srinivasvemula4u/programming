#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<cmath>
/*
Method 1(Using Log of the number)
1. Calculate Position of set bit in p(next power of 2):
pos = ceil(lgn) (ceiling of log n with base 2)
2. Now calculate p:
p = pow(2, pos)
Example
Let us try for 17
pos = 5
p = 32
*/
using namespace std;
int FindPosition(int n)
{
    return ceil(log(n)/log(2));
}
int main()
{
   int n;
   cout << "Enter a number n" << endl;
   cin >> n;
   int position = FindPosition(n);
   int P = pow(2,position);
   cout << " Number greater than or equal to " << n << " is " << P << endl;
}

