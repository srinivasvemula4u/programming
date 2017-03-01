#include<iostream>
#include<cmath>

using namespace std;
/*
// If n is a power of 2 then return n
1 If (n & !(n&(n-1))) then return n
2 Else keep right shifting n until it becomes zero
and count no of shifts
a. Initialize: count = 0
b. While n ! = 0
n = n>>1
count = count + 1
//Now count has the position of set bit in result
3 Return (1 << count)
*/
int FindNextPowerOf2(int n)
{
    int c =0;
    while(n)
    {
        n = n >> 1;
        c++;
    }
    return 1 << c;
}
int main()
{
    int n;
   cout << "Enter a number n" << endl;
   cin >> n;
   cout << " the Next number to " << n << " is " << FindNextPowerOf2(n) << endl;
}
