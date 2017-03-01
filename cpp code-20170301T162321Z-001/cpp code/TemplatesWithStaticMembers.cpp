#include<iostream>
#include<string>

using namespace std;

template<typename T>
class StaticTemplate
{
   public:
   static T StaticValue;
};

template<typename T>
T StaticTemplate<T>::StaticValue;

int main()
{
    StaticTemplate<int> int_obj1;
    StaticTemplate<int> int_obj2;
    int_obj1.StaticValue = 10;
    StaticTemplate<double> double_obj1, double_obj2;
    double_obj2.StaticValue = 14.5;
    cout<<" Int Template value = "<<int_obj2.StaticValue<<endl;
    cout<<"Double Template Value ="<<double_obj1.StaticValue<<endl;

}
