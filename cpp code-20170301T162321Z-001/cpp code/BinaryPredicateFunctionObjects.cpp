#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<ctype.h>
#include<string>
#include <locale>
//#include<>

using namespace std;

class CompareStringNoCase
{
public:
        bool operator()(const string &s1, const string &s2)
        {
            string str1Lower;
            str1Lower.resize(s1.size());
            transform(s1.begin(),s1.end(),str1Lower.begin(),::tolower);
            string str2Lower;
            str2Lower.resize(s2.size());
            transform(s2.begin(),s2.end(),str2Lower.begin(),::tolower);
            return (str1Lower < str2Lower);
        }
};
template<typename T>
void DisplayContents(const T& Input)
{
for(auto iElement = Input.cbegin() // auto, cbegin and cend: c++11
 ; iElement != Input.cend ()
 ; ++ iElement )
 cout << *iElement << endl;
}
int main()
{
    vector<string> vecNames;
    // Insert some sample names in to the vector
    vecNames.push_back ("jim");
    vecNames.push_back ("Jack");
    vecNames.push_back ("Sam");
     vecNames.push_back ("Anna");
     cout << "The names in vector in order of insertion: " << endl;
    DisplayContents(vecNames);
    cout << "Names after sorting using default std::less<>: " << endl;
    //sort()
    sort(vecNames.begin(), vecNames.end());
        DisplayContents(vecNames);
    cout << "Names after sorting using predicate that ignores case:" << endl;
    sort(vecNames.begin(), vecNames.end(), CompareStringNoCase());
    DisplayContents(vecNames);
}
