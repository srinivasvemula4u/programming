#include<iostream>
#include<string>
#include<map>


using namespace std;

typedef map<int,string> MAP_INT_STRING;
typedef multimap<int,string> MMAP_INT_STRING;

int main()
{
    MAP_INT_STRING simplemap;
    simplemap.insert(MAP_INT_STRING::value_type(3,"Three"));
    simplemap.insert(make_pair(1,"one"));
    simplemap.insert(pair<int,string>(2,"two"));
    simplemap[4] = "four";

    MAP_INT_STRING::const_iterator mapiter = simplemap.begin();
    while(mapiter != simplemap.end())
    {
        cout<< mapiter->first <<" " <<mapiter->second<<endl;
        mapiter++;
    }
    MMAP_INT_STRING mmap(simplemap.begin(),simplemap.end());
    mmap.insert(MMAP_INT_STRING::value_type(1,"ONE"));
    mapiter = mmap.begin();
    while(mapiter != mmap.end())
    {
        cout<< mapiter->first <<" " <<mapiter->second<<endl;
        mapiter++;
    }
    cout << endl << "The multimap contains " << mmap.size ();
    multimap <int, string>::const_iterator iPairFound = mmap.find(1);
    if (iPairFound != mmap.end())
{
cout << "Key " << iPairFound->first << "points to Value: ";
cout << iPairFound->second << endl;
}
else
cout << "Sorry, pair with key "<<  "not in map" << endl;
}

