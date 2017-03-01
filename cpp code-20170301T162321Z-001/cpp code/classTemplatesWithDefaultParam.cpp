#include<iostream>
#include<string>

using namespace std;

template<typename T1= int, typename T2= double>
class HoldsPair
{
    T1 Value1;
    T2 Value2;
public:
    // Constructor that initializes member variables
 HoldsPair (const T1& value1, const T2& value2)
  {
 Value1 = value1;
 Value2 = value2;
 }

 // Accessor functions
 const T1 & GetFirstValue () const
 {
 return Value1;
}

 const T2& GetSecondValue () const
{
 return Value2;
 }
};
int main()
{
    HoldsPair<> cpair(10,10.9),cpair1(10.9,10);
    HoldsPair<short,char*>mShortStringPair(25,"Learn templates,love C++");
    cout << "The first object contains -" << endl;
    cout << "Value 1: " << cpair.GetFirstValue () << endl;
    cout << "Value 2: " << cpair.GetSecondValue () << endl;
    cout << "The first object contains -" << endl;
    cout << "Value 1: " << cpair1.GetFirstValue () << endl;
    cout << "Value 2: " << cpair1.GetSecondValue () << endl;

}
