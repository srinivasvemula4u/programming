#include<iostream>
#include<string>
#include<list>
#include<algorithm>

int main()
{
    using namespace std;
    list<int> list1;

    list1.insert(list1.begin(),2);
    list1.insert(list1.begin(),1);

    list1.push_front(0);
    list1.push_back(3);
    list1.insert(list1.end(),4);
    list<int>::const_iterator Listitr = list1.begin();
    while( Listitr != list1.end())
    {
       cout<< *Listitr <<' ';
        Listitr++;
    }
    cout<<endl;
    list<int> list2;
    list2.insert(list2.begin(),4,5);
    Listitr = list2.begin();
    while( Listitr != list2.end())
    {
        cout<< *Listitr <<' ';
        Listitr++;
    }
    cout<<endl;
    list<int> list3;
    list3.insert(list3.begin(),list1.begin(),list1.end());
    list3.insert(list3.end(),list2.begin(),list2.end());
     Listitr = list3.begin();
     //cout<<endl;
    while( Listitr != list3.end())
    {
        cout<< *Listitr <<' ';
        Listitr++;
    }
    list3.pop_back();
    list3.pop_front();
    Listitr = list3.begin();
     cout<<endl;
    while( Listitr != list3.end())
    {
        cout<< *Listitr <<' ';
        Listitr++;
    }
}
