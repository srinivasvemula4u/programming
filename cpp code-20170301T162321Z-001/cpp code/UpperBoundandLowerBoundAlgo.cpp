#include<iostream>
#include<string>
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
    list<string> listNames;
    // Insert sample values
    listNames.push_back ("John Doe");
    listNames.push_back ("Brad Pitt");
    listNames.push_back ("Jack Nicholson");
    listNames.push_back ("Sean Penn");
    listNames.push_back ("Anna Hoover");
    displayContents(listNames);
    listNames.sort();
    cout<< "List Names after sort" <<endl;
    displayContents(listNames);
    auto iMinInsertPos = lower_bound(listNames.begin(),listNames.end(),"Brad Pitt");
    cout << "Distance of lower bound ="<<distance(listNames.begin(),iMinInsertPos)<<endl;
    auto iMaxInsertPos = upper_bound(listNames.begin(),listNames.end(),"Brad Pitt");
    cout << "Distance of lower bound ="<<distance(listNames.begin(),iMaxInsertPos)<<endl;
    listNames.insert (iMinInsertPos, "Brad Pitt");
     cout<< "List Names after Insert" <<endl;
    displayContents(listNames);
}
