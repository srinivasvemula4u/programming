#include<iostream>
#include<deque>
#include<vector>
#include<algorithm>
#include<functional>
#include<string>
using namespace std;

int main()
{
    string sample("THIS is a TEst string!");
    cout << "The sample string is: " << sample << endl;
    string LowerString;
    LowerString.resize(sample.size());
    transform(sample.begin(),sample.end(),LowerString.begin(),::tolower);
    cout<< "The lower case string ="<<LowerString <<endl;

    vector<int> vectIntegers1;
    vector<int> vectIntegers2;
    for(int i=0; i<10; i++)
    {
        vectIntegers1.push_back(i);
        vectIntegers2.push_back(10-i);
    }
    // A destination range for holding the result of addition
    deque<int> dqResultAddition;
    dqResultAddition.resize(vectIntegers1.size());
    transform(vectIntegers1.begin(),vectIntegers1.end(),vectIntegers2.begin(),dqResultAddition.begin(),plus<int>());
    cout << "Result of transform using binary function plus: " << endl;
    for(int index = 0; index <dqResultAddition.size(); index++)
        cout<< dqResultAddition[index] << endl;

}
