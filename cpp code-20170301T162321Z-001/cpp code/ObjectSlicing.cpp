#include <iostream>
using namespace std;

class Base
{
protected:
    int i;
public:
    Base(int a)     { i = a; }
virtual void display()
  // void display()
    { cout << "I am Base class object, i = " << i << endl; }
};

class Derived : public Base
{
    int j;
public:
    Derived(int a, int b) : Base(a) { j = b; }
    virtual void display()
    //void display()
    { cout << "I am Derived class object, i = "
           << i << ", j = " << j << endl;  }
};

// Global method, Base class object is passed by value
//void somefunc (Base obj)
void somefunc(Base obj)
{
    obj.display();
}
/*void somefunc(Base* obj)
{
    obj->display();
}*/

int main()
{
    Base b(33);
    Derived d(45, 54);
    //somefunc(b);
    somefunc(d);  // Object Slicing, the member j of d is sliced off
   //somefunc(&b);
   //somefunc(&d);
    return 0;
}
