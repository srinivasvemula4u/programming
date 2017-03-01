#include<iostream>

using namespace std;
class IntList
{
private:
    int m_anList[10];
public:
   /* IntList()
    {
   m_anList[10]={0};

    }*/
    int& operator[] (const int nIndex);
};
int& IntList::operator[](const int index)
    {
        return m_anList[index];
    }
int main()
{
    IntList cMyList;
    //cMyList[2]= 3;
    cout<< cMyList[2] <<endl;


}
