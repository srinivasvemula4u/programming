#include<iostream>

using namespace std;

class Digit
{
private:
    int m_nDigit;
public:
    Digit(int nDigit=0)
    {
        m_nDigit = nDigit;
    }

    Digit& operator++(); // prefix
    Digit& operator--(); // prefix

    Digit operator++(int); // postfix
    Digit operator--(int); // postfix

    int GetDigit() const { return m_nDigit; }
};
Digit& Digit::operator++()
{
    if(m_nDigit == 9)
            m_nDigit = 0;
    else
        ++m_nDigit;
    return (*this);
}
Digit& Digit::operator--()
{
    if(m_nDigit == 9)
            m_nDigit = 0;
    else
        --m_nDigit;
    return (*this);
}
Digit Digit::operator++(int)
{
    Digit temp(m_nDigit);
    ++(*this);
    return temp;
}
Digit Digit::operator--(int)
{
    Digit temp(m_nDigit);
    --(*this);
    return temp;
}
int main()
{

    Digit cDigit(5);
    cout<< (++cDigit).GetDigit() <<endl; // calls Digit::operator++();
    cout<< (cDigit++).GetDigit() <<endl;  // calls Digit::operator++(int);
    cout<< (cDigit).GetDigit() <<endl;
    return 0;

}
