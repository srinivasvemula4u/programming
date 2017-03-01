#include<iostream>
using namespace std;
class Something
{
private:
    const int m_nValue;
public:
    Something():m_nValue(5)
    {
        //m_nValue = 5; // with this apporach will get error;
        //assigning const or reference member variables values in the body of the constructor is not sufficient.

        cout<< m_nValue <<endl;
    }
};
int main()
{
    Something s;

}
