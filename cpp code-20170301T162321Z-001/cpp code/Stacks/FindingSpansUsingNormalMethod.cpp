#include<iostream>
#include<vector>
using namespace std;

void FindingSpan(vector<int>& vectArr, vector<int>& vectSpan)
{
    int j;
    for(int i =0; i < vectArr.size(); i++)
    {
        j=1;
        while( (j <= i) && (vectArr[i] > vectArr[(i-j)]) ){
            j++;
        }
       vectSpan.push_back(j);
    }

}
int main()
{
    vector<int> vectSpan,vectArr;
    cout << "Enter Array Values " <<endl;
    for(int i =0; i < 5 ; i++)
    {
        int val;
        cin >> val;
        vectArr.push_back(val);
    }
     FindingSpan(vectArr,vectSpan);
    vector<int>::iterator itr = vectSpan.begin();
    while(itr != vectSpan.end())
    {
        cout << *itr << " ";
        itr++;
    }
    cout << endl;
}
