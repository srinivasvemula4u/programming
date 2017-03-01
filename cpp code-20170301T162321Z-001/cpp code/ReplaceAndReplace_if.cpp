#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
template<typename T>
void displayContents(const T& obj)
{
    for(auto itr = obj.begin();itr != obj.end();itr++)
    cout<<*itr<<endl;
}

int main()
{
    vector<int> vectIntegers(6);
    fill(vectIntegers.begin(),vectIntegers.begin()+3,8);
    fill_n(vectIntegers.begin()+3,3,5);
    displayContents(vectIntegers);
    //Shuffle the container
    random_shuffle(vectIntegers.begin(),vectIntegers.end());
    cout<< "Contents of the vector random shuffle" <<endl;
    displayContents(vectIntegers);
    cout << endl << "Using ‘std::replace’ to replace value 5 by 8" << endl;
    replace(vectIntegers.begin(),vectIntegers.end(),5,8);
    cout<< "Contents of the vector after replace" <<endl;
    displayContents(vectIntegers);
    replace_if(vectIntegers.begin(),vectIntegers.end(),[](const int & obj){ return (obj %2 == 0);},-1);
    cout<< "Contents of the vector after replace_if" <<endl;
    displayContents(vectIntegers);
}
