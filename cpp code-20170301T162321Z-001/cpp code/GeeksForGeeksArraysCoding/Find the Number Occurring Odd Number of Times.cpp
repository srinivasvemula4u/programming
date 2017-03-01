/*
Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the number in O(n) time & constant space.

Example:
I/P = [1, 2, 3, 2, 3, 1, 3]
O/P = 3

Algorithm:
Do bitwise XOR of all the elements. Finally we get the number which has odd occurrences.
*/
#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;

int FindNumberOccursOddTimes(int a[],int n)
{
    int sum=0;
    for(int i=0; i<n; i++)
        sum = sum ^ a[i];
    return sum;
}
int main()
{
    int ar[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
    int n = sizeof(ar)/sizeof(ar[0]);
    cout << "Odd Number = "<<FindNumberOccursOddTimes(ar,n) << endl;
}
