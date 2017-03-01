#include<iostream>

using namespace std;

class A
{
  static int ca, da;
public:
        A()
        {

            cout<< "A Constructor"<< ++ca<<endl;

        }
        ~A()
        {

            cout<< "A Destructor" << ++da<<endl;
        }
};
 int A:: ca =0;
 int A:: da =0;
int main()
{
    A a;
    A x = a;
   // x=a;
}
