#include<iostream>

using namespace std;

class A
{
    public:
    A()
    {
        cout << " Class A" << endl;
    }
};
class C
{
    public:
    C()
    {
        cout << " Clas C" << endl;
    }
};
class B : public A
{
public:
    C c;
    B()
    {
        cout << " Class B" << endl;
    }
};
int main()
{
     B a;
}
