#include<iostream>
using namespace std;

class Base
{
public:
    void fun()
    {
        cout << "Base::fun" << endl;
    }

};
class Derived : public Base
{
public:
    void fun()
    {
        cout << "Dervied::fun" << endl;
    }
};
typedef void (*Fun)(void);
int main()
{
    Base Bobj;
    Derived Dobj;
    cout << "Size of Base = " << sizeof(Bobj) <<endl;
    cout << "Size of Derived = " << sizeof(Dobj) <<endl;
    cout << "Starting adress of Base = " << &Bobj << endl;
    cout << "Starting adress of Derived = " << &Dobj << endl;
   /* cout << "Vptr Adress of Base = "<< (reinterpret_cast<int *>(&Bobj)+0) << endl;
    cout << "Vptr Adress of Derived = "<< (reinterpret_cast<int *>(&Dobj)+0) << endl;
    cout << "VTable Adress of Base of Vptr = "<< reinterpret_cast<int *>(*(reinterpret_cast<int *>(&Bobj)+0)) << endl;
    cout << "VTable Adress of Derived of Vptr = "<< reinterpret_cast<int *>(*(reinterpret_cast<int *>(&Dobj)+0)) << endl;
    cout << "Base class virtual function pointer in Vtable = "<<reinterpret_cast<int *>(*((reinterpret_cast<int *>(*(reinterpret_cast<int *>(&Bobj)+0)))+0)) << endl;
    cout << "Derived class virtual function pointer in Vtable = "<<reinterpret_cast<int *>(*((reinterpret_cast<int *>(*(reinterpret_cast<int *>(&Dobj)+0)))+0)) <<endl;*/
 /*   Fun pfBase, pfDerived;
    pfBase = reinterpret_cast<Fun>(reinterpret_cast<int *>(*((reinterpret_cast<int *>(*(reinterpret_cast<int *>(&Bobj)+0)))+0)));
    pfDerived = reinterpret_cast<Fun>(reinterpret_cast<int *>(*((reinterpret_cast<int *>(*(reinterpret_cast<int *>(&Dobj)+0)))+0)));
    pfBase();
    pfDerived();*/
    Base *pBobj;
    cout << "Adress of Base pointer before assigning it to Derived " <<  pBobj << endl;
    pBobj = &Dobj;
    cout << "Adress of Base pointer after assigning it to Derived " <<  pBobj << endl;
   /* cout << "Adress of Vptr with associate in vBase pointer " << reinterpret_cast<int *>(pBobj+0) <<endl;
    cout << "Adress of function entry in vtable  of vpt with associate in vBase pointer " << reinterpret_cast<int *>(*(reinterpret_cast<int *>(*(reinterpret_cast<int *>(pBobj+0)))+0)) <<endl;
    Fun pFunBase;
    pFunBase = reinterpret_cast<Fun>(*(reinterpret_cast<int *>(*(reinterpret_cast<int *>(pBobj+0)))+0));
    pFunBase();*/
    pBobj->fun();
}

