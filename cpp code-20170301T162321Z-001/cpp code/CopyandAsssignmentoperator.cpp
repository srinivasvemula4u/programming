#include<iostream>

using namespace std;

class Cents
{
private:
    int m_nCents;
public:
    Cents(int nCents=0)
    {
        m_nCents = nCents;
    }

    // Copy constructor
    Cents(const Cents &cSource)
    {
        m_nCents = cSource.m_nCents;
    }
     Cents& operator= (const Cents &cSource);
};
Cents& Cents::operator= (const Cents &cSource)
{
     // check for self-assignment by comparing the address of the
    // implicit object and the parameter
    if (this == &cSource)
        return *this;

    // do the copy
    m_nCents = cSource.m_nCents;

    // return the existing object
    return *this;
}
int main()
{


}
