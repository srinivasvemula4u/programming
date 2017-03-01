#include<iostream>
#include<assert.h>

using namespace std;

template <typename T>
class Storage8
{
private:
    T m_tType[8];

public:
    void Set(int nIndex, const T &tType)
    {
        m_tType[nIndex] = tType;
    }

    const T& Get(int nIndex)
    {
        return m_tType[nIndex];
    }
};
int main()
{
    // Define a Storage8 for integers
    Storage8<int> cIntStorage;

    for (int nCount=0; nCount<8; nCount++)
        cIntStorage.Set(nCount, nCount);

    for (int nCount=0; nCount<8; nCount++)
        std::cout << cIntStorage.Get(nCount) << std::endl;

    // Define a Storage8 for bool
    Storage8<bool> cBoolStorage;
    for (int nCount=0; nCount<8; nCount++)
        cBoolStorage.Set(nCount, nCount & 3);

    for (int nCount=0; nCount<8; nCount++)
        std::cout << (cBoolStorage.Get(nCount) ? "true" : "false") << std::endl;

    return 0;
}
