#include<iostream>

using namespace std;
template<typename T>
class smart_pointer
{
    T* m_pRawPointer;
public:
    smart_pointer(T *data):m_pRawPointer(data)
    {

    }
    ~smart_pointer()
    {
        delete m_pRawPointer;
    }
    // copy constructor
    smart_pointer (const smart_pointer & anotherSP);
    smart_pointer&  operator= (const smart_pointer& anotherSP);
    T& operator* ()const
    {
        return *(m_pRawPointer);
    }
    T* operator-> ()const
    {
        return m_pRawPointer;
    }
};
int main()
{

}
