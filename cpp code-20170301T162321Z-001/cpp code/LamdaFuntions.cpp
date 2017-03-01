#include<iostream>
#include<vector>
#include<list>
#include<algorithm>

using namespace std;

int main()
{
    vector<int> vectIntegers;
    for(int i = 0; i< 10; i++)
        vectIntegers.push_back(i);
    list<char> listCharacters;
    for( int i ='a'; i < 'k'; i++)
        listCharacters.push_back(i);
    for_each(vectIntegers.begin(), vectIntegers.end(),[](int &i){ cout<< i;});
    cout<<endl;
    for_each(listCharacters.begin(),listCharacters.end(),[](const char& c ){cout<<c;});
    cout<<endl;
}
