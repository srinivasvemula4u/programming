#include<iostream>
#include<string>
#include<vector>
#include<list>
#include<algorithm>

using namespace std;

template<typename T>
void displayContents(const T &obj)
{
    for(auto itr = obj.begin(); itr!= obj.end(); ++itr)
    {
        cout<< *itr << endl;
    }
}
int main()
{
    vector<int> vectIntgers;
    for(int i=-9; i<10; i++)
        vectIntgers.push_back(i);
    vectIntgers.push_back(9);
    vectIntgers.push_back(11);
    vectIntgers.push_back(9);
    cout << "The contents of the sample vector are: "<< endl;
    displayContents(vectIntgers);
    list<int> listIntegers;
    for(int i=-4; i<5; i++)
        listIntegers.push_back(i);
    cout << "The contents of the sample list are: "<< endl;
    displayContents(listIntegers);
    auto itr = search(vectIntgers.begin(),vectIntgers.end(),listIntegers.begin(),listIntegers.end());
    if(itr != vectIntgers.end())
    {
        cout << "Sequence in list found in vector at position: ";
        cout<< distance(vectIntgers.begin(),itr) <<endl;
    }
    cout << "Searching {9, 9, 9} in vector using search_n(): " << endl;
    auto partialItr = search_n(vectIntgers.begin(),vectIntgers.end(),3,9);
    if(partialItr != vectIntgers.end())
    {
        cout << "Sequence found in vector at position: ";
        cout<< distance(vectIntgers.begin(),partialItr) <<endl;
    }
    else
        cout<< "No pattern";

}
