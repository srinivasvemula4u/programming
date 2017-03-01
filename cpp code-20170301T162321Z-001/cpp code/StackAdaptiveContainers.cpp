#include<iostream>
#include<stack>
#include<algorithm>
#include<vector>
#include<list>
#include<queue>
using namespace std;

int  main()
{
    stack<int> intStack;
    stack<double> doubleStack;
    stack<double,vector<double>> stackVectorDouble;
    stack<string,list<string>>  staackListStrings;
    stack<int> stackIntCopy(intStack);
    for(int i =0; i<10; i++)
        intStack.push(i);
    cout << "Stack Size = "<< intStack.size()<<endl;
    while(!intStack.empty()) {
        cout<<"Poping out element= "<<static_cast<int>(intStack.top())<<endl;
        intStack.pop(); }
    if(intStack.empty())
        cout<< "Stack is empty"<<endl;

}
