#include<iostream>
#include<list>

using namespace std;

int main()
{
    list<int> li;
    for(int i =0; i<6; i++)
        li.push_back(i);
    list<int>::const_iterator it; // declare an iterator
    it = li.begin(); // assign it to the start of the list
    while (it != li.end()) // while it hasn't reach the end
    {
        cout << *it << " "; // print the value of the element it points to
        it++; // and iterate to the next element
    }

    cout << endl;
}
