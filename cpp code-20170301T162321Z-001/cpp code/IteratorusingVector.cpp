#include<iostream>
#include<vector>

using namespace std;

int main()
{

    vector<int> vect;
    for(int i=0; i<6; i++)
        vect.push_back(i);
    vector<int>::const_iterator it;
    it = vect.begin();
    while (it != vect.end()) // while it hasn't reach the end
        {
        cout << *it << " "; // print the value of the element it points to
        it++; // and iterate to the next element
        }
    cout << endl;
}
