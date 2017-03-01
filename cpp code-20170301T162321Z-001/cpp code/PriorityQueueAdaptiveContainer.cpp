#include<iostream>
#include<queue>
#include<vector>
#include<list>
//#include<algorithm>
//#include<functional>
// By Default Priority queue uses vector.
using namespace std;

int main()
{
    priority_queue<int> intPriortyQueue;
    priority_queue<double> doublePriorityQueue;
    priority_queue<string,deque<string>> stringDequePriorityQueue;
   // priority_queue<double,list<double>,greater<double>> doubleDefinePridicatedListPriorityQueue; Not working Need to Check this
   priority_queue<int,deque<int>,greater<int>> intDequegreatePriortyQueue;
   priority_queue <int,vector<int>,greater<int>> pqIntegers;
   cout << "Inserting {10, 5, -1, 20} into the priority_queue" << endl;
   pqIntegers.push(10);
   pqIntegers.push(5);
   pqIntegers.push(-1);
   pqIntegers.push(20);
   cout << "Deleting the " << pqIntegers.size () << " elements" << endl;
   while(!pqIntegers.empty())
   {
    cout<< "Element to be deleted"<<pqIntegers.top()<<endl;
    pqIntegers.pop();
   }
}
