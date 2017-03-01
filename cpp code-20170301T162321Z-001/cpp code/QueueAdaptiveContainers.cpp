#include<iostream>
#include<algorithm>
#include<queue>
#include<vector>
#include<list>

using namespace std;

int main()
{
    queue<int> intQueue;
    queue<double> doubleQueue;
    queue<int,vector<int>> queueintVector;
    queue<string,list<string>> queuestringlist;
    //queue<int>::iterator itr = intQueue.begin(); Not works with queues and stacks
    queue<int> qIntegers;
    cout << "Inserting {10, 5, -1, 20} into the queue" << endl;
   qIntegers.push(10);
   qIntegers.push(5);
   qIntegers.push(-1);
   qIntegers.push(20);
   cout << "Deleting the " << qIntegers.size () << " elements" << endl;
   while(!qIntegers.empty())
   {
    cout<< "Element to be deleted"<<qIntegers.front()<<endl;
    qIntegers.pop();
   }
}
