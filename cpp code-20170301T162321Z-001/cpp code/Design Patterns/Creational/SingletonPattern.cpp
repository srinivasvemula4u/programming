#include<iostream>

using namespace std;

class SingleTon
{
    static SingleTon* mSingleTon;
    SingleTon()
    {

    }
public:
        static SingleTon* GetInstance();
        void Access()
        {
            cout<< "This Method accessed using single ton object and object address="<<mSingleTon<<endl;
        }
};
SingleTon* SingleTon::mSingleTon = NULL;

SingleTon* SingleTon::GetInstance()
{
    if(!mSingleTon)
       mSingleTon=new SingleTon();
    return mSingleTon;
}
int main()
{
    SingleTon* cSingleTon = SingleTon::GetInstance();
    cSingleTon->Access();
    SingleTon* cAnotherSingleTon = SingleTon::GetInstance();
    cAnotherSingleTon->Access();

}
