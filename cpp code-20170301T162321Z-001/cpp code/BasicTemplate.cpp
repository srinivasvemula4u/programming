#include<iostream>
#include<string>

using namespace std;

template<typename T>
const T& GetMax(T& obj1, T& obj2)
{
    if(obj1 > obj2 )
        return obj1;
    else
        return obj2;
}
template <typename Type>
void DisplayComparison(const Type& value1, const Type& value2)
 {
 cout << "GetMax(" << value1 << ", " << value2 << ") = ";
 cout << GetMax(value1, value2) << endl;
 }
int main()
{
    int a =10, b=15;
    DisplayComparison<int>(a,b);
    string s1("Srinu"),s2("Srinivas");
    DisplayComparison<string>(s1,s2);
    //cout<< bigValue <<endl;
}
