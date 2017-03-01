#include<iostream>
#include<set>

template<typename T>
struct SortDescending
{
    bool operator()(const T& lhs, const T& rhs)
    {
        return (lhs > rhs);
    }
};
int main()
{
    using namespace std;
    set<int> setIntegers;
    multiset<int> msetInt1;

    // set and multiset instantiated given a user-defined sort predicate
    set<int, SortDescending<int> > setIntegers2;
    multiset<int, SortDescending<int> > msetIntegers2;
   setIntegers.insert (60);
 setIntegers.insert (-1);
 setIntegers.insert (3000);
 cout << "Writing the contents of the set to the screen" << endl;
 cout<<"Set count = "<<setIntegers.count(3000);
 set<int>::const_iterator sitr = setIntegers.begin();
    // creating one set from another, or part of another container
    set<int> setIntegers3(setIntegers);
    multiset<int> msetIntegers3(setIntegers.begin(), setIntegers.end());
    return 0;

}
