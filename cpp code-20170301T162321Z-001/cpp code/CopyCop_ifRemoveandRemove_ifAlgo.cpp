#include<iostream>
#include<vector>
#include<list>
#include<algorithm>

using namespace std;
template<typename T>
void displayContents(const T& obj)
{
    for(auto itr = obj.begin();itr != obj.end();itr++)
    cout<<*itr<<endl;
}
int main()
{

    list<int> listIntegers;
    for(int i = 0; i<10; i++)
        listIntegers.push_back(i);
    cout << " Contents of the List are" << endl;
     displayContents(listIntegers);
    vector<int> vectIntegers;
    vectIntegers.resize(listIntegers.size()*2);
    auto itr = copy(listIntegers.begin(),listIntegers.end(),vectIntegers.begin());
    cout << " Contents of the vectors are after copy" << endl;
    displayContents(vectIntegers);
    copy_if(listIntegers.begin(),listIntegers.end(),itr,[](const int &obj){ return (obj%2 == 1);});
    cout << " Contents of the vectors are after copy_if" << endl;
    displayContents(vectIntegers);
    auto inewEnd = remove(vectIntegers.begin(),vectIntegers.end(),0);
    cout << " Contents of the vectors are after remove" << endl;
    displayContents(vectIntegers);
    vectIntegers.erase(inewEnd,vectIntegers.end());
     cout << " Contents of the vectors are after erase" << endl;
    displayContents(vectIntegers);
    inewEnd = remove_if(vectIntegers.begin(),vectIntegers.end(),[](const int& obj){return (obj % 2 == 1);});
    cout << " Contents of the vectors are after remove_if" << endl;
    displayContents(vectIntegers);
    vectIntegers.erase(inewEnd,vectIntegers.end());
     cout << " Contents of the vectors are after erase" << endl;
    displayContents(vectIntegers);
}



