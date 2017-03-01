#include<iostream>
using namespace std;
class Value
{
private:
    int m_nValue;
public:
    Value(int nValue) { m_nValue = nValue; }
    friend bool IsEqual(const Value &cValue1, const Value &cValue2);
};

bool IsEqual(const Value &cValue1, const Value &cValue2)
{
    return (cValue1.m_nValue == cValue2.m_nValue);
}
main()
{
    Value c1(10);
    Value c2(10);
    cout<< IsEqual(c1,c2)<<endl;

}
