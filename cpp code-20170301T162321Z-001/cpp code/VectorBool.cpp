#include<iostream>
#include<vector>

using namespace std;

void display(vector<bool> boolVector)
{
    for(auto itr = boolVector.begin(); itr != boolVector.end(); itr++)
    {
        cout << *itr;
    }
    cout<<endl;
}
int main()
{
    vector<bool> boolVector(3);
    cout<<"Intial content of the vector = ";
    display(boolVector);
    boolVector.resize(3);
    boolVector[0]=(true);
    boolVector.push_back(false);
    boolVector.push_back(false);
    boolVector.push_back(true);
    cout << "Vector content after pushing operation";
    display(boolVector);
    boolVector.flip();
    cout<<"Vector content after flipped";
    display(boolVector);
}
