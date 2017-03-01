#include<iostream>
/*
square(n) = 0 if n == 0
  if n is even
     square(n) = 4*square(n/2)
  if n is odd
     square(n) = 4*square(floor(n/2)) + 4*floor(n/2) + 1

Examples
  square(6) = 4*square(3)
  square(3) = 4*(square(1)) + 4*1 + 1 = 9
  square(7) = 4*square(3) + 4*3 + 1 = 4*9 + 4*3 + 1 = 49
How does this work?

If n is even, it can be written as
  n = 2*x
  n2 = (2*x)2 = 4*x2
If n is odd, it can be written as
  n = 2*x + 1
  n2 = (2*x + 1)2 = 4*x2 + 4*x + 1
floor(n/2) can be calculated using bitwise right shift operator. 2*x and 4*x can be calculated
*/
using namespace std;

int square(int n)
{
    if( n == 0) // Base case
        return 0;
    if( n < 0) // Handling Negative numbers
        n = -n;
    int x = n>>1;
    if(n&1) {
      //Odd number case
      return ((square(x)<<2)+ (x<<2)+1);
    }
     else
        // Even case
        return  (square(x)<<2);
}
int main()
{
    for(int i = 0; i<20 ; i++)
        cout<< "Number = " << i << "and its square =  " <<square(i) <<endl;
}
