#include<iostream>
#include<string>
using namespace std;

class A
{
public:
        void x(void)
        {
            cout << "x with 0 args"<<endl;
        }
        void x(int i)
        {
            cout << "x with one int arg"<<i<<endl;
        }
        void x(string s)
        {
            cout << "x with one string" <<endl;
        }
        void x(float x)
        {
             cout<< "x in base with one float arg"<<x<<endl;
        }
};
class B: public A
{
public:
        using A::x;
        void x(float f)
        {
            cout<< "x in derived with one float arg"<<f<<endl;
        }
};

int main()
{
    A a;
    a.x();
    a.x(10);
    a.x("base");
    B b;
    b.x(10.2f);
    b.x(20);
    b.x();
    b.x("derived");
}
