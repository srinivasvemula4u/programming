/*We can use string characters as index and build a count array. Following is the algorithm.

1) Scan the string from left to right and construct the count array.
2) Again, scan the string from left to right and check for count of each
 character, if you find an element who's count is 1, return it.*/
 #include<iostream>
 #include<string>
 #include<vector>
 #define No_Of_Chars 256

using namespace std;
void BuildHashForString(string str,vector<int>& vecthash)
{  //cout<< "1" <<endl;
    string::iterator itr = str.begin();
    while( itr != str.end())
    {
        vecthash[static_cast<int>(*itr)] = vecthash[static_cast<int>(*itr)]+1;;
        itr++;
    }
    //cout<< "2" <<endl;
}

void  firstNonRepeating(string str)
{
    vector<int> vectHash(No_Of_Chars,0);
    BuildHashForString(str,vectHash);
    string::iterator itr = str.begin();
    while(itr != str.end())
    {
        if( vectHash[static_cast<int>(*itr)] == 1) {
            cout << "First Non repeating character in string = "<< *itr <<endl;
            break;
        }
        itr++;
    }
}

int main()
{
    firstNonRepeating("srinivas");
}
