#include<iostream>
#include<stdio.h>

using namespace std;

/*
METHOD 3 (Using Moore’s Voting Algorithm)

This is a two step process.
1. Get an element occurring most of the time in the array.
This phase will make sure that if there is a majority element then it will return that only.
2. Check if the element obtained from above step is majority element.

1. Finding a Candidate:
The algorithm for first phase that works in O(n) is known as Moore’s Voting Algorithm.
 Basic idea of the algorithm is if we cancel out each occurrence of an element e with all the other elements
 that are different from e then e will exist till end if it is a majority element.

findCandidate(a[], size)
1.  Initialize index and count of majority element
     maj_index = 0, count = 1
2.  Loop for i = 1 to size – 1
    (a)If a[maj_index] == a[i]
        count++
    (b)Else
        count--;
    (c)If count == 0
        maj_index = i;
        count = 1
3.  Return a[maj_index]
Above algorithm loops through each element and maintains a count of a[maj_index],
If next element is same then increments the count, if next element is not same then decrements the count, and
if the count reaches 0 then changes the maj_index to the current element and sets count to 1.
First Phase algorithm gives us a candidate element.
In second phase we need to check if the candidate is really a majority element.
Second phase is simple and can be easily done in O(n).
We just need to check if count of the candidate element is greater than n/2.
*/
int FindingCandidate(int a[],int len)
{
    int maj_index = 0, c = 1;
    int i;
    for( i=1; i < len; i++)
    {
        if(a[maj_index]== a[i])
            c++;
        else
            c--;
        if(c == 0) {
            maj_index = i;
            c= 1;
        }
    }
    return a[maj_index];
}
bool IsMajor(int a[],int len, int candidate)
{
    int c=0;
    for(int i = 0; i< len; i++)
        if( a[i] == candidate)
           c++;
    if(c > len/2)
        return true;
    else
        return false;
}
void PrintMajorityUsingMooreseVotingAlg(int a[],int len)
{
    int candidate;
    candidate = FindingCandidate(a,len);
    cout << "candidate =" << candidate << endl;
    if(IsMajor(a,len,candidate))
        cout << "Major element in array = " << candidate << endl;
    else
        cout << "array doesnt have candidate " << endl;
}
int main()
{
   // int a[] = { 2, 2, 3, 5, 2, 2, 6};
   int a[] = {2,2,2,4,5,6,7,7};
    PrintMajorityUsingMooreseVotingAlg(a, 8);
    //getchar();
    return 0;
}
