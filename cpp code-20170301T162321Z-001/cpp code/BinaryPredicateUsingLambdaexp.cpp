#include<iostream>
#include<string>
#include<vector>
#include<algorithm>

using namespace std;

template<typename T>
void displayContents(const T& obj)
{
    for( auto itr = obj.begin(); itr != obj.end(); ++itr)
    {
        cout << *itr << endl;
    }
}
int main()
{
    vector<string> vecNames;
    vecNames.push_back ("jim");
    vecNames.push_back ("Jack");
    vecNames.push_back ("Sam");
    vecNames.push_back ("Anna");

    cout << "Vector Elements are" << endl;
    displayContents(vecNames);

    sort(vecNames.begin(),vecNames.end());

    cout << "Vector Elements after Default Sort" <<endl;
    displayContents(vecNames);

    sort(vecNames.begin(), vecNames.end(), [](const string& s1, const string& s2) -> bool
         {
             string Lowstr1;
             Lowstr1.resize(s1.size());
             transform(s1.begin(),s1.end(),Lowstr1.begin(),::tolower);
             string Lowstr2;
             Lowstr2.resize(s2.size());
             transform(s2.begin(),s2.end(),Lowstr2.begin(),::tolower);
             return (Lowstr1 < Lowstr2);
         });
    cout << "Vector Elements after predicate Sort" <<endl;
    displayContents(vecNames);



}
