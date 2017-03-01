#include<iostream>

using namespace std;

class A
{
    public:
        A()
    {
        cout<< "A" << endl;
    }
    virtual void funA()
    {
        cout << "FunA of class A" <<endl;
    }
};
class B : public  A
{
public:
     B()
    {
        cout << "B" <<endl;
    };
    virtual void funA()
    {
        cout<< "Fun A of class B" <<endl;
    }
    virtual void funB()
    {
         cout<< "FunB of class B" <<endl;
    }
};
int main()
{
    A a;

    a.funA();
    B *b = new B();
    if(b)
        cout<< "Hurray"<<b;
    b->funA();
    b->funB();
    A *a1 = b;
    a1->funA();
    ((B*)a1)->funB();\
}
