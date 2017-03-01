#include "Functionpointer.h"
using namespace MyTest;
void Test::operation()
{
    cout<<"Operation got called";
}
void Test::IndirectCall()
{
    pointer =&Test::operation;
    (this->*pointer)();
}

main()
{
    Test t;
    t.IndirectCall();
}
