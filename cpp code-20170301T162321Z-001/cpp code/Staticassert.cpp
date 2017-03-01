#include<iostream>
#include<assert.h>
using namespace std;

int a = 5;
template <typename T>
class EverythingButInt
 {
     T mem;
public:
 EverythingButInt()
  {
    static_assert(sizeof(5) != sizeof(double), "No double please!");
 }
};

 int main()
 {
 EverythingButInt<int> test; // template instantiation with int.
 return 0;
 }

