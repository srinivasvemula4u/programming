#include <deque>
 #include <iostream>
  #include <algorithm>

 int main ()
 {
 using namespace std;

 // Define a deque of integers
 deque <int> dqIntegers;

 // Insert integers at the bottom of the array
 dqIntegers.push_back (3);
 dqIntegers.push_back (4);
 dqIntegers.push_back (5);

 // Insert integers at the top of the array
 dqIntegers.push_front (2);
 dqIntegers.push_front (1);
 dqIntegers.push_front (0);

 cout << "The contents of the deque after inserting elements ";
 cout << "at the top and bottom are:" << endl;

 // Display contents on the screen
 for ( size_t nCount = 0
 ; nCount < dqIntegers.size ()
 ; ++ nCount )
 {
 cout << "Element [" << nCount << "] = ";
 cout << dqIntegers [nCount] << endl;
 }
 cout << endl;
  // Erase an element at the top
dqIntegers.pop_front ();
 // Erase an element at the bottom
 dqIntegers.pop_back ();
 cout << "The contents of the deque after erasing an element ";
 cout << "from the top and bottom are:" << endl;
 // Display contents again: this time using iterators
 // if on older compilers, remove auto and uncomment next line
 // deque <int>::iterator iElementLocator;
 /*for (auto iElementLocator = dqIntegers.begin ()
 ; iElementLocator != dqIntegers.end ()
 ; ++ iElementLocator )
 {
51: size_t Offset = distance (dqIntegers.begin (), iElementLocator);
52: cout << �Element [� << Offset << �] = � << *iElementLocator << endl;
53: }
54:
55:
*/
for ( size_t nCount = 0
 ; nCount < dqIntegers.size ()
 ; ++ nCount )
 {
 cout << "Element [" << nCount << "] = ";
 cout << dqIntegers [nCount] << endl;
 }
return 0;
}
