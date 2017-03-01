#include<iostream>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;
template<typename T>
void displayContents(const T& obj)
{
    for(auto itr = obj.begin();itr != obj.end();itr++)
    cout<<*itr<<endl;
}
int main()
{
    vector<string> vecNames;
    vecNames.push_back ("John Doe");
    vecNames.push_back ("Jack Nicholson");
    vecNames.push_back ("Sean Penn");
    vecNames.push_back ("Anna Hoover");

    // insert a duplicate into the vector
     vecNames.push_back ("Jack Nicholson");
     displayContents(vecNames);
     sort(vecNames.begin(),vecNames.end());
     cout<< "Contents after sort" <<endl;
     displayContents(vecNames);
     bool searchResult = binary_search(vecNames.begin(),vecNames.end(),"John Doe");
     if(searchResult)
        cout<< "Name found" <<endl;
     // Erase adjacent duplicates
     auto itr = unique(vecNames.begin(),vecNames.end());
     cout<< "Contents after unique"<<endl;
     displayContents(vecNames);
     vecNames.erase(itr,vecNames.end());
      cout<< "Contents after erase"<<endl;
     displayContents(vecNames);
}
