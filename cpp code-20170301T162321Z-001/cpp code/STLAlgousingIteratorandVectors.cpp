#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main()
{
    vector<int> vectArray;

    //Insert elements into the array
    vectArray.push_back(10);
    vectArray.push_back(20);
    vectArray.push_back(30);
    vectArray.push_back(40);
    cout << "The contents of the vector are: " << endl;

   // vector<int>::const_iterator iter = vectArray.begin();
     auto iter = vectArray.begin();
    while(iter != vectArray.end())
    {
        cout<< *iter <<endl;
        iter++;
    }
    vector<int>::const_iterator iter1 = find(vectArray.begin(),vectArray.end(),30);
    if(iter1 != vectArray.end())
    {
        //int position = distance(vectArray.begin(),iter1);
        cout << "Value"<< *iter1;
       // cout << "found in the vector at position:" << Position << endl;

    }


}
