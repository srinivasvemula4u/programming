#include<iostream>
#include<list>
#include<algorithm>
using namespace std;
int main()
{

    list<int> li;
    for(int i=0;i<6;i++)
        li.push_back(i);

    list<int>::const_iterator it;
    it = min_element(li.begin(),li.end());
        cout<< "min element="<<*it<<endl;

    it = max_element(li.begin(),li.end());
         cout<< "max element="<<*it<<endl;

}
