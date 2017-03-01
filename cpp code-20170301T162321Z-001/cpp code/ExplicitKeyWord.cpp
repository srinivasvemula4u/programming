#include<iostream>
using namespace std;

class Foo
{
public:
  // single parameter constructor, can be used as an implicit conversion
  Foo (string foo) : m_foo (foo)
  {
  }

  string GetFoo () { return m_foo; }

private:
  string m_foo;
};
void DoBar (Foo foo)
{
  //int i = foo.GetFoo ();
 // cout << i << endl;
}
int main ()
{
  //DoBar (42);
  //Foo mFoo =
  const char *p = reinterpret_cast<const char *>(45);
  cout << p;
  //cout<< mFoo.GetFoo() <<endl;
 // cout << Foo(36).GetFoo();
}
