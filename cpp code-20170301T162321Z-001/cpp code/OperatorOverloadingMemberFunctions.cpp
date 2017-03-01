
#include <iostream>

using namespace std;

class Cents
{
  private:
        int m_nCents;
  public:
     Cents(int nCents)
     {
          m_nCents = nCents;
     }
     Cents operator-();
     Cents operator+(int nCents);
     int GetCents() { return m_nCents; }
};
Cents Cents::operator-()
{
    return Cents(-m_nCents);
}
Cents Cents::operator+(int nCents)
{
    return Cents(m_nCents+nCents);
}
int main()
{
    Cents mCents(5);
    cout<< (-mCents).GetCents()<<endl;
    cout<<(mCents+10).GetCents()<<endl;
}
