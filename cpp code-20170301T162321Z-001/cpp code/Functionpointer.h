#include<iostream>
using namespace std;
namespace MyTest {
class Test
{
  public:
        void IndirectCall();
  private:
        void operation();
        void (Test::*pointer)();
};
}
