#include<iostream>

using namespace std;

template<typename T>
class destructivecopy_pointer
{
    T* pObject;
public:
    destructivecopy_pointer(T* pInput):pObject(pInput)
    {

    }
    ~destructivecopy_pointer()
    {
        delete pObject;
    }
    // copy constructor
    destructivecopy_pointer(destructivecopy_pointer& source)
    {
        // Take ownership on copy
        pObject = source.pObject;
        // destroy source
        source.pObject = 0;
    }
    // copy assignment operator
    destructivecopy_pointer& operator= (destructivecopy_pointer& source)
    {
        if (pObject != source.pObject)
        {
            delete pObject;
            pObject = source.pObject;
            source.pObject = 0;
        }
    }
};
int main()
{
    destructivecopy_pointer<int> pNumber(new int);
    destructivecopy_pointer<int> pCopy = pNumber;
    //if(pNumber)
      //  cout<< "pNumber is Valid some thing worng" <<endl;
    ////else
       // cout << "Everything looks good so far go ahead"<<endl;
}
