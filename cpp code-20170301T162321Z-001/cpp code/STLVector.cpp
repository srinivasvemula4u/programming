#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int> intVector;
    vector<int *> *intPointerVector;
    for(int i =0; i<10; i++)
    intPointerVector->push_back(&i);
    vector<int *>::iterator *vectorIter = intPointerVector->begin();
    while(*vectorIter != intPointerVector->end())
    {
        cout << **vectorIter <<endl;
        (*vectorIter)++;

    }
}
